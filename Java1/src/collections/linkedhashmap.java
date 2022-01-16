package collections;

import java.util.*;
public class linkedhashmap {
    public static void main(String a[])
    {
		
    	Map<Integer, String>LinkedHashMap  = new LinkedHashMap <Integer, String>();
		
    	LinkedHashMap.put(1,"banana");
    	LinkedHashMap.put(2,"apple");
    	LinkedHashMap.put(3,"watermellon");
    	LinkedHashMap.put(4,"papaya");
    	LinkedHashMap.put(5,"grapes");
    	LinkedHashMap.put(6,"cherry");
    	LinkedHashMap.put(7,"fig");
    	LinkedHashMap.put(8,"kiwi");
    	LinkedHashMap.put(9,"blueberry");
    	LinkedHashMap.put(10,"blackberry");
		
        System.out.println("Linkedhashmap is "+ LinkedHashMap);
        
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : LinkedHashMap.keySet())
        {
            System.out.println(key + ":\t" + LinkedHashMap.get(key));
        }
        
        System.out.println("Is HashMap empty? "+LinkedHashMap.isEmpty());
        
        LinkedHashMap.remove(4);
        System.out.println("After removal of 4th the hashmap is "+LinkedHashMap);
        LinkedHashMap.remove(7);
        System.out.println("After removal of 7th the hashmap is "+LinkedHashMap);
    
        System.out.println(LinkedHashMap.containsValue("apple"));
        System.out.println(LinkedHashMap.containsValue("banana"));
        System.out.println(LinkedHashMap.hashCode());
        LinkedHashMap.clear();
        System.out.println("After clearing hashmap is "+ LinkedHashMap);
        
    }
}