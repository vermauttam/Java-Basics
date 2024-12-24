class A{
    void show(){
        System.out.println("Hello");
    }
}

class B extends A{
    @Override
    void show(){
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        A Aobj = new A();
        Aobj.show();
        B Bobj = new B();
        Bobj.show();
    }
}