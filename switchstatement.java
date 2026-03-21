import java.util.Scanner; //

public class switchstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //

        // 1. Get numbers from the user
        System.out.println("Give me a number: ");
        int x = scanner.nextInt(); //

        System.out.println("Give me another number: ");
        int y = scanner.nextInt(); //

        // 2. Get the operation character from the user
        System.out.println("Enter a symbol (+, -, *): ");
        // Grabbing the very first character the user types
        char ch = scanner.next().charAt(0); //

        // Initialize result to 0 to prevent uninitialized errors
        int result = 0; //

        // 3. The Switch Statement
        switch (ch) { //
            case '+': //
                result = x + y; //
                break; // STOPS execution from falling through to subtraction

            case '-': //
                result = x - y; //
                break; //

            case '*': //
                result = x * y; //
                break; //

            default: // Runs if the user enters something invalid like '/' or 'a'
                System.out.println("Invalid option selected!"); //
                break;
        }

        // 4. Print the final calculated result
        System.out.println("The value of result is: " + result); //
    }
}

// Output :
// Give me a number: 
// 5
// Give me another number: 
// 7
// Enter a symbol (+, -, *): 
// +
// The value of result is: 12
