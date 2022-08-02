package collection;

import java.util.TreeSet;

public class TreeSetAssign {
	public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
                    
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("HTML");
        treeSet.add("SQL");
        treeSet.add("JavaScript");
        System.out.println("TreeSet is : " + treeSet);
        treeSet.remove("Java");
        treeSet.remove("HTML");
        System.out.println("TreeSet after removing two programming languages: " + treeSet);
        treeSet.add("Ruby");
        treeSet.add("PHP");
        treeSet.add("Swift");
        
        System.out.println("TreeSet after adding three programming languages: " + treeSet);
        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
        
        System.out.println("Check if Java present? : "+treeSet.contains("Java"));
        treeSet.clear();
        
        System.out.println("After removing elements: " + treeSet);
    }

}
