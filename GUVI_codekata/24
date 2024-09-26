import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        try {
            String dividendInput = scanner.next();
            String divisorInput = scanner.next();

            int dividend = Integer.parseInt(dividendInput);
            int divisor = Integer.parseInt(divisorInput);

            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
