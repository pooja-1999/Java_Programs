//write a program to find the longest increasing subsequence.

package practiceProjects;

import java.util.*;

public class PracticeProject4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements in the array: ");  
		int n=sc.nextInt();  
		int[] array = new int[100];  
		System.out.println("Enter the numbers of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt();  
		}  

      ArrayList list = new ArrayList();
      ArrayList longlist = new ArrayList();
      int Max;
      int Count = 0;
      for(int i = 0; i < n;i++)
      {
          Max = Integer.MIN_VALUE;
          for(int j = i;j < n; j++)
          {
              if(array[j] > Max)
              {
                  list.add(array[j]);
                  Max = array[j];
              }
          }
           
          if(Count < list.size())
          {
              Count = list.size();
              longlist = new ArrayList(list); 
          }  
          list.clear();
      }
    
      Iterator itr = longlist.iterator();
      System.out.println("The Longest increasing subsequence: ");
      while(itr.hasNext())
      {
          System.out.print(itr.next() + " ");
      }
} }
	


	

