package Multilevelinheritance;

public class ClassE extends ClassD {
	
	public void document()
	{
		System.out.println("document is a method of ClassE");
	}
	
	public void payment()
	{
		System.out.println("Payment is a method of ClassE");

	}
	
	public static void main(String[] args)
	{
		ClassE e=new ClassE();
		
		e.Chat();
		e.Status();
		e.audiocall();
		e.videocall();
		e.document();
		e.payment();
	}

}
