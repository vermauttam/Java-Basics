import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        
        for (int number : numbers) {
            if (number % 2 != 0) {
                odds.add(number);
            } else {
                evens.add(number);
            }
        }
        
        odds.addAll(evens);
        
        for (int num : odds) {
            System.out.print(num + " ");
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
