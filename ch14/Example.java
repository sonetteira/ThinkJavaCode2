class Tree {
    private double latitude;
    private double longitude;
    private String species;
    private int diameter;

    public Tree(double lat, double lon, String species, int diameter) {
        this.latitude = lat;
        this.longitude = lon;
        this.species = species;
        this.diameter = diameter;
    }

    public double getLat() {
        return latitude;
    }
    public double getLong() {
        return longitude;
    }
    public String getSpecies() {
        return species;
    }
    public int getDiameter() {
        return diameter;
    }

}

class Maple extends Tree {
    public Maple(double lat, double lon, int diameter) {
        super(lat, lon, "maple", diameter);
    }

    public int taps() {
        // how many taps will this tree support
        if(getDiameter() > 25) {
            return 3;
        }
        if(getDiameter() > 20) {
            return 2;
        }
        if(getDiameter() > 10) {
            return 1;
        }
        return 0;
    }
}

public class Example {
    
    public static void main(String[] args) {
        Tree aTree = new Maple(40.1, 50.6, 30);

        Object anythingAtAll;
        
    }
}

