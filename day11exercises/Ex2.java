package day11exercises;

import java.io.IOException;

public class Ex2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			throw new IOException();
			// return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	   public static void main(String p[]) {
	    	Ex2 e = new Ex2();
	    	e.mth1();
	    }
}


// OP: finally-mth2
//     caller

// After throwing IOException in line1

// OP2: catch-mth2
//		finally-mth2
//		caller
