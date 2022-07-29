package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionAss2 {
	
    
	static void excep() throws IOException{
               throw new IOException("Length is greater than breadth");
      }
    
   public static void main(String args[]){       
	  
	   Scanner scanner = new Scanner(System.in); 
       
       System.out.println("Length : ");
       int l = scanner.nextInt();
       
       System.out.println("Breadth : ");
       int b = scanner.nextInt();
       
       
      
       try{
    	 if (l>b){excep();}
    	 else {System.out.println("Area = "+l*b);}
       }
       catch(IOException ae)
       {
    	   System.out.println(ae.getMessage());
       }
   }   
      
}   
    