class SelectionSort {
    public static void main(String[] args) {
        int[] A = {5,6,2,1,3,4};
        int min, temp=0;

        for(int i=0;i<A.length;i++){
            min = i;
            for(int j=i+1;j<A.length;j++){
                if(A[j] < A[min]){
                    min=j;
                }
            }
                temp = A[min];
                A[min] = A[i];
                A[i] = temp;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}