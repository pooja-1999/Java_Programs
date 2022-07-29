package methodandconstructor;

abstract class Vehicle {
	int speed = 100;
	long distance= 8343;
	Vehicle() {
		System.out.println("Vehicle is created");
	}
	Vehicle(int k) {
		System.out.println("Vehicle = "+k);
	}

	abstract void run();
	abstract void stop();

	public void fuel(int i) 
	{
		System.out.println("Fuel with integer value = "+i);
	}
	public void fuel(float f, String s) 
	{
		System.out.println("Fuel with float and string = "+ f+" and "+s);
	}
	public void fuel(char c, int i) 
	{
		System.out.println("Fuel with char and int = "+ c +" and "+i);
	}
}

class W2 extends Vehicle{
	
	int no_of_tyres = 2;
	int speed = 79;
	long distance = 8989;
	
	
	void run()
	{
		System.out.println("Run is created");
	}
	void  stop(){
		System.out.println("Stop is created");
	}
	W2(){
		super(6);
		System.out.println("2W is created");
	}
	void display()
	{System.out.println("2W-Speed = "+speed+" 2W-Distance = "+distance+" 2W-No. of Tyres = "+no_of_tyres);
	 System.out.println("Vehicle-Speed = "+super.speed+" Vehicle-Distance = "+super.distance);
	}
}
	

public class VehicleAssign { 
	public static void main(String args[]) {

		Vehicle k = new W2();
		
		k.fuel(4);
		k.fuel(3.4f, "Petrol");
		k.fuel('D',7);
		k.run();						
		k.stop();

		W2 c = new W2();
		c.display();
		
		
		

	}

}
