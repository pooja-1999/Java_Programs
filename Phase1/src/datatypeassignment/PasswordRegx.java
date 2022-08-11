package datatypeassignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordRegx {

	public static void main(String[] args) {
		System.out.println("Enter password: ");
		Scanner s = new Scanner(System.in);
		String p = s.nextLine();
		if (p == null || p.isEmpty()){
			System.out.println("password is not valid");}
		
		String passwregx = "[A-Z]{1}+.{1}+[0-9]{4}+[A-Za-z]{4}";
		Pattern ptrn = Pattern.compile(passwregx);
		if(ptrn.matcher(p).matches()){
			System.out.println("password is valid");}
		else
		{System.out.println("password is not valid");}
	
	}

}
