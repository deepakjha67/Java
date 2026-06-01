public class Do_While
{
    public static void main (String [] args )
    {
// Basic Do-While loop         
        int RevisionRound = 1;
        do {
            System.out.println("Revision Round = " + RevisionRound);
            RevisionRound++;
        } 
        while (RevisionRound <=3);

// Code that will run the loop once
        int score = 10;
        do {
            System.out.println("This Runs Once");

        }
        while (score >50);
// Infinite for loop
        while (true) {
            System.out.println("This will run Infinite");
        }
    }
}