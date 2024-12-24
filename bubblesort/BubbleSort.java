public class BubbleSort {
    public static void main(String[] args){
        int[] A = {50,10,60,20,30,40,70,5,15,35,};
        int temp;

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-1;j++){
                if(A[j] > A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }

            }
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}