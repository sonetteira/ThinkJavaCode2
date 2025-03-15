import java.io.IOException;
import java.net.URISyntaxException;

public class TestSensor {
    public static void main(String[] args) {
        Sensor ph = new Sensor("pH");
        Sensor DO = new Sensor("DOpct");
        try {
            System.out.printf("PH details\nDesc: %s\nUnits: %s\nPH value: %.2f\n", 
            ph.description, ph.units, ph.getData());
            System.out.println();
            System.out.printf("Dissolved Oxygen details\nDesc: %s\nUnits: %s\nDO value: %.2f\n", 
            DO.description, DO.units, DO.getData());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
