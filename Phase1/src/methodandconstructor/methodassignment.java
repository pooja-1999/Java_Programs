package methodandconstructor;

public class methodassignment {
	public void area(int b,int h)
    {
         System.out.println("sum of the numbers: "+(b+h));
    }
    
	public void area(float r) 
    {
         System.out.println("Area of Circle: "+(int)(3.14*r*r));
    }
	
	public void area(float g,float c)
	{
		System.out.println("Area of rectangle: "+ (int)(g*c));
	}
	
	public void area(int h)
	{
		System.out.println("Area of square: "+ h*h);
	}

    public static void main(String args[])
    {
      methodassignment ob=new methodassignment();
      ob.area(10,20);
      ob.area(5.2f);
      ob.area(5.89f,2.6f);
      ob.area(8); 
    }

}
