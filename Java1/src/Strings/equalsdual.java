package Strings;

public class equalsdual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Literal---> objects are created in string pool
		   String a = "o";  
		   String b = "l";
		   String c = "y";  
		   String d = "p";
		   String e = "t";
		   String f = "k";
		   
		   
		   if(a.equals(b))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(c.equals(d))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(e.equals(a))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(f.equals(c))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(d.equals(c))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   String s1 = new String ("o");  
		   String s2 = new String ("l");
		   String s3 = new String ("y");  
		   String s4 = new String ("p");
		   String s5 = new String ("t");
		   String s6 = new String ("k");
		   if(s1==s2)
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(s3==s4)
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(s5==s1)
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(s6==s3)
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(s4==s3)
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
	}	

}
