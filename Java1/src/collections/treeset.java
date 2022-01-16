package collections;

import java.util.*;

public class treeset{
	public static void main(String[] args){
		
		
	 	TreeSet<String> hs=new TreeSet<String>();
		
		hs.add("Banana");
		hs.add("apple");
		hs.add("watermellon");
		hs.add("papaya");
		hs.add("grapes");
		hs.add("cherry");
		hs.add("fig");
		hs.add("kiwi");
		hs.add("blueberry");
		hs.add("blackberry");
		
		System.out.println("Treeset is "+hs);
		
		System.out.println("Size of Treeset is "+ hs.size());
		
		System.out.println("Remove the element "+hs.remove("kiwi")+hs.remove("fig"));
		
		System.out.println("Treeset is "+hs);
		
		hs.add("Ban");
		hs.add("app");
		hs.add("wmellon");
		
		System.out.println("Treeset is "+hs);
		
		System.out.println("Does treeset contains this 'orange' :  " + hs.contains("orange"));
		
		System.out.println("Is treeset empty  " + hs.isEmpty());
		
	   		
	
	
	}
}
