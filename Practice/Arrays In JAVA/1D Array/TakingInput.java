import java.util.Scanner;
public class TakingInput {
    static void main () {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        // Input 
        for(int i = 0; i <= n-1; i++){
            System.out.println("Provide Input For Index " + i);
            arr[i] = sc.nextInt();
        }
        // Print 
        System.out.println("Your Array Contains : ");
        for(int val: arr){
            System.out.println(val);
        }
    }
}

/*
Output :
Provide Input For Index 0
10
Provide Input For Index 1
20
Provide Input For Index 2
30
Provide Input For Index 3
40
Provide Input For Index 4
50
Your Array Contains : 
10
20
30
40
50
*/