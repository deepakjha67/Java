public class Arithmatic_Operators {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int c = 6;

        System.out.println(a+b+c);

        int sum = a+b+c;;
        int sub = b-a;
        System.out.println(sum);
        System.out.println(sub);

        int result = c - b * a / c + a - b; // Left -> Right ( * > / > - > + > - ) 
        System.out.println(result);

        int result1 = a*b;
        System.out.println(result1);

        
    }
}

// Output :
// 21
// 21
// 5
// -7
// 50
