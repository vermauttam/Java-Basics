class Main {
    String name;
    Main(){
        this.name = "Uttam";
    }
    
    void show(){
        System.out.println("Initialized "+name+" using the constructor");
    }
    public static void main(String[] args){
        Main main = new Main();
        main.show();
    }
}