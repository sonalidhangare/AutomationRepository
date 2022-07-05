package AbstractClass;

public class Fountainpen extends Pen{
	
	void write()
	{
		System.out.println("Completed the Pen class Write method in subclass");
	}

	void refill()
	{
		System.out.println("Completed the Pen class REFILL method in subclass");
	}

	void changenib()
	{
		System.out.println("The concrete method change nib");
	}

}
