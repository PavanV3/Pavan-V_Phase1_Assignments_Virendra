package threading;

public class Threadpriority extends Thread {
	synchronized public void run(){  
		for (int i = 0; i < 3; i++)
		{
			System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
			System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or deadntThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
			  
	}
	}

public static void main(String args[]){  
	  
	  Threadpriority m1=new Threadpriority();  
	  Threadpriority m2=new Threadpriority();  
	  Threadpriority m3=new Threadpriority();
	  
	  
	  m1.setName("IT");
	  m2.setName("finance");
	  m3.setName("HR");
	  
	  m1.start();  
	  m2.start();  
	  m3.start();
	   
}

}