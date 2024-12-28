class Main{
    public static String getGreeting(String name){
        return "Hello " + name;
    }
    public static void main(String[] args){
        String gotGreeting = getGreeting("Uttam");
        System.out.println(gotGreeting);
    }
}