package abc;

import java.io.*;


public class BufferReadEx {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Please Enter Your Name:");
		String name = br.readLine();
		
		//System.out.println("Please Enter Your Name:");
		//String name1 = scan.next(); This doesn't accept spaces between Strings entered as input.
		
		System.out.println("Please Enter Your Age:");
		System.out.println("");
		
		int age = br.read();
		
		System.out.println("Name is: "+name);
		System.out.println("Age of "+name+" is : "+age);
	}

}
