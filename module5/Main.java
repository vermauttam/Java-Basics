public class Main
{
    public static void main(String args[])
    {
        int myInt = 15;
        double myFloat = (double) myInt;  //double myFloat = (double) myInt is not required in Widening casting 
        double myFloat = myInt;      // This will also give the same result as above
        System.out.println(myFloat);
    }
}
