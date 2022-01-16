package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String a[]){
		
    	HashMap hm = new HashMap();
		
    	hm.put("1","banana");
    	hm.put("2","apple");
    	hm.put("3","watermellon");
    	hm.put("4","papaya");
    	hm.put("5","grapes");
    	hm.put("6","cherry");
    	hm.put("7","fig");
    	hm.put("8","kiwi");
    	hm.put("9","blueberry");
    	hm.put("10","blackberry");
		
        System.out.println("hashmap is "+ hm);
        
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        
        hm.remove("4");
        System.out.println("After removal of 4th the hashmap is "+hm);
        hm.remove("7");
        System.out.println("After removal of 7th the hashmap is "+hm);
    
        System.out.println(hm.containsValue("apple"));
        System.out.println(hm.containsValue("banana"));
        System.out.println(hm.hashCode());
        hm.clear();
        System.out.println("After clearing hashmap is "+ hm);
        
    }
}