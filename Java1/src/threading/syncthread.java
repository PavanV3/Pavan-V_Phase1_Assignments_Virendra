package threading;

class Sync{
	synchronized public void getsync() {
		for(int i=1;i<=3;i++) {
			try{
	    		Thread.sleep(370);  
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());
			System.out.println("running thread name is:"+Thread.currentThread().getName());
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
			System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
		}
	}
}

 class Department extends Thread
{
	Sync sync;
	Department(Sync sync){
		this.sync=sync;
	}
	public void run() {
		sync.getsync();
	}
}
public class syncthread{
	public static void main(String[] args) {
		Sync s =new Sync();
		Department s1= new Department(s);
		Department s2= new Department(s);
		Department s3= new Department(s);
		s1.setName("IT");
		s2.setName("HR");
		s3.setName("Finance");
		
		
		s1.start();
		s3.start();
		s2.start();
		
		
	}

}