public class LogicalOperators {
	public static void main (String args[])
	{
		int a = 4;
		int b = 6;
		
		int x = 9;
		int y = 5;
		
		boolean result = a > b && x > y;  
		System.out.println( !result );          // Output : true
		
		}
	}
	// && : max False
	// || : max True
	// ! : Reverse
