package day5exercises;

public class Q14 {
	public static void main(String[] args) {
		// 1.
		int i=0;
		if(i) { // 1 will not compile because 'if' must always test a boolean.


			System.out.println("Hello");
		}
		
		//2.
		boolean b=true;
		boolean b2=true;
		if(b==b2) {
			System.out.println("So true");
		}

		//3.
		int i=1;
		int j=2;
		if(i==1|| j==2)
			System.out.println("OK");

		//4.
		int i=1;
		int j=2;
		if(i==1 &| j==2) // syntax error | must be removed
			System.out.println("OK");
	}
	/* 2 and 3  will compile withou error */
}
