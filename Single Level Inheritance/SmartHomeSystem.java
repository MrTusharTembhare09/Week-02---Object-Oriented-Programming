// Defining the base class Device
class Device {
    String deviceId;
    String status;

    // Adding constructor to initialize Device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Defining a method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Defining the subclass Thermostat
class Thermostat extends Device {
    double temperatureSetting;

    // Adding constructor to initialize Thermostat attributes
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus() method to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to demonstrate the Smart Home Devices system
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat("T1001", "Active", 22.5);

        // Displaying thermostat details
        System.out.println("Smart Home Device Details:");
        System.out.println("---------------------------");
        thermostat.displayStatus();
    }
}
