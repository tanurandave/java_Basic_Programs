package Exp10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input_Output_Stream_Read_File {
	public static void main(String[] args) {
	try
		{
		FileInputStream fis=new FileInputStream("D:/myprofile/MyFile.txt");
		
		//Method 1
		int x;
		
		while((x=fis.read())!=-1) {
			
			System.out.print((char)x);
		}
		
		
      //Method 2
		
		/*byte b[]=new byte[fis.available()];
		fis.read(b);
		String msg=new String(b);
		System.out.println(msg);
			*/
	
      
      //Method 3
	
		/*fis.skip(5); //Skipping first 5 Character
		byte b[]=new byte[fis.available()];
		//fis.read(b);
		fis.read(b,0,b.length);
		String msg=new String(b);
		System.out.println(msg);
		*/
		
	fis.close();	
	}catch (FileNotFoundException e) {
		System.out.println(e);
	}catch (IOException e) {
		System.out.println(e);
	}
	
	}
}
