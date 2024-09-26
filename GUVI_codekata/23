import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index " + index + " out of bounds for length " + n);
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
