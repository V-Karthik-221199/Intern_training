package day1exercises;

public class Ex3 {
	public static void main(String[] args) {
		int i = 50;
		float f = 1.1f;
		char c = 'a';
		double d = 2.25462155;
		boolean bool = true;
		byte b = 1;
		short s = 2;
		long l = 9999999;
		System.out.println("Original Values: ");
		System.out.println("");
		System.out.println("Integer: "+i);
		System.out.println("Float: "+f);
		System.out.println("Char: "+c);
		System.out.println("Double: "+d);
		System.out.println("Boolean: "+bool);
		System.out.println("Byte: "+b);
		System.out.println("Short: "+s);
		System.out.println("Long: "+l);
		System.out.println(" ");
		System.out.println("After Typecasting::: ");
		System.out.println("");
		double tdi = i; 
		System.out.println("Implicit Int->Double: "+tdi);
		
		System.out.println("Explicit Double->Int: "+(int)d);
		System.out.println("Explicit Char->Int: "+(int)c);
		
		
		
	}
	
}
