package Amazing;

// This is a simple Java program to determine if a number is Even or Odd
public class EvenVsOddFinder {
    public static void main(String[] args) {

        // Step 1: Declare an integer variable 'n' and initialize it with a value
        int n = 17; // You can change this value to test with other numbers

        // Step 2: Define an array of Strings with "Even" and "Odd" as values
        // The index 0 corresponds to "Even" and index 1 corresponds to "Odd"
        String[] res = {"Even", "Odd"};

        // Step 3: Use modulo operator (%) to determine even or odd
        // n % 2 gives either 0 or 1:
        // If n is even, n % 2 = 0 (which maps to res[0] -> "Even")
        // If n is odd, n % 2 = 1 (which maps to res[1] -> "Odd")
        System.out.println(res[n % 2]);

        // Step 4: Print the result. Since n = 17, 17 % 2 = 1,
        // so res[1] = "Odd" will be printed.
    }
}
