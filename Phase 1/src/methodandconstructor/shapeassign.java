package methodandconstructor;


public class shapeassign {

		float area;   
		  
		public shapeassign()  
		{
			System.out.println("I am inside the default constructor");
		}
		
		public shapeassign(int i){ 
			area = i*i;
			squarearea(area);
		    }     
		    
		public shapeassign(float f){  
		    area = (float)3.14*f*f;
		    circlearea(area);
		    }  
		  
		public shapeassign(float a, float b){
			area = (float)a*b;;
			rectanglearea(area);
		    } 
		
		
		public static void squarearea(float area) {
		      System.out.println("Area of Square : "+area);
		   }
		public static void rectanglearea(float area) {
		      System.out.println("Area of rectangle : "+area);
		   }
		public static void circlearea(float area) {
		      System.out.println("Area of circle : "+area);
		   }
		
		public void area2(int k, int m)
		{System.out.println("Area of rhombus = "+(k*m/2));}
		
		public void area2(float k, float m)
		{System.out.println("Area of triangle = "+(k*m/2));}
		
		
		  
	public static void main(String args[]){  
		
	    shapeassign s2 = new shapeassign(5);  
	    shapeassign s3 = new shapeassign(6,7);  
	    shapeassign s4 = new shapeassign(8.2f);
	    
	    shapeassign ob = new shapeassign();
	      ob.area2(10,12);
	      ob.area2(10.1f,12.2f);
		    }  

}


