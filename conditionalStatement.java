public class conditionalStatement {
    public static void main (String args[]) {
      
        int age = 18;

        if(age < 18) { // for equals to use " == " and for not equals to use " != "
            System.out.println("Child");            
        } else if (age >= 13 && age <= 19) {    // && is and gate
            System.out.println("Teenager");
        } else if (age >= 20 && age <=50) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }

      // if ( age == 18 || age == 20) {      // "||" is or gate
        //     System.out.println("Eligible");
   
    }
}
// Output =  Teenager 
