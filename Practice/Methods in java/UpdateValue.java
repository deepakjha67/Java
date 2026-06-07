// Write a method updateValue(int x) and verify that the original variable in main() does not change

public class UpdateValue
{
    public static void UpdateValue(int x)
    {
        x = x+5;
        System.out.println("Inside Method: "+ x);
    }

    public static void main(String [] args)
    {
        int num = 25;
        UpdateValue(num);
        System.out.println("Inside main: " + num);
    }
}

// OUTPUT: 
// Inside Method: 30
// Inside main: 25