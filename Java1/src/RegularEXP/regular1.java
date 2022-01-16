package RegularEXP;

import java.util.regex.Pattern;

public class regular1
{

	public static void main(String[] args) 
	{
		 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}","firstname@gmil.com"));
		 System.out.println (Pattern.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,3}","virendra@gmail.com"));
		 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.edu\\.[a-z]{2,3}","test123prepare@co.edu.com"));
		 System.out.println (Pattern.matches("^\\+91\\d{10}$","+919791447412"));
		 System.out.println (Pattern.matches("[A-Z0-9a-z]{10}","Pavan37jr"));
	}

}