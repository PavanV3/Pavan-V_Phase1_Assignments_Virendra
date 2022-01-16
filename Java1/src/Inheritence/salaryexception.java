package Inheritence;

public class salaryexception 
{
	static void validate(int sal)throws InvalidSalException
	{  
	     if(sal<2100)  
	      throw new InvalidSalException("you need to work hard");  
	     else if(sal>=2100 && sal<=5000)
	      System.out.println("your salary is good");  
	     else if (sal>5100 && sal<9000) 
	     System.out.println("your salary is very good");
	}  

	public static void main(String[] args) 
	{
		try
		{  
			validate(3000);  
	    }
	    catch(Exception m)
	    {
	    	System.out.println("Exception occured: "+ m.getMessage());
	    }  
	  
	    System.out.println("rest of the code...");  
	 }  
}
class InvalidSalException extends Exception
{  
	
	InvalidSalException(String s)
	{  
	  super(s);  
	}  
}