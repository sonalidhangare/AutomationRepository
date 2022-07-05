package Methodoverloading;

public class methodoverloadingdemo {
	
	public int addition()
	{
		int a=25;
		int b=25;
		int c=a+b;
	
		System.out.println("Addition is "+c);
		return c;
	}
	public int addition(int a,int b)
	{
		int c=a+b;
	
		System.out.println("Addition is "+c);
		return c;
	}
	
	public static void main(String[] args)
	{
		methodoverloadingdemo obj=new methodoverloadingdemo();
		
		obj.addition();
		obj.addition(20, 50);
		
	}

}
