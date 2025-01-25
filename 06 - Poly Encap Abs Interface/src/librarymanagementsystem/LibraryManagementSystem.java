package librarymanagementsystem;

// Main Class: LibraryManagementSystem
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of LibraryManager
        LibraryManager manager = new LibraryManager();

        // Adding a book to the library
        Book book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        manager.addItem(book);

        // Adding a magazine to the library
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        manager.addItem(magazine);

        // Adding a DVD to the library
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");
        manager.addItem(dvd);

        // Processing and displaying all library items
        manager.processItems();
    }
}
