package methodandconstructor;

class Shapes{
	float getAreaofshape(float a, float b) {
		return 0;
	}
	}

	class Rectangle extends Shapes {
	float getAreaofshape(float l, float b) {
		return (l*b);
	}
	}

	class Triangle extends Shapes {
	float getAreaofshape(float b, float h) {
		return (b*h/2);
	}
	}

	class Square extends Shapes {
	float getAreaofshape(float n1, float n2) {
		return (n1*n2);
	}	
	}

	class Rhombus extends Shapes {
	float getAreaofshape(float d1, float d2) {
		return (d1*d2/2);
	}
	}

public class Polymorphism {
	public static void main(String args[]) {

		Shapes s; 

		s = new Rectangle(); 
		System.out.println("Area of Rectangle = " + s.getAreaofshape(4.8f,5.6f));

		s = new Triangle(); 
		System.out.println("Area of Triangle = " + s.getAreaofshape(3.0f,5.8f));

		s = new Square(); 
		System.out.println("Area of Square = " + s.getAreaofshape(7.0f,7.0f));
		
		s = new Rhombus(); 
		System.out.println("Area of Rhombus = " + s.getAreaofshape(2.5f,3.0f));
	}
}