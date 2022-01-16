package Inheritence;

public class MultipleException {

	public static void main(String[] args) {
		try{    
     	   exception1();  
     	   exception2();
     	   }    
           catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }  
        
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
        
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }     
        
        }
        public static void exception1() {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[6]=9;
		}
		catch(ArithmeticException e)  
     {  
      System.out.println("Arithmetic Exception occurs");  
     }  

  catch(ArrayIndexOutOfBoundsException e)  
     {  
      System.out.println("ArrayIndexOutOfBounds Exception occurs");  
     }    

  catch(Exception e)  
     {  
      System.out.println("Parent Exception occurs");  
     }     
	}
        public static void exception2()
        {
		try {
			int a[]=new int[5];
			a[5]=30/0;
         }
		catch(ArithmeticException e)  
     {  
      System.out.println("Arithmetic Exception occurs");  
     }  

  catch(ArrayIndexOutOfBoundsException e)  
     {  
      System.out.println("ArrayIndexOutOfBounds Exception occurs");  
     }    

  catch(Exception e)  
     {  
      System.out.println("Parent Exception occurs");  
     }   
		finally {
         System.out.println("Finally inside method");
     }
	}  
}