package Interface;

public class ImplementationClass implements Interface1,Interface2 {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Interface1 add method is completed in implementation class "+c);
	}
	
	public void multiplication(int m, int n)
	{
		int o=m*n;
		
		System.out.println("Multiplication is "+o);
		
	}
	
	public void div(int x,int y)
	{
		int z=x/y;
		
		System.out.println("Division is "+z);
	}
	
	

}
