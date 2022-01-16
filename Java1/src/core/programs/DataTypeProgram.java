package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		System.out.println("Boolean status is " + a);
		int b=100;
		System.out.println("Value of b is "+b);
		char gender='M';
		System.out.println("Gender is "+gender);
		double e=3046634563.222223112;
		System.out.println("Value of e is "+e);
		float d=23.3f;
		System.out.println("Value of d is " +d);
		
		//TypeCasting
		// Implicit (low to high)(byte>short>int>long>float>double)
		long l=(long)e;//double to long//implicit
		System.out.println("Value of l is " +l);
		long i=b; //int to long implicit
		System.out.println("Value of i " +i);
		float k=(float)l;//long to float//implicit
		System.out.println("Value of k is "+k);
		double z=(double)k;
		System.out.println("Value of z is "+z);
		
		// Explicit(High to low)(double>float>long>int>short>)
		long f=21033992;
		int g=(int) f; //long to int//explicit
		System.out.println("Value of g is "+g);
		char h=(char)b; // int b to char // explicit
		System.out.println("Value of h is "+ h);
		float m=(float)e;//double to float//explicit
		System.out.println("Value of m is " +m);
		System.out.println("Value of e is "+e);
		int j=(int)l;//long to int // explicit
		System.out.println("Value of j is "+j);
		byte bi =(byte)m;// float to byte // explicit
		int ii=257;
		double dd=323.573;
		System.out.println("Value of bi "+bi);
		System.out.println("Value of ii "+ii);
		System.out.println("Value of dd "+dd);
		
		
	}

}
