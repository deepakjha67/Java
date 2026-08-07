// Create a method calculatePercentage(int obtained, int total)

public class CalculatePercentage
{
    public static double CalculatePercentage(int Obtained , int Total)
    {
        return (Obtained * 100)/Total; 
    }

    public static void main (String [] args){
        double percentage = CalculatePercentage(280 , 300);
        System.out.println("Percentage : " + percentage + " %");
    }
}


// OUTPUT :
// Percentage : 93.0 %
