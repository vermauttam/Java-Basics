class A{
    void show(){
        System.out.println("Hello");
    }

    void show(int a){
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        A Aobj = new A();
        Aobj.show();
        Aobj.show(5);
    }
}