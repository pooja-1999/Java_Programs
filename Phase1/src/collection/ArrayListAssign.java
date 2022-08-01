package collection;

import java.util.ArrayList;

public class ArrayListAssign {
public static void main(String[] args){
		
		ArrayList<String> al=new ArrayList<String>();  
		
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Pineapple");
		al.add("Grapes");
		al.add("Strawberry");
		al.add("Mumbai");
		al.add("NewDelhi");
		al.add("Reading");
		al.add("Drawing");
		System.out.println("Arraylist is "+al);
		
		al.remove(9);
        System.out.println("New Arraylist is "+al);
		
        System.out.println("Does LinkedList contains 'Cricket'? "+al.contains("Cricket"));
		
        al.remove(7);
        al.remove(2);
        
        System.out.println("element at position 4 is  : "+ al.get(4));
        System.out.println("element at position 6 is  : "+ al.get(6));

	}

}
