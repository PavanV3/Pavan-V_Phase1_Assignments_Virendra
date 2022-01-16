package constructor;

public class shapes 
{
	int s;
	float r;
	int l,b;
	
	shapes(int side)
	{
		side=s;
	}
	shapes(float radius)
	{
		radius=r;
	}
	shapes(int length,int breadth)
	{
		length=l;
		breadth=b;
	}
	public float circle()
	{
		return 3.14f*r*r;
		
	}
	public double square()
	{
		return s*s;
		
	}
	public int rectangle()
	{
		return l*b;
		
	}
	//Method Overloading
	public double calculate(long a, long b)
	{
		double i;
		i=(a*b)/2;
		return i;
	}
	public double calculate(int a,float b)
	{
		float j;
		j=(a*b)/2;
		return j;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		shapes circle=new shapes(3.4f);
		shapes square=new shapes(5);
		shapes rectangle=new shapes(5,7);
		//shapes triangle=new shapes();
		//shapes rhombus=new shapes();
		
		System.out.println("Area of square:"+square.square());
		System.out.println("Area of Rectangle:"+rectangle.rectangle());
		System.out.println("Area of circle:"+circle.circle());
		//System.out.println("Area of rombhus:"+rhombus);
		//System.out.println("Area of triangle:"+triangle);
		
		
	}

}
