import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
         Scanner scanner = new Scanner(System.in);
        
        // Input: Read the number of hexadecimal numbers
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Input: Read the space-separated hexadecimal strings
        String[] hexNumbers = scanner.nextLine().split(" ");
        
        int sum = 0; // Variable to hold the sum of hexadecimal numbers
        
        // Convert each hexadecimal string to an integer and compute the sum
        for (String hex : hexNumbers) {
            sum += Integer.parseInt(hex, 16); // Convert hex string to integer
        }
        
        // Output the sum as a hexadecimal string (without 0x prefix)
        System.out.println(Integer.toHexString(sum)); // Convert sum to hex string
        
        // Close the scanner
        scanner.close();
        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
