import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        for(int i = n-1; i>=0;i--){
            System.out.println("reverse of array is: " + A[i]);
        }


    }

} 