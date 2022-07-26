package datatypeassignments;

public class datatypeass2 {

	public static void main(String[] args) {
		
				System.out.println("Conversion of float to long.");
				float i = 10.92f;
				System.out.println("float value = "+ i);
		        long l = (long)i;        
		        System.out.println("long value = "+ l);
		        
		        System.out.println("\nConversion: double>>long>>int>>char");
		        double d = 100.7895;
		        System.out.println("double value = "+ d);
		        
		        long g = (long)d;
		        System.out.println("long value = "+ g);
		        
		        int o =(int) g;   
		        System.out.println("int value = "+ o);
		        
		        char t=(char) o;
		        System.out.println("char value = "+ t);
	
		        System.out.println("\nConversion of long to byte.");
		        long ii = 257;
		        byte b = (byte) ii;     
		        System.out.println("long value = " + ii + " byte value = " + b); 
		        
		        int i2 = 67;
		        double d2 = i2;
		        long l2 = (long) d2;
		        System.out.println("\nConversion of int>>double>>long.");
		        System.out.println("Int value = "+i2);
		        System.out.println("Double value = "+d2);
		        System.out.println("Long value = "+l2);
		        
		        
		         
		        
		        
		    } 
	}
