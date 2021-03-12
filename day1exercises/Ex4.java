package day1exercises;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = s.nextInt();
		HelperFunctions hf = new HelperFunctions();
		boolean flag = hf.checkPrime(n);
		if(flag)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
		s.close();
		
	}
}

