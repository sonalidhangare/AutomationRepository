package Hierarchicalinheritance;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculatornew1 a=new Calculatornew1();
		a.multiplication();
		a.division();
		a.addition(10, 50);
		a.subtraction(40, 20);
		
		System.out.println("Second object created below");
		
		Newcalculator b=new Newcalculator();
		
		b.addition(50, 60);
		b.subtraction(100, 40);
		b.multiplication();
		b.division();

	}

}
