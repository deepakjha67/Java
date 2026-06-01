// A Loop inside another loop is called Nested Loop

public class Nested_Loop
{
    public static void main (String [] args )
    {

// Print a small square pattern

        for (int row = 1; row <=3; row++) {
            for (int col = 1; col <=3; col++) {
                System.out.print("* ");
            }
           System.out.println();
        }   
    }
}