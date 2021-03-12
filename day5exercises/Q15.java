package day5exercises;

import java.io.*;
public class Q15 {
	public static void main(String argv[]){
		Q15 q = new Q15();
		System.out.println(q.amethod());
	}
	public int amethod() {
		try {
			FileInputStream dis=new FileInputStream("Hello.txt");
		}catch (FileNotFoundException fne) {
			System.out.println("No such file found");
			return -1;
		}catch(IOException ioe) {
		} finally{
			System.out.println("Doing finally");
		}
		return 0;
	}
	
	// O/P:  No such file found, doing finally, -1
	
	/* The no such file found message is to be expected, however  
	 the finally clause is almost always executed, even if there is a return statement. */
}