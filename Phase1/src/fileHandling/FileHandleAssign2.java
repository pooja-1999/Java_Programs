package fileHandling;

import java.io.BufferedOutputStream; 
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.IOException; 

public class FileHandleAssign2 {
	public static void main(String[] args) throws IOException  
    { 
         
        DataInputStream dis=new DataInputStream(System.in); 
        FileOutputStream fout=new FileOutputStream("D://ME//phase1.txt",true); 
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        bout.close(); 
   
        FileInputStream fin= new FileInputStream("D://ME//phase1.txt"); 
        System.out.println(fin.getChannel()); 
        System.out.println("Number of bytes read:"+fin.available()); 
         
        System.out.println("FileContents :"); 
        int c; 
        while((c=fin.read())!=-1) 
        	System.out.print((char)c); 
        fin.close(); 
}
}