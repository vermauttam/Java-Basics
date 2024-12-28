class Main{
    public static int[] arrayNumbers(){
        return new int[]{1,2,3,4,5};
    }
    public static void main(String[] args){
        int[] numbers  = arrayNumbers();
        for(int number : numbers){
            System.out.println(number);
        }
    }
}