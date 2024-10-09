import java.util.Scanner;

public class Main {
        public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of array: ");
              int n = sc.nextInt();
              int[] A = new int[n];
              System.out.println("Enter the Elements of array:");
              for(int i=0; i<A.length; i++) {
                A[i] = sc.nextInt();
              }

              for(int i=0; i<A.length; i++) {
                System.out.println("Elements are: "+ A[i]);
              }

              sc.close();
        }
}















