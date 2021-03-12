package day1exercises;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int n, arr[], i, orderKey, sortedArray[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		n = s.nextInt();
		arr = new int[n];
		for( i=0; i<n; i++ ) {
			System.out.println("Enter the number: ");
			arr[i] = s.nextInt();
		}
		System.out.println("Enter 0 for Ascending sort or 1 for Descending sort: ");
		orderKey = s.nextInt();
		s.close();
		HelperFunctions hf = new HelperFunctions();
		sortedArray = hf.sortArray(arr,orderKey);
		System.out.println("After Sorting ::: ");
		hf.printArrayElements(sortedArray);
		
	}
}
