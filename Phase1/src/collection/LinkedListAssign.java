package collection;

import java.util.LinkedList;

public class LinkedListAssign {
public static void main(String a[]){
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");    
        System.out.println(ll); 
        ll.addLast("December");
        ll.addFirst("January");
        System.out.println(ll);
        ll.add(1, "March");
        ll.add(1, "February");
        System.out.println(ll);
        ll.add(7, "September");
        ll.add(8, "October");
        System.out.println(ll);
        
    }
}
