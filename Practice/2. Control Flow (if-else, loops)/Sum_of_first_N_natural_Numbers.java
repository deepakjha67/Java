import java.util.Scanner;

public class Sum_of_first_N_natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
/*
Output: 
Enter N: 5
Sum = 15
 */
