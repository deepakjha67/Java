import java.util.Scanner;
public class Conditionals 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total solved question: ");
        int dailyPracticeProblems = sc.nextInt();
        
        if (dailyPracticeProblems >= 20){
            System.out.println("Very Good");
        } else {
            System.out.println("Practice more");
        }
    }
}
