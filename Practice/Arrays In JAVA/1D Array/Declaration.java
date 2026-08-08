public class Declaration {
    static void main () {
        // Declaration

        int arr[];

        // Allocation
        arr = new int[5];

        // Initialization
        int brr[] = {15,25,34, 64};

        /*

PROGRAM : 1

        System.out.println(brr[0]);  
        System.out.println(brr[2]);
        
        Output : 15 34
        */

        /*
PROGRAM : 2

        int n = brr.length;
        for (int index = 0; index <= n-1; index++) {
            System.out.println(brr[index]);
        }
        Output:
        15
        25
        34
        64
        */


    /*
PROGRAM : 3 (Best Way)

     for (int val : brr){
        System.out.println(val);
       }

       Output: 
       15
       25
       34
       64
    */
    }

}
