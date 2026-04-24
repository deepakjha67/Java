// Positive, negative or zero

import java.util.Scanner;

public class Numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        if (a>0) System.out.println("positive");

        else if (a<0) System.out.println("Negative");
        else System.out.println("Zero");
        sc.close();
    }
}

/*
Output :
Enter the number: 
67 
positive
*/
