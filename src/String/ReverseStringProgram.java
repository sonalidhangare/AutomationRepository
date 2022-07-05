package String;

public class ReverseStringProgram {
	
	public static void main(String[] args)
	{
		String a="Velocity";
		
	 int x=a.length();
	 
	 String rev=" ";
	 
	 for(int i=(x-1);i>=0;i--)
	 {
		 rev=rev+a.charAt(i);
				 
	 } 
	 System.out.println("Reverse string is "+rev);
		
	}

}
