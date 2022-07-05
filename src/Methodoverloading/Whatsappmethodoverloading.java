package Methodoverloading;

public class Whatsappmethodoverloading {
	
   
   public void Audiocall()
   {
	   System.out.println("This is an audiocall");
   }
   
   public void Audiocall(String a)
   {
	    
	    System.out.println(a+ "is Calling");
   }
   
   public void Videocall(String y)
   {
	
	
	   System.out.println("Video calling by "+y);

	   
   }
   
   public static void main(String[] args)
   {
	   Whatsappmethodoverloading obj=new Whatsappmethodoverloading();
	   
	   obj.Audiocall();
	   obj.Audiocall("Pooja");
	   obj.Videocall("Sonali");
	
   }
   
}
