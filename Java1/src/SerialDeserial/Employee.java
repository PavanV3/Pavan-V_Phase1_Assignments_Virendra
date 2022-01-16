package SerialDeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee {
     public static void main(String args[]) throws IOException 
	  {
	    emp obj = new emp(10, 25, "Pavan", "Hosur", 988876538L,"pavan@45.com");
	    emp obj1 = new emp(11, 28, "Rajesh", "Krishnagiri", 98887538L,"raj@35.com");
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C:\\Users\\Pavan Jr\\OneDrive\\Desktop\\Java prgm practice files\\Employee.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      oos.writeObject(obj1);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
     //Deserialization
     emp o=null;
     emp o1=null;
     try{
       FileInputStream fis = new FileInputStream("C:\\Users\\Pavan Jr\\OneDrive\\Desktop\\Java prgm practice files\\Employee.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (emp)ois.readObject();
       o1 = (emp)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Employee Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("Employee Name:"+o.getempName());
     System.out.println("Employee Age:"+o.getempAge());
     System.out.println("Employee id:"+o.getempid());
     System.out.println("Employee Address:"+o.getempAddress());
     System.out.println("Employee contact:"+o.getempcontact());
     System.out.println("Employee mailid:"+o.getempmailid());
     
     System.out.println("Employee Name:"+o1.getempName());
     System.out.println("Employee Age:"+o1.getempAge());
     System.out.println("Employee id:"+o1.getempid());
     System.out.println("Employee Address:"+o1.getempAddress());
     System.out.println("Employee contact:"+o1.getempcontact());
     System.out.println("Employee mailid:"+o1.getempmailid());
  }
}

//------------------------------Student-------------------------//
class emp implements java.io.Serializable{
	  
	  private int empid;
	  private int empAge;
	  private  String empName;
	  private String empAddress;  
	  private  long empcontact;  
	  private String empmailid;
	  
	  public emp(int id, int Age, String Name,String Address, long contact, String mailid) 
	  {
	    this.empid = id;
	    this.empAge = Age;
	    this.empName = Name;
	    this.empAddress = Address;
	    this.empcontact = contact;
	    this.empmailid=mailid;
	  }
	  
	public int getempid() {
	    return empid;
	  }
	  public void setempid(int empid) {
	    this.empid = empid;
	  }
	  public int getempAge() {
	    return empAge;
	  }
	  public void setempAge(int empAge) {
	    this.empAge = empAge;
	  }
	  public String getempName() {
	    return empName;
	  }
	  public void setempName(String empName) {
	    this.empName = empName;
	  }
	  public String getempAddress() {
	    return empAddress;
	  }
	  public void setempAddress(String empAddress) {
	    this.empAddress = empAddress;
	  }
	  public long getempcontact() {
	    return empcontact;
	  }
	  public void setempcontact(int empcontact) {
	    this.empcontact = empcontact;
	  }
	  public String getempmailid() {
		    return empmailid;
		  }
		  public void setempmailid(String empmailid) {
		    this.empmailid = empmailid;
		  }
	}
