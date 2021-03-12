package day1exercises;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int n, arr[], i, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n = s.nextInt();
		arr = new int[n];
		for( i=0; i<n; i++ ) {
			System.out.println("Enter a number: ");
			arr[i] = s.nextInt();
		}
		
		HelperFunctions hf = new HelperFunctions();
		result = hf.SumOfN(arr);
		System.out.println("Sum of the Given Numbers: "+result);
		
		s.close();
				
	}

}
