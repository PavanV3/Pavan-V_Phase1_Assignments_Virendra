 package constructor;

public class constuctoroverloading {
	
	double i;
	float j;
	public constuctoroverloading()
	{
		System.out.println("default constructor");
	}
	constuctoroverloading(int a)
	{
		int s=a*a;
		System.out.println("Area of square:"+s);
	}
	constuctoroverloading(int h , int b)
	{
		int r=(h*b);
		System.out.println("Area of Rectangle:"+r);
	}
	constuctoroverloading(double pi,double r)
	{
		double c=pi*r*r;
		System.out.println("Area of circle:"+c);
	}
	
	
	
	//Method overloading
	public double calculate(long a, long b)
	{
		i=(a*b)/2;
		return i;
	}
	public double calculate(int a,float b)
	{
		j=(a*b)/2;
		return j;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		constuctoroverloading c1= new constuctoroverloading(4);
		constuctoroverloading c2= new constuctoroverloading(6,7);
		constuctoroverloading c3= new constuctoroverloading(3.14,5);
		//c1.display();
		constuctoroverloading c4= new constuctoroverloading();
		
		double rr=c4.calculate(34L,10L);
		System.out.println("Area of rombhus:"+rr);
		
		float tr=(float)c4.calculate(3,1.5f);
		System.out.println("Area of Triangle:"+tr);
		
		
		
	}

}
