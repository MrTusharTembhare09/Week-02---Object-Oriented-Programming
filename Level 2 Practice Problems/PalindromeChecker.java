// Creating the PalindromeChecker class to check if a text is a palindrome
public class PalindromeChecker {

    // Declaring attribute to store the text
    private String text;

    // Creating a constructor to initialize the text attribute
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Checking if the text is a palindrome
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            // Comparing characters from start and end
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Returning false if characters don't match
            }
            start++;
            end--;
        }
        return true; // Returning true if all characters match
    }

    // Displaying the result of the palindrome check
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a PalindromeChecker object with sample text
        PalindromeChecker checker = new PalindromeChecker("madam");

        // Displaying the result of the palindrome check
        checker.displayResult();

        // Checking another text
        PalindromeChecker anotherChecker = new PalindromeChecker("hello");
        anotherChecker.displayResult();
    }
}

