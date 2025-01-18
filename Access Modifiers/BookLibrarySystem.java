// Creating the Book class
class Book {

    // Instance variables with different access modifiers
    public String ISBN; // Public: accessible from anywhere
    protected String title; // Protected: accessible within the same package and subclasses
    private String author; // Private: accessible only within this class

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Creating the EBook subclass
class EBook extends Book {

    // Constructor to initialize ebook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Calling the parent class constructor
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN); // Accessing public member
        System.out.println("EBook Title: " + title); // Accessing protected member
    }
}

// Main class to test the functionality
public class BookLibrarySystem {

    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("123-4567891234", "Java Programming", "John Doe");
        book.displayBookDetails();

        // Modifying and accessing the author using public methods
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        // Creating an EBook object
        EBook ebook = new EBook("987-6543219876", "Learn Python", "Alice Johnson");
        ebook.displayEBookDetails();
    }
}

