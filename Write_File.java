package Exp10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_File {

	public static void main(String[] args) {
	try {
		 FileOutputStream fos=new FileOutputStream("D:/myprofile/MyFile.txt");
	     String msg="Welcome to Java Class";
	    byte b[]=msg.getBytes();      
	    FileInputStream fis=new FileInputStream("D:/myprofile/MyFile.txt");
		
//Method1
	     //for(byte x:b)
		// fos.write(x);
	  
//Method 2  
	    fos.write(b);

//Method 3
	//	fos.write(b,11,msg.length()-11);
	    int x;
		
		while((x=fis.read())!=-1) {
			
			System.out.print((char)x);
		}
		 fos.close();
	
	} catch (FileNotFoundException e) {
		System.out.println(e);
	}catch (IOException e) {
		System.out.println(e);
	}
	
	}
}