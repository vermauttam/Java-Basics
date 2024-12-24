class Main {
    
    String instanceVar;
    
    {
        instanceVar = "Uttam";
    }
    
    void show(){
        System.out.println("Instance Variable initialized to " + instanceVar + " using instance block");
    }
    public static void main(String[] args){
        Main main = new Main();
        main.show();
    }
}

/*class Main {
    
    String instanceVar;
    {
        instanceVar = "Uttam";
        System.out.println(instanceVar);
    }
    public static void main(String[] args){
        Main main = new Main();
    }
}
     */
