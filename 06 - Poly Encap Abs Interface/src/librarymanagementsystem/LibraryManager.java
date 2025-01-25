package librarymanagementsystem;

// Utility Class: LibraryManager
import java.util.*;

class LibraryManager {
    private List<LibraryItem> items = new ArrayList<>();

    // Adding a library item to the system
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Processing and displaying details for all library items
    public void processItems() {
        // Iterating through each item in the library
        for (LibraryItem item : items) {
            // Displaying item details
            item.getItemDetails();

            // Calculating and displaying loan duration
            System.out.println("Loan Duration (days): " + item.getLoanDuration());

            // Checking and displaying availability if item is reservable
            if (item instanceof Reservable) {
                boolean available = ((Reservable) item).checkAvailability();
                System.out.println("Is Available: " + available);
            }
            System.out.println("-----------------------------------");
        }
    }
}
