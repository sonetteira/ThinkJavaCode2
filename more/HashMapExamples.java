import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, String> contactsList = new HashMap<String, String>();

        contactsList.put("Work", "800-874-PACE");
        contactsList.put("Ed Media", "914-773-3338");
        contactsList.put("NOT Ed Media", "914-773-3388");

        // contactsList.put("Work", "test");

        System.out.println(contactsList); 
        // {NOT Ed Media=914-773-3388, Ed Media=914-773-3338, Work=test}

        // contactsList.get("NOT Ed Media");
        // contactsList.remove("Work");

        // for(String contact : contactsList.keySet()) {
        //     // just the keys: contact names
        //     System.out.println(contact);
        // }

        // System.out.println();

        // for(String phoneNum : contactsList.values()) {
        //     // just the keys: phone numbers
        //     System.out.println(phoneNum);
        // }

        // System.out.println();

        // for(String contact : contactsList.keySet()) {
        //     // use keyset to get everything
        //     System.out.printf("%s: %s\n", contact, contactsList.get(contact));
        // }


        // HashMap<String, WaterSensor> sensors = new HashMap<String, WaterSensor>();
        
        // sensors.put("temp", new WaterSensor("Temperature", "deg C", -100.0, 100.0));
        // sensors.put("pH", new WaterSensor("pH", null, -7.0, 7.0));
        // sensors.put("Cond", new WaterSensor("Conductivity", "mS/cm", 0.0, 54000.0));
        // sensors.put("DOpct", new WaterSensor("Dissolved Oxygen %", "% saturation", 0.0, 300.0));

        HashMap<String, Double> prices = new HashMap<>();
        prices.put("water bottle", 3.99);
        prices.put("corn muffin", 2.69);

        HashSet<String> names = new HashSet<>();
        names.add("Jewel");
        names.add("Willow");
        names.add("Daniella");
        names.add("Mistery");
        names.add("Danika");

        Hashtable<String, String> schedule = new Hashtable<>();
        schedule.put("Monday 9:00", "Math");
        schedule.put("Monday 10:00", "Science");
        schedule.put("Tuesday 9:30", "History");

        "Monday 9:00".hashCode();
        
    }
}
    
class WaterSensor {
    private String name;
    private String unit;
    private double upperLimit;
    private double lowerLimit;

    public WaterSensor(String name, String unit, double upperLimit, double lowerLimit) {
        this.name = name;
        this.unit = unit;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
}

