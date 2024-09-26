import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        LinkedHashSet<String> shoppingList = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ", 2);
            String command = parts[0];
            String item = parts.length > 1 ? parts[1] : "";

            if (command.equals("ADD")) {
                shoppingList.add(item);
            } else if (command.equals("REMOVE")) {
                shoppingList.remove(item);
            }
        }

        System.out.println(String.join(", ", shoppingList));
        
        //..... YOUR CODE ENDS HERE .....
    }
}
