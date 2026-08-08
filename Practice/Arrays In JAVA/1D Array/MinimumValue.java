public class MinimumValue {
    static void main() {
        int arr[]= {3,4,9,45,6};
        int n = arr.length;
        int minValue = arr[0];

        for (int i = 0; i <= n-1; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Minimum Vaue : " + minValue);

    }
}
/*
Output:
Minimum Vaue : 3
*/