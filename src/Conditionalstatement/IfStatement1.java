package Conditionalstatement;

public class IfStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=300;
		int b=500;
		int c=210;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		
		if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		
		if(c>a && c>b)
		{
			System.out.println("C is greater");
		}	
		
	}

}
