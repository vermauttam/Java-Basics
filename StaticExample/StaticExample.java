public class StaticExample {
    static int counter = 0;

    static {
        System.out.println("Static block has been executed."); 
        counter = 10;
    }

    static void displayCounter(){
        System.out.println("Value of counter is " + counter);
    }

    public static void main(String[] args){
        displayCounter();
    }
}
