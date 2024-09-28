import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Sorter<T> {
   //..... YOUR CODE STARTS HERE .....
    
    public void sort(T[] array, Comparator<T> comparator) {
        Arrays.sort(array, comparator);
    }
   //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
    
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Choose the type of array (Integer/String):");
        String type = scanner.next();
        scanner.nextLine(); // Add this line to consume the newline character

        if (type.equalsIgnoreCase("Integer")) {
          //  System.out.println("Enter the integers:");
            Integer[] integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            Sorter<Integer> integerSorter = new Sorter<>();
            integerSorter.sort(integers, Integer::compare);
            System.out.println("Sorted Integer Array: " + Arrays.toString(integers));
        } else if (type.equalsIgnoreCase("String")) {
         //   System.out.println("Enter the strings:");
            String[] strings = scanner.nextLine().split(" ");
            Sorter<String> stringSorter = new Sorter<>();
            stringSorter.sort(strings, String::compareTo);
            System.out.println("Sorted String Array: " + Arrays.toString(strings));
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
