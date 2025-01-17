class Book {

    // Defining the attributes for book
    String title;
    String author;
    double price;


    // Defining the constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Displaying all the details of book
    void displayDetails() {
        System.out.println("Title of a book : " + title);
        System.out.println("Author name : " + author);
        System.out.println("Book price : " + price);
    }
}

public class Book03 {
    public static void main(String[] args) {
        // Creating an object for Book class
        Book b1 = new Book("How to add multiple experiences on Linkedin?", "Vinay G", 480.24);
        b1.displayDetails();
    }
}
