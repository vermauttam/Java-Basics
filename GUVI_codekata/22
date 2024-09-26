import java.util.Scanner;

class UnderageException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public UnderageException(String message) {
        super(message);
    }
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new UnderageException("UnderageException: Age " + age + " is below the legal age limit.");
            } else {
                System.out.println("Age verification successful.");
            }
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
