package calculator;

import java.util.Scanner;

public class cal
{
	public static void main(String args[])
	{
	double num1 , num2 , result;
	Scanner s=new Scanner(System.in);
	System.out.println("enter first num");
	num1=s.nextDouble();
	System.out.println("enter second num");
	num2=s.nextDouble();
	System.out.println("select operation");
	System.out.println("Addition-a: Subtraction-s: Multiply-m: Divide-d:");
	char ch=s.next().charAt(0);
	s.close();
	
	switch(ch)
	{

	case 'a':
	result=num1+num2;
	System.out.println("sum=" +result);
	break;
	
	case 's':
	result=num1-num2;
	System.out.println("subtraction of two nums=" +result);
	break;
	
	case 'm' :
	result=num1*num2;
	System.out.println("multiplication of two nums=" +result);
	break;
	
	case 'd' :
	result=num1/num2;
	System.out.println("division of two nums=" +result);
	break;
	default:
		System.out.println("invalid operation");
	
	
	
	}
	
}
}

