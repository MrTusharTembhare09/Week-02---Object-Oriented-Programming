// Creating the MovieTicket class to manage ticket booking
public class MovieTicket {

    // Declaring attributes for the movie ticket
    private String movieName;
    private String seatNumber;
    private double price;

    // Creating a constructor to initialize the movie ticket attributes
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = ""; // Seat number is empty initially
        this.price = 0.0; // Price is zero initially
    }

    // Booking a ticket by assigning seat and updating price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName);
    }

    // Displaying the ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a MovieTicket object for a movie
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");

        // Booking the ticket
        ticket.bookTicket("A10", 250.00);

        // Displaying the ticket details
        ticket.displayTicketDetails();
    }
}