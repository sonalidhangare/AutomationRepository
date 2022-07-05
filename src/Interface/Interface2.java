package Interface;

public interface Interface2 {
	
	void add(int a,int b);
	void div(int x,int y);
	
	default void mod()
	{
		int q=10;
		int r=5;
		
		int a=q%r;
		
		System.out.println("Modulus is "+a);
	}

}
