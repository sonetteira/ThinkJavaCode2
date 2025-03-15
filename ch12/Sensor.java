import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sensor {
    public String name;
    public String description;
    public String units;

    public Sensor(String name) {
        this.name = name;
        // fill default values from API
        getAttrValues();
    }

    public Sensor(String name, String description, String units) {
        this.name = name;
        this.description = description;
        this.units = units;
    }

    public double getData() throws MalformedURLException, IOException, URISyntaxException {
        // read JSON data from API URI
        String json = APICall("https://colabprod01.pace.edu/api/influx/sensordata/Alan/" + name);
        // find sensor name in JSON
        int sensorIndex = findStringMatchIndex(json, this.name);
        // find decimal following name
        return findStringMatchDecimal(json, sensorIndex);
    }

    private void getAttrValues() {
        // read JSON data from API URI
        String json;
        try {
            json = APICall("https://colabprod01.pace.edu/api/v2/sensors/");
            // find sensor name in JSON
            int sensorIndex = findStringMatchIndex(json, "\"SensorName\":\"" + this.name + "\"");
            // find attribute values
            this.description = findStringMatch(json, "Description", sensorIndex);
            this.units = findStringMatch(json, "Units", sensorIndex);
        } catch (IOException | URISyntaxException e) {
            System.err.println("Attribute variables could not be found for this sensor");
            e.printStackTrace();
        }
        
    }

    private String APICall(String URL) throws MalformedURLException, IOException, URISyntaxException {
        // return JSON data from an API URL
        BufferedReader in = new BufferedReader(
            new InputStreamReader(
            new URI(URL).toURL().openStream()));

        String inputLine = in.readLine();
        in.close();
        return inputLine;
    }

    private int findStringMatchIndex(String json, String pattern) throws java.lang.IllegalStateException {
        // find sensor name in JSON
        Pattern namePattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher nameMatcher = namePattern.matcher(json);
        nameMatcher.find();
        return nameMatcher.start();
    }

    private double findStringMatchDecimal(String json, int startIndex) throws java.lang.IllegalStateException {
        Pattern decimalPattern = Pattern.compile("[\\d|\\.]+");
        Matcher decimalMatcher = decimalPattern.matcher(json);
        decimalMatcher.find(startIndex);
        // return as decimal
        return Double.parseDouble(json.substring(decimalMatcher.start(), decimalMatcher.end()));
    }

    private String findStringMatch(String json, String pattern, int startIndex) throws java.lang.IllegalStateException {
        // find the JSON value associated with the key matching a pattern
        // start at the given index
        Pattern stringPattern = Pattern.compile(pattern + "\":");
        Matcher stringMatcher = stringPattern.matcher(json);
        stringMatcher.find(startIndex);
        Pattern quotePattern = Pattern.compile("\"(.*?)\"");
        Matcher quoteMatcher = quotePattern.matcher(json);
        quoteMatcher.find(stringMatcher.end());
        // return as String without quotes
        return json.substring(quoteMatcher.start(), quoteMatcher.end()
            ).strip().replaceAll("^\"|\"$", "");
    }
}


