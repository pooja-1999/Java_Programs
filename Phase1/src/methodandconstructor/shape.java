package methodandconstructor;

public class shape {
	long id;  
    float area; 
    
    shape(){  
    	System.out.println("Default constructor");  
    }     
    
    shape(int k){  
    	area = k*k;
    	sqarea(area);
    }  
    
    shape(float f){  
    	area = (float)3.14*f*f;
    	cirarea(area);
    } 
    
    shape(float a, float b){
    	area = a*b;
    	rectarea(area);
    }	
    	
    public static void sqarea(float area) {
	      System.out.println("Area of square = "+area);
	   }
    public static void rectarea(float area) {
	      System.out.println("Area of square = "+area);
	   }
    public static void cirarea(float area) {
	      System.out.println("Area of square = "+area);
	   }
    
	public void area(int g,int c)
	{
		System.out.println("Area of rhombus = "+(c*g/2));
	}
	
	public void area(float l,float m)
	{
		System.out.println("Area of triangle = "+(l*m/2));
	}
	

   
    public static void main(String args[]){  
      
        shape s2 = new shape(5);
        shape s3 = new shape(6.8f);
        shape s4 = new shape(9.2f,7.2f);
        shape ob=new shape();
        ob.area(10.0f,12.3f);
        ob.area(5,7);
     
   }  

}
