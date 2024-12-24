class Main {
    static String name;
    
    static{
        name = "Uttam";
        System.out.println("Name initialized to " + name + " using static block");  // Method 1
    }
    
    static void displayName(){
        name = "Lalit";
        System.out.println("Name initialized to " + name + " using static method");  // Method 2
    }
    
    public static void main(String[] args){
        displayName();                                              // Called directly from main static method without refering to class
        Main.displayName();                                             // Called directly from main static method  refering to class
                                                                  //Also note that static block will be executed once only 
    }
} 