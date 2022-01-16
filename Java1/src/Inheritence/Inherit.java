package Inheritence;

class Product {
	int id=45;
	String name="Amul";
	public void display()
	{
	System.out.println("Product id: "+id+" Product name: "+name);
	}
}
class A extends Product{
	
	int count=40;
	String category="butter";
	
	public void display()
	{
		System.out.println("Count: "+count);
		System.out.println("Category: "+category);
	
    }
	
}
class B extends Product{
	
	int count=20;
	String category="cheese";

	public void display()
	{
		System.out.println("Count: "+count);
		System.out.println("Category: "+category);
		
    }
	
}
class C extends Product{
	int count=50;
	String category="curd";
	public void display()
	{
		System.out.println("Count: "+count);
		System.out.println("Category: "+category);
    }
}
class subA extends A{
	
	int price=30;
	int total=price*count;
	public void display()
	{
		System.out.println("Product id: "+id+" Product Name: "+name+ " Category: "+category+" Count: "+count);
		System.out.println("Total Price: "+total);
    }
}
class subB extends B{
	int price=40;
	int total=price*count;
	public void display()
	{
		System.out.println("Product id: "+id+" Product Name: "+name+ " Category: "+category+" Count: "+count);
		System.out.println("Total Price: "+total);
    }
}

public class Inherit
{
	public static void main(String[] args) 
	{
		subA sa=new subA();
		subB sb=new subB();
		C sc=new C();
		sa.display();
		sb.display();
		sc.display();
	}
}

