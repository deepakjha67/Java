import java.util.Scanner;
public class SumOfArray {
    static void main (){

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;
        int n = arr.length;

        for(int i = 0; i <= n-1; i++) {
            int value = arr[i];
            sum = sum + value;
        }


        // Sum is ready to print:
        System.out.println("Sum of the Array: " + sum);
    }
}
/*
Output:
Sum of the Array: 150
*/
    