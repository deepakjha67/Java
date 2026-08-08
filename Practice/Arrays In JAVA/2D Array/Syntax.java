public class Syntax {
    static void main (String[] args) {

        // Declaration:
        int[][] arr;

        // Allocation:

        arr = new int[3][4];
        // Initialization

        int[][] brr = {
                        {1,2},
                        {2,3},
                        {3,4},
                        {4,5},
                    };
        // System.out.println(brr[1][1]); // Output: 3

        int rowlength = brr.length;
        int colLength = brr[0].length;
        // int colLength = brr[rowIndex].Length; -> for diff elem in columns

        for (int rowIndex = 0; rowIndex<= rowlength-1; rowIndex++) {
            for(int colIndex = 0; colIndex<= colLength-1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
            /*
            Output:
            1 2 
            2 3 
            3 4 
            4 5 
            */

        }

    }
}
