public class Main {
    public static void main(String[] args){

        int[][] A = {{10,20,30},{40,50,60}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}