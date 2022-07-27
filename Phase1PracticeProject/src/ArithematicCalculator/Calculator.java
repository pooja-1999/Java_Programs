package ArithematicCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		    char op;
		    double num1, num2, result;
		    
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("Enter first number = ");
		    num1 = input.nextDouble();
		    
		    System.out.println("Enter second number = ");
		    num2 = input.nextDouble();

		    System.out.println("Choose an operator: +, -, *, / or %");
		    op = input.next().charAt(0);

		  	if(op==('+'))
		  		{result=num1+num2;
		  		System.out.println(result);}
		  	
		  	else if(op=='-')
		  		{result=num1-num2;
		  		System.out.println(result);}
		  	
		  	else if(op=='*')
		  		{result=num1*num2;
		  		System.out.println(result);}
		  	
		  	else if(op=='/')
		  		{
		  		if(num2==0)
		  			{System.out.println("Dividing by zero is undefined");	}
		  		else
		  			{result=num1/num2;
		  			System.out.println(result);}
		  		}
	
		  	else
		  		{System.out.println("invalid operator");}
		  		
	}

}
