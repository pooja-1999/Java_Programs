package PracticePrograms;

public class InnerClassDemo {
	
		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClassDemo obj=new InnerClassDemo();
			InnerClassDemo.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


