public class MultiplicationInArray{
    static void main() {

        int arr[] = {2,3,10,20};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i<=n-1; i++){
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println("Multiplication of array elements: " + ans);
    }
}

/*
Output:
Multiplication of array elements: 1200
*/