public class NumberIsEven
{

    public static boolean isEven(int Number)
    {
        return Number % 2 == 0;
    }
    public static void main ()
    {
        System.out.println(isEven(88));
        System.out.println(isEven(29));
    }
}
// OUTPUT :
// true
// false
