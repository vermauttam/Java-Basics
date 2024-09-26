import java.util.*;

public class Main {
    public static void main(String[] args) {
       //..... YOUR CODE STARTS HERE .....
       
       Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       
       //..... YOUR CODE ENDS HERE .....
    }
}
