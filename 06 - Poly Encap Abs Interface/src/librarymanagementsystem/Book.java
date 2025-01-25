package librarymanagementsystem;

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor for initializing Book attributes
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Overriding method to provide loan duration for books
    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    // Reserving the book
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Reserving: " + getTitle());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    // Checking availability of the book
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
