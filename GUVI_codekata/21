import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        int sum = 0;

        while (true) {
            try {
                String input = scanner.next();
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    continue;
                }
            } catch (Exception e) {
                break;
            }
        }

        System.out.println("Sum of entered integers: " + sum);
        scanner.close();
        
        //..... YOUR CODE ENDS HERE .....
    }
}
