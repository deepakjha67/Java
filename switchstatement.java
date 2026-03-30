// Use of switch and Break statements in java

public class switchstatement {
    public static void main(String[] args) {
        int opt = 1;
        
        switch (opt)  {
        //     case 1:
        //         System.out.println("That you selected the english language");
            

        //     case 2:
        //         System.out.println("You selescted Hindi language");

        //     case 3:
        //         System.out.println("You selected French Language");    
     

        // Output :
        // You selescted Hindi language
        // You selected French Language 
            

        
            case 1:
                System.out.println("That you selected the english language");
                break;

            case 2:
                System.out.println("You selescted Hindi language");
                break;
            case 3:
                System.out.println("You selected French Language"); 
                break;
            default:
                System.out.println("Invalid Option");   // When no case is selected    
     
             // Output :
             // You selescted Hindi language
             // You selected French Language 
             
        }

    }
} 
