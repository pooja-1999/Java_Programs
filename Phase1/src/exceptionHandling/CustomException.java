package exceptionHandling;

import java.util.Scanner;

public class CustomException {
	  
	   static void validate(int salary)throws SalaryException{  
	     if(salary<2100)  
	      throw new SalaryException("You need to work hard");  
	     else if (2100<salary && salary<5000)
	      throw new SalaryException("Your Salary is some how good");
	     else if (5000<salary && salary<9000)
	      throw new SalaryException("Salary is very good");
	     else 
	    	 System.out.println("invalid salary");
	   }  
	     
	   public static void main(String args[]){ 
		   System.out.println("Enter the salary amount = ");
		   Scanner s = new Scanner(System.in);
		   int sal = s.nextInt();
	      try{  
	        validate(sal);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  }  
	}  


class SalaryException extends Exception{ 
	SalaryException(String s){  
	  super(s);  
	 }  
}
