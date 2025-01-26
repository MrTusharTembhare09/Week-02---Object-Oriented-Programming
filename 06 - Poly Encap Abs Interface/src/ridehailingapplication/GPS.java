package ridehailingapplication;

// Interface: GPS
interface GPS {
    // Getting the current location of the vehicle
    String getCurrentLocation();

    // Updating the location of the vehicle
    void updateLocation(String newLocation);
}
