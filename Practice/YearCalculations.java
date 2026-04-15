import java.util.Scanner;
public class YearCalculations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");

        int Days = sc.nextInt();
        
        int Years = Days/365;
        int weeks = (Days % 365) / 7;
        int remainingDays = Days%7;

        System.out.println( Years + " Years");
        System.out.println(weeks + " Weeks");
        System.out.println(remainingDays + " Remaining Days");
        sc.close();
    }
}
/*
Output: 
Enter days: 
745
2 Years
2 Weeks
3 Remaining Days
*/
