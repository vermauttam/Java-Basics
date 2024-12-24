public class ImpBubbleSort {
 
    public static void main(String[] args){
        int[] A = {60,10,30};
        int temp;

        for(int i=0;i<A.length;i++){
            boolean flag = false;
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = true;
                }
            }

            if(flag==false){
                break;
            }
        } 

        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}