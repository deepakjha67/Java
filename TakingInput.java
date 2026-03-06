// Taking input from the user
import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b= scanner.nextInt();

        String name = scanner.next();

        System.out.println("Sum: " + (a+b) + " " + name );

    }
    
}
// Output:
// 2
// 6
// Hello 
// Sum: 8 Hello
