// Create a method getMaximum(int a, int b) that returns the larger number

public class GetMaximum
{
    public static int GetMaximum(int a , int b)
    {
        if (a>b) {
            return a;
        }

        return b;
    }

    public static void main(String [] args) {
        int max = GetMaximum(23,44);
        System.out.println("Maximum : " + max);
    }
}
// OUTPUT :
// Maximum : 44