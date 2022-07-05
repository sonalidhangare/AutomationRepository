package Keywords;

public class thiskeyword {
	
	
	int a=40;
	
	public void demo()
	{
		int b=25;
		System.out.println("Variable is "+b);
		
		System.out.println("Global variable is "+this.a);
	}
	
	public static void main(String[] args)
	{
		thiskeyword obj=new thiskeyword();
		
		obj.demo();
		
		
	}

}
