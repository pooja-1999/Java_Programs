package datatypeassignment;

public class typecasting {
	public static void main(String[] args) 
    { 
		System.out.println("Conversion of float>>long");
        float f = 5.67f;
        System.out.println("float value = "+ f);
        
		long l = (long)f;      
        System.out.println("long value = "+ l);
        
        System.out.println("Conversion of double>>long>>int>>char");
        
        double d=100.567;
        System.out.println("double value = "+ d);
        long e = (long)d;
        System.out.println("long value = "+ e);
        int o =(int) e;   
        System.out.println("int value = "+ o);
        char t=(char) o;
        System.out.println("char value = "+ t);
        
        System.out.println("Conversion of int>>double>>long");
        int i1 = 56;
        double h = i1;
        long r= (long) d;   
        System.out.println("integer value = "+ i1);
        System.out.println("double value = "+h); 
        System.out.println("long value = "+r); 
   
        System.out.println("Conversion of long to byte.");
        long l2 = 67;
        byte b = (byte) l2;     
        System.out.println("long value = " + l2 + " byte value = " + b); 
  
    } 

}
