import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] A = new int[rows][cols];
        int max = 0;
        System.out.println("Enter the elemenst of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
    
        System.out.println("Maximum element of given array is " + max);


    }
}







