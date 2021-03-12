package day11exercises;

import java.io.IOException;

public class Ex3 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			//throw new IOException();
			// return;
			System.exit(0); // program terminates and no output is printed
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	   public static void main(String p[]) {
	    	Ex3 e = new Ex3();
	    	e.mth1();
	    }
}
