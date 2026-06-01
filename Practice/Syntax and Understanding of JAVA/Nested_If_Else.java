import java.util.Scanner;

public class Nested_If_Else
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);

        boolean HasSubscription = false;

        System.out.println("Enter the Numbers of problems that are solved: ");

        int ProblemSolved = sc.nextInt(); 
        
        if (HasSubscription) {
            if (ProblemSolved <= 10) {
                System.out.println("Need Progress");

            }else if (ProblemSolved <= 15) {
                System.out.println("Good ");

            } else {
                System.out.println("Very good");

            }

        }
        else {
            System.out.println("Need to upgrade");
        }

        }
    }
