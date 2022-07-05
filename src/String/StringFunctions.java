package String;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Velocity";
		String b="Velocity";
		String x=new String("Velocity");
		String y=new String("Velocity Class");
		
		boolean r=(a==x);
		System.out.println(r);
		
		boolean p=(a==b);
		System.out.println(p);
		
		boolean q=(x==y);
		System.out.println(a);
		
		System.out.println(a.equals(b));
		
		System.out.println(x.length());

		System.out.println(a.charAt(3));

		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());

		System.out.println(a.equalsIgnoreCase(x));
		
		System.out.println(y.startsWith("Velocity"));

		System.out.println(y.endsWith("Class"));
		
		System.out.println(y.indexOf('C'));

		System.out.println(y.isEmpty());
		
		System.out.println(y.lastIndexOf('c'));

		System.out.println(y.replace('C','v'));

		System.out.println(y.concat("Testing Class"));

	}

}
