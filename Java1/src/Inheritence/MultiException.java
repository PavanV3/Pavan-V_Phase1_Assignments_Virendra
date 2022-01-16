package Inheritence;

public class MultiException 
{

	public static void main(String[] args) 
	{
		
		try{
			exception1();
			exception2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
	}

	private static void exception1() 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		a=2;
		b=0;
		try
		{
		c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception");
		}
	}

	private static void exception2() 
	{
		// TODO Auto-generated method stub
		int j;
		int i[]=new int[6];
		try
		{
			i[7]=9;
		}
		catch(Exception e)
		{
			System.out.println("Array Exception");
		}
	}

}
