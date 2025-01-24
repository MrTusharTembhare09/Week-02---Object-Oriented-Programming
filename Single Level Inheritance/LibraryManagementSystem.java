// Defining the base class Book
class Book {
    String title;
    int publicationYear;

    // Adding constructor to initialize Book attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Defining a method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Defining the subclass Author
class Author extends Book {
    String name;
    String bio;

    // Adding constructor to initialize Author attributes
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo() method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to demonstrate the Book and Author system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating an Author object
        Author author = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");

        // Displaying book and author details
        System.out.println("Book and Author Details:");
        System.out.println("-------------------------");
        author.displayInfo();
    }
}