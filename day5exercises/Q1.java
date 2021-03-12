package day5exercises;

public class Q1 {
	public static void main(String[] args) {
		float f=1.3; // Will not compile because the default type of a number with a floating point component is a double. This would compile if it is written like this float f = 1.3f;
		char c="a"; // Will not compile because a char (16 bit unsigned integer) must be defined with single quotes. This would compile if it is written like this char c = 'a';
		byte b=257; // Will not compile because a byte is eight bits. Take of one bit for the sign component you can define numbers between -128 to +127
		boolean b=null; // a boolean value can either be true or false, null is not allowed
		int i=10; // this line will compile and run without error
		
	}
}
