class Main {
    String name;
    
    void show(){
        this.name = "Uttam";
        System.out.println("Initialized " +name + " using the instance method ");
    }
    public static void main(String[] args){
        Main main = new Main();
        main.show();
    }
}