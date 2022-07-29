package methodandconstructor;


	
	abstract class MNC {
		MNC() {
			System.out.println("MNC is created");
		}

		abstract void absmethod1();
		abstract void absmethod2();

		void Normethod1() 
		{
			System.out.println("normal method 1 is created");
		}
	}

	abstract class Infosys extends MNC {
		
		void absmethod1()
		{
			System.out.println("abstract method 1 is created");
		}
		abstract void absmethod2();
	}	
	
	class Hello extends Infosys {
		void absmethod2() {
			System.out.println("abstract method 2 is created");
		}
		
		void normethod2(){
			
			System.out.println("normal method 2 is created");
		}
	}


	public class AbstractAss { 
		public static void main(String args[]) {

			MNC k = new Hello(); 
			k.Normethod1();						
			k.absmethod1();
			k.absmethod2();
			
			Hello c = new Hello();
			c.normethod2();
			
			
		}

}
