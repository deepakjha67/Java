class calculator
{
   // Every Object have properties and Methods
   public int add (int num1, int num2)
      
   {
      //int a;
		//System.out.println("in add");
		//return 0;

		//int r=num1+num2;
		//return r;

      int r = num1 + num2;
      return r;
   }
}  

public class Lecture_1 {
   public static void main(String args[]) {
      int num1 = 4;
      int num2 = 5;

      calculator calc = new calculator(); // This is how Object created
      int result = calc.add(num1, num2);

            // int result = num1 + num2;
       System.out.println(result);
   } 
   }

   // Output : 9
