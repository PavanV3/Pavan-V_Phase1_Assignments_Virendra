package Inheritence;

public class demoexception
{

	public static void main(String[] args)
	{
		int a,b,c=0;
		a=4;
		b=0;
		int d[]= new int[6];
		try
		{
			d[8]=10;
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
		System.out.println("can't divide the number by zero ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);	
		}
		
		System.out.println();
		System.out.println(c);
	}

}
