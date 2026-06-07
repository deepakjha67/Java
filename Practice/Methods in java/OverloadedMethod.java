// Create an overloaded method display() with one int parameter or one string parameter

public class OverloadedMethod 
{
    public static void display(int a){
        System.out.println("Integer value: " + a);
    }

    public static void display(String b){
        System.out.println("String value: " + b);
    }
    public static void main(String [] args)
    {
        display(22);
        display("Deepak");
    }
}
// OUTPUT :
// Integer value: 22
// String value: Deepak