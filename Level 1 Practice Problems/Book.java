// Creating the Book class
public class Book {

    // Declaring attributes of the Book class
    private String title;
    private String author;
    private double price;

    // Adding a default constructor
    public Book() {
        // Initializing attributes with default values
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Adding a parameterized constructor
    public Book(String title, String author, double price) {
        // Assigning parameter values to class attributes
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Adding a method to display book details
    public void displayBookDetails() {
        // Printing the book details
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Adding the main method to test the Book class
    public static void main(String[] args) {
        // Creating a Book object using the default constructor
        Book defaultBook = new Book();
        System.out.println("Details of the default book:");
        defaultBook.displayBookDetails();

        // Creating a Book object using the parameterized constructor
        Book specificBook = new Book("The Alchemist", "Paulo Coelho", 12.99);
        System.out.println("\nDetails of the specific book:");
        specificBook.displayBookDetails();
    }
}

