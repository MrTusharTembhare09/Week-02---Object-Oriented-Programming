package librarymanagementsystem;

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor for initializing Magazine attributes
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Overriding method to provide loan duration for magazines
    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    // Reserving the magazine
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Reserving: " + getTitle());
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    // Checking availability of the magazine
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
