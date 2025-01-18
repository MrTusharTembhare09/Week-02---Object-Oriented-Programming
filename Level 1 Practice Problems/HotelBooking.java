// Creating the HotelBooking class
public class HotelBooking {

    // Declaring attributes for the class
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    // Initializing with default values
    public HotelBooking() {
        this.guestName = "Guest Name Not Provided";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    // Initializing with specific values provided by the user
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    // Creating a new object by copying values from another HotelBooking object
    public HotelBooking(HotelBooking anotherBooking) {
        this.guestName = anotherBooking.guestName;
        this.roomType = anotherBooking.roomType;
        this.nights = anotherBooking.nights;
    }

    // Adding method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating a HotelBooking object using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingDetails();

        // Creating a HotelBooking object using parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayBookingDetails();

        // Creating a HotelBooking object using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingDetails();
    }
}
