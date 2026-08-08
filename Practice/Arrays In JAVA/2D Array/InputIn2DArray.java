import java.util.Scanner;
public class InputIn2DArray {
    static void main (String [] args){

        int arr[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j <= arr[i].length-1; j++) {
                System.out.println("Provide the value for row= " + i + "and Column= " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        // Print:
        for(int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++) {
            for(int colIndex = 0; colIndex <= arr[rowIndex].length-1; colIndex++) {

                System.out.print(arr[rowIndex][colIndex] + " ");

            }
            System.out.println();
        }

    }    
}

/*
Output :
1 2 3 4 
5 6 7 8 
9 10 11 12 
 */ 