package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapAssign {
	  public static void main(String[] args) {
	        
		    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	        
	        linkedHashMap.put(1, new String("Apple"));
	        linkedHashMap.put(2, new String("Orange"));
	        linkedHashMap.put(3, new String("Grapes"));
	        linkedHashMap.put(4, new String("Mango"));
	        linkedHashMap.put(5, new String("Strawberry"));
	        linkedHashMap.put(6, new String("Jackfruit"));
	        linkedHashMap.put(7, new String("Cherry"));
	        linkedHashMap.put(8, new String("Papaya"));
	        linkedHashMap.put(9, new String("Banana"));
	        linkedHashMap.put(10, new String("Lemon"));
	        
	        
	        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	        
	        for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
	        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
	        
	        System.out.println("\nRemove index 7 : " + linkedHashMap.remove(7));
	        System.out.println("LinkedHashMap contains Banana as value? : " + linkedHashMap.containsValue("Banana"));
	        System.out.println("LinkedHashMap contains Apple as value? : " + linkedHashMap.containsValue("Apple"));
	        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
	        System.out.println("Hashcode of map: " + linkedHashMap.hashCode());
	        
	        System.out.println("Content of LinkedHashMap after removing: " + linkedHashMap);
	       
	        linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	    }
}
