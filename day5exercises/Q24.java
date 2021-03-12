package day5exercises;

public class Q24 {
	public static void main(String[] args) {
		// Options 1 and 2 will produce -5 and option 4 will not compile because the min method requires 2 parameters.
		
		/* 1) */ System.out.println(Math.floor(-4.7));
		/* 2) */ System.out.println(Math.round(-4.7));
		/* 3) */ System.out.println(Math.ceil(-4.7)); // will produce the desired output 4.0
		/* 4) */ // System.out.println(Math.min(-4.7));

	}
}
