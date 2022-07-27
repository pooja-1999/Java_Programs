package ValidationofEmail;

import java.util.*;
public class ValidEmail{
   public static void main(String[] args){
      ArrayList <String> list = new ArrayList<String>();
      list.add("anu@abc.com");
      list.add("jis@abc.com");
      list.add("kris@abc.com");
      list.add("osis@abc.com");
      list.add("kira@abc.com");
      list.add("liza@abc.com");
      list.add("hadi@abc.com");
      list.add("hira@abc.com");
      list.add("biha@abc.com");
      list.add("fazi@abc.com");
      list.add("mahi@abc.com");
      list.add("impal@abc.com");
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the email id for validation: ");
      String str = s.nextLine();
      
      if (list.contains(str))
      	{System.out.println("Email Id is Valid");}
      else
   		{System.out.println("Email Id is  not Valid");}         
 
       }
}
     
