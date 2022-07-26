package methodandconstructor;

public class methodoverloadass2 {

	
		public void calculate(int b,int h)
	    {
	         System.out.println("Sum of numbers : "+(b+h));
	    }
	    
		public void calculate(float r) 
	    {
	         System.out.println("Area of Circle : "+(int)(3.14*r*r));
	    }
		
		public void calculate(int c)
		{
			System.out.println("Area of square : "+(c*c));
		}
		
		public void calculate(float a, float f)
		{
			System.out.println("Area of rectangle : "+ (int)(a*f));
		}

	    public static void main(String args[])
	    {
	      methodoverloadass2 ob = new methodoverloadass2();
	      ob.calculate(10,12);
	      ob.calculate(10.1f,12.2f);
	      ob.calculate(1.6f);
	      ob.calculate(5);  
	    }
	

}
