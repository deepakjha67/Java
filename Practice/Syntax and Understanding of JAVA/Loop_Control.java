public class Loop_Control
{
    public static void main (String [] args)
    {

// Stops at 4    

        for (int testcase = 1; testcase <= 6; testcase++) {
            if (testcase == 4) {
                break;
            }

            System.out.println(testcase);
        }

// Skips 3

        for (int day = 1; day<=5; day++) {
            if (day == 3) {
                continue;
            }
            System.out.println(day);
        }
        




        
    }
}