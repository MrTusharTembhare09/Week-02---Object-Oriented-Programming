import java.util.ArrayList;

// Define the Book class with attributes such as title and author
class Book {
    private String title;
    private String author;

    // Constructor to initialize the Book object with title and author
    // Adding a new book with a specific title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Method to display the book details
    // Displaying the details of a specific book
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Define the Library class with an ArrayList of Book objects (Aggregation relationship)
class Library {
    private String name;
    private ArrayList<Book> books; // List to store books in the library

    // Constructor to initialize the library with a name
    // Adding a new library with a specific name
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Initialize the books list
    }

    // Method to add a book to the library's collection
    // Adding a book to the library's collection of books
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display the library's details along with the books
    // Displaying the details of the library and its books
    public void displayLibraryDetails() {
        System.out.println("Library: " + name);
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayBookDetails(); // Display details of each book
        }
    }
}

// Main class to demonstrate the aggregation relationship
public class LibraryAndBooksApp {
    public static void main(String[] args) {
        // Adding new books (Books can exist independently of a specific Library)
        Book book1 = new Book("1984", "George Orwell");  // Creating book 1
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");  // Creating book 2
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");  // Creating book 3
        Book book4 = new Book("Moby Dick", "Herman Melville");  // Creating book 4

        // Adding libraries (Libraries aggregate Book objects)
        Library library1 = new Library("Central Library");  // Creating library 1
        Library library2 = new Library("Community Library");  // Creating library 2

        // Adding books to different libraries to demonstrate the aggregation
        library1.addBook(book1);  // Adding book1 to library1
        library1.addBook(book2);  // Adding book2 to library1
        library2.addBook(book3);  // Adding book3 to library2
        library2.addBook(book4);  // Adding book4 to library2

        // Displaying details of each library and their books
        library1.displayLibraryDetails();  // Displaying library 1's details
        System.out.println();
        library2.displayLibraryDetails();  // Displaying library 2's details
    }
}
