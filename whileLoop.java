public class whileLoop {
    public static void main (String args [])
    {
        
        int i = 1;

        while (i<=4)
        {
            System.out.println(" Hellow " +i );

            int j = 1;
            while(j<=3)
            {
                System.out.println(" Bye " +j);
                j++;
            }

            i++;
        }   

    }
}
/*
Output :

Hellow 1
 Bye 1
 Bye 2
 Bye 3
 Hellow 2
 Bye 1
 Bye 2
 Bye 3
 Hellow 3
 Bye 1
 Bye 2
 Bye 3
 Hellow 4
 Bye 1
 Bye 2
 Bye 3

*/
