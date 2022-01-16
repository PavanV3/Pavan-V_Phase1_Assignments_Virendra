package collections;
import java.util.*;

class Months {
	 public static void main(String a[]){
	    	
	    	int a1=11;
	    	
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add( "april");
	        ll.add("may");
	        ll.add("june");
	        ll.add("july");
	        ll.add( "august");
	        ll.add("november");
	        ll.addFirst("january");
	        ll.addLast("December");
	        ll.add(1, "February");
	        ll.add(2, "March");
	        ll.add(8,"September");
	       ll.add(9, "October");
	       
	       System.out.println("Linkedlist=" +ll);
	       Iterator itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println("list is=" + itr.next());
	        }
	        
	        System.out.println("Size of the linked list: " +ll.size());
	        ll.remove(3);
	        System.out.println("Does LinkedList contains 'November'? " +ll.contains("november"));
   
	        System.out.println("even months");
	      
		        
		        
	 }
	 }           

