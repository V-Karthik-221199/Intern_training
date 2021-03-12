package day11exercises;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int d;
		String n;
		double res;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Numertor: ");
			n = scan.next();
			if(n.startsWith("q") || n.startsWith("Q"))
				System.exit(0);
			int nn = Integer.parseInt(n);
			System.out.println("Enter Divisor: ");
			d = scan.nextInt();
			try {
				if(d == 0)
					throw new CustomException2("Division by Zero is not allowed..please enter a number other than zero");
				res = nn/d;
				System.out.println("Result: "+res);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
	}
}


class CustomException2 extends Exception {
	String msg;
	public CustomException2(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Exception: "+msg;
	}
}