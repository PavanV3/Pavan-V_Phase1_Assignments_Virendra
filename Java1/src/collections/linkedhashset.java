package collections;


import java.util.*;

 public class linkedhashset{
	public static void main(String[] args){
		
		
	 	LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
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
		
		System.out.println("LinkedHashset is "+hs);
		
		System.out.println("Size of LinkedHashset is "+ hs.size());
		
		System.out.println("Remove the element "+hs.remove("kiwi")+hs.remove("fig"));
		
		System.out.println("LinkedHashset is "+hs);
		
		hs.add("Ban");
		hs.add("app");
		hs.add("wmellon");
		
		System.out.println("LinkedHashset is "+hs);
		
		System.out.println("Does LinkedHashset contains this 'orange' :  " + hs.contains("orange"));
		
		System.out.println("Is LinkedHashset empty  " + hs.isEmpty());
		
	   		
	
	
	}
}
