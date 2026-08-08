public class MaxElement {
    static void main () {

        int arr[] = {3, 2, -5, 21, 10};
        int n = arr.length;
        int maxValue = arr[0];

// Compare maxValue to every element of array:

        for(int i = 0; i <= n-1; i++) {
            if (arr[i] > maxValue) {

                // Update maxValue
                maxValue = arr[i];
            }
        }
        System.out.println("Maximum Value : " + maxValue);
    }
}

/*
Output:
Maximum Value : 21
*/