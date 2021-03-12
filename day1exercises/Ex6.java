package day1exercises;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int n, arr[], i, resizedArray[], newSize;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial size of array: ");
		n = s.nextInt();
		arr = new int[n];
		for( i=0; i<n; i++ ) {
			System.out.println("Enter the number: ");
			arr[i] = s.nextInt();
		}
		System.out.println("Enter new size for the array: ");
		newSize = s.nextInt();
		s.close();
		HelperFunctions hf = new HelperFunctions();
		resizedArray = hf.resizeArray(arr,newSize);
		hf.printArrayElements(resizedArray);
		System.out.println("Resized Array Size: "+resizedArray.length);
	}
}
