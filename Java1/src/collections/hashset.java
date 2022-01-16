package collections;


import java.util.*;

public class hashset{
	public static void main(String[] args){
		
		
	 	HashSet<String> hs=new HashSet<String>();
		
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
		
		System.out.println("Hashset is "+hs);
		
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Remove the element "+hs.remove("kiwi")+hs.remove("fig"));
		
		System.out.println("Hashset is "+hs);
		
		hs.add("Ban");
		hs.add("app");
		hs.add("orange");
		
		System.out.println("Hashset is "+hs);
		
		System.out.println("Does Hashset contains this 'orange' :  " + hs.contains("orange"));
		
		System.out.println("Is Hashset empty  " + hs.isEmpty());
		
	   		
	
	
	}
}
