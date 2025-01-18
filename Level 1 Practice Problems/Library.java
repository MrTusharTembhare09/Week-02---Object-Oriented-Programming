// Creating the Book class
public class Library {

    // Declaring attributes for the class
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor
    // Initializing with default values
    public Library() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.availability = true; // By default, the book is available
    }

    // Parameterized constructor
    // Initializing with specific values provided by the user
    public Library(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Adding method to borrow a book
    // Updating availability when a book is borrowed
    public void borrowBook() {
        // Calculating if the book is available for borrowing
        if (availability) {
            availability = false; // Marking the book as borrowed
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book " + title + " is currently unavailable.");
        }
    }

    // Adding method to return a book
    // Updating availability when a book is returned
    public void returnBook() {
        availability = true; // Marking the book as available again
        System.out.println("You have successfully returned the book: " + title);
    }

    // Adding method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating a Book object using parameterized constructor
        Library book1 = new Library("Java Programming", "John Doe", 29.99, true);
        book1.displayBookDetails();

        // Borrowing the book
        book1.borrowBook();
        book1.displayBookDetails();

        // Returning the book
        book1.returnBook();
        book1.displayBookDetails();
    }
}

