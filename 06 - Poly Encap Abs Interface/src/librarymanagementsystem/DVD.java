package librarymanagementsystem;

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor for initializing DVD attributes
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Overriding method to provide loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    // Reserving the DVD
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Reserving: " + getTitle());
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    // Checking availability of the DVD
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}