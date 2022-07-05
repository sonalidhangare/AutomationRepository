package Conditionalstatement;

public class Nestedifelse {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=210;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}	
			
			else
			{
				System.out.println("C is greater");
			}	
			
		}	
		else
		{
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
			
		}	
	}
}
