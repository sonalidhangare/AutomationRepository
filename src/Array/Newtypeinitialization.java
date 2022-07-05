package Array;

public class Newtypeinitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		String b[]=new String[3];
		
		a[0]=10;
	    a[1]=30;
	    a[2]=60;
	    
	    b[0]="Sonali";
	    b[1]="Vishal";
	    b[2]="Nayan";
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }

	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.println(b[i]);
	    }
	}

}
