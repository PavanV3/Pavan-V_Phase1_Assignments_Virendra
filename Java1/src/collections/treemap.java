package collections;

import java.util.*;
public class treemap {
    public static void main(String a[])
    {
		
    	Map<Integer, String>TreeMap  = new TreeMap <Integer, String>();
		
    	TreeMap.put(1,"banana");
    	TreeMap.put(2,"apple");
    	TreeMap.put(3,"watermellon");
    	TreeMap.put(4,"papaya");
    	TreeMap.put(5,"grapes");
    	TreeMap.put(6,"cherry");
    	TreeMap.put(7,"fig");
    	TreeMap.put(8,"kiwi");
    	TreeMap.put(9,"blueberry");
    	TreeMap.put(10,"blackberry");
		
        System.out.println("Treemap is "+ TreeMap);
        
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : TreeMap.keySet())
        {
            System.out.println(key + ":\t" +TreeMap.get(key));
        }
        
        System.out.println("Is Treemap empty? "+TreeMap.isEmpty());
        
        TreeMap.remove(4);
        System.out.println("After removal of 4th the Treemap is "+TreeMap);
        TreeMap.remove(7);
        System.out.println("After removal of 7th the Treemap is "+TreeMap);
    
        System.out.println(TreeMap.containsValue("apple"));
        System.out.println(TreeMap.containsValue("banana"));
        System.out.println(TreeMap.hashCode());
        TreeMap.clear();
        System.out.println("After clearing Treemap is "+ TreeMap);
        
    }
}