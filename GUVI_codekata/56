import java.util.Scanner;

//..... YOUR CODE STARTS HERE .....
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Choose the type of first value (Integer/String):");
        String type1 = scanner.next();
      //  System.out.println("Enter the first value:");
        Object value1;
        if (type1.equalsIgnoreCase("Integer")) {
            value1 = scanner.nextInt();
        } else {
            scanner.nextLine(); // Consume the newline character
            value1 = scanner.nextLine();
        }

      //  System.out.println("Choose the type of second value (Integer/String):");
        String type2 = scanner.next();
     //   System.out.println("Enter the second value:");
        Object value2;
        if (type2.equalsIgnoreCase("Integer")) {
            value2 = scanner.nextInt();
        } else {
            scanner.nextLine(); // Consume the newline character
            value2 = scanner.nextLine();
        }

        Pair<Object, Object> pair = new Pair<>(value1, value2);
        pair.printPair("Original Pair");
        pair.swap();
        pair.printPair("Swapped Pair");
    }
}



class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void swap() {
        Object temp = first;
        first = (T) second;
        second = (U) temp;
    }

    public void printPair(String message) {
        System.out.println(message + ": (" + first + ", " + second + ")");
    }
}

//..... YOUR CODE ENDS HERE .....
