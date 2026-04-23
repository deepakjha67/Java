import java.util.Scanner;

public class LargestNumber
{
    public static void main (String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number = " + max);

        sc.close();
    }
}
/*
Output :
Enter the 3 numbers : 
3
2
5
Largest number = 5
*/
