package collection;

import java.util.*;


public class MonthSet {
	
	public static void main(String[] args){
		
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("May");
		ls.add("June");
		ls.add("July");
		ls.add("August");
		ls.add("April");
		ls.add("November");
		ls.addLast("December");
        ls.addFirst("January");
        ls.add(1, "March");
        ls.add(1, "February");
        ls.add(8, "September");
        ls.add(9, "October");
        ls.remove(7);
        ls.add(3,"April");
        System.out.println(ls);
        int i;
        System.out.println("Even months of the year: ");
        for (i=0;i<12;i++)
        {
        	if(i%2!=0)
        	{System.out.println(ls.get(i));}
        }
        int j;
        System.out.println("Odd months of the year: ");
        for (j=0;j<12;j++)
        {
        	if(j%2==0)
        	{System.out.println(ls.get(j));}
        }
        System.out.println("Printing months using iterator: ");
        Iterator itr=ls.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
        }
        
        System.out.println("First month: "+ls.peek()+" Last month: "+ls.getLast());
        ls.remove("April");
        System.out.println("After removing April: "+ls);
        
        System.out.println("Contains winter month : "+ls.contains("December"));
        
        System.out.println("First month: "+ls.peekFirst()+" Last month: "+ls.peekLast());
        System.out.println("After peeking: "+ls);
        System.out.println("First month: "+ls.pollFirst()+" Last month: "+ls.pollLast());
        System.out.println("After polling: "+ls);
        
        
	}

}
