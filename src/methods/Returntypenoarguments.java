package methods;

public class Returntypenoarguments {
	
	int multiplication() {
		
		int p=2;
		int q=4;
		int r=p*q;
		return r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntypenoarguments obj=new Returntypenoarguments();
		
		int x=obj.multiplication();
		
		System.out.println("Multiplication is "+x);
	}

}
