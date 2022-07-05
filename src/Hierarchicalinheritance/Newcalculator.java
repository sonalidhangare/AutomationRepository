package Hierarchicalinheritance;

public class Newcalculator extends Calculatorold {
	
	void multiplication()
	{
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println("Multiplication is "+c);
	}

	void division()
	{
		int d=20;
		int e=4;
		int c=d/e;
		System.out.println("Division is "+c);
	}
}
