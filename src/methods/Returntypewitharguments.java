package methods;

public class Returntypewitharguments {
	
	int subtraction(int a, int b) {
		
		int c=a-b;
		
		System.out.println("Subtraction is "+c);
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntypewitharguments obj=new Returntypewitharguments();
		
		int x=obj.subtraction(10,5);
		System.out.println("Subtraction is "+x);

	}

}
