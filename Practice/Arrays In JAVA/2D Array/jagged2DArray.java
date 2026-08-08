public class jagged2DArray {
    static void main (String [] args) {
        


        // Declaration:
        int[][] arr;
        arr = new int[3][4];

        int[][] brr = {
                        {1,2},
                        {2,3,56,7},
                        {3,4,45,6,7},
                        {4},
                    };

        int rowlength = brr.length;

        for (int rowIndex = 0; rowIndex <= brr.length -1; rowIndex++) {
            for(int colIndex = 0; colIndex <= brr[rowIndex].length-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
            

        }

    }
    /*
    Output: 
    1 2 
    2 3 56 7 
    3 4 45 6 7 
    4 
    */