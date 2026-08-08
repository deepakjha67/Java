public class MinValueOf2DArray {
    public static void main(String [] args) {

        int arr[][] ={{6,2,3,4},{4,5,6,7}};
        int minValue = arr[0][0];

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0 ; j < arr[i].length; j++) {

                if (arr[i][j] < minValue){
                    minValue = arr[i][j];
                }
            }
        } 
        
        System.out.println("Minimum Value :" + minValue);
    }
}

// Output : Minimum Value :2