package librarymanagementsystem;

// Abstract Class: LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor for initializing library item attributes
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getting item ID
    public String getItemId() {
        return itemId;
    }

    // Setting item ID
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    // Getting item title
    public String getTitle() {
        return title;
    }

    // Setting item title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getting item author
    public String getAuthor() {
        return author;
    }

    // Setting item author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method for getting loan duration
    public abstract int getLoanDuration();

    // Getting item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
