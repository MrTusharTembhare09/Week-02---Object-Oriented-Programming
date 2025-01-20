class Book {
    static String LibraryName = "Global Library";
	
	public static void displayLibraryName() {
	    System.out.println(LibraryName);
	}
	
	String title;
	String author;
	final int isbn;
	
	// Constructor to initialize book details
	public Book(String title, String author, int isbn) {
	    this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	// Instance method to display account details
	public void displayDetails() {
	    if(this instanceof Book) {
		    System.out.println("Title : " + title);
		    System.out.println("Author Name : " + author);
		    System.out.println("ISBN  : " + isbn);
		}
		else {
		    System.out.println("Object is not an instance of Book.");
		}  
	}
}
		
public class LibraryManagementSystem {
    public static void main(String[] args) {
	   // Creating Book objects
	   Book b1 = new Book("Bharat", "Kumar", 123);
	   Book b2 = new Book("India", "Rajshekhar", 100);
	   
	   // Displaying book details
	   b1.displayDetails();
	   b2.displayDetails();  
	   
	   // Displaying the library name using a static method
	   Book.displayLibraryName();
	}
}