package datatypeassignment;

import java.util.regex.*;

public class RegexAssignment {

	public static void main(String[] args) {
		
		String str = "917834674684";

		Pattern ptrn = Pattern.compile("(91)?[7-9][0-9]{9}");  
		Matcher match = ptrn.matcher(str);
		
		if((match.find() && match.group().equals(str)))
		{System.out.println("It is a valid mobile number."); }  
		else  
			{System.out.println("Entered mobile number is invalid.");      
			}  
		
		
		

	}

}
