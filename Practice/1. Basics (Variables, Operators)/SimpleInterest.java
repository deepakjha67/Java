import java.util.Scanner;
public class SimpleInterest {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal, Rate, Time: ");

        double principal = input.nextDouble();
        double Rate = input.nextDouble();
        double Time = input.nextDouble();

        double si = (principal*Time*Rate)/100;

        System.out.println("Simple interest: " + si);
        input.close();

    }

    
}
/*
Output :
Enter the principal, Rate, Time: 
2
3
4
Simple interest: 0.24
*/
