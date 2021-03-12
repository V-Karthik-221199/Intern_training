package day1exercises;

public class Ex27 {
	public static void main(String[] args) {
		double amt = 14000 + ( 0.40*14000 );
		System.out.println("The amount is: "+amt+" at the end of First Year");
		
		amt = amt - 1500;
		System.out.println("The amount is: "+amt+" at the end of Second Year");
		
		amt = ( amt*0.12 ) + amt;
		System.out.println("The amount is: "+amt+" at the end of Third Year");
	}
}
