package collection;

import java.util.*;

public class LinkedHashsetAssign {
	public static void main(String[] args){
			
		LinkedHashSet L1 = new LinkedHashSet();
	
			L1.add(4);
			L1.add(9);
			L1.add(2.45f);
			L1.add(7.89f);
			L1.add('f');
			L1.add('k');
			L1.add(true);
			
			
			System.out.println("Linked Hashset L1 is "+L1);
			System.out.println("Size of Hashset is "+ L1.size());
			
			
	LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
			
		System.out.println("Enter 4 integers: ");
			Scanner s = new Scanner(System.in);
			int i;
			for (i=0;i<4;i++){int v = s.nextInt();L2.add(v);}
			
			System.out.println("Linked Hashset L2 is "+L2);
		
			
		    
		    
			
		}
	}


