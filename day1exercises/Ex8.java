package day1exercises;

import java.util.Scanner;


public class Ex8 {
	public static void main(String[] args) {
		int arr[],loc,ele;
		HelperFunctions hf = new HelperFunctions();
		arr = hf.scanArray();
		hf.printArrayElements(arr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element whose location to be searched: ");
		ele = s.nextInt();
        loc = hf.findIndex(arr, ele);
        if( loc == -1)
        	System.out.println("The element "+ele+" is not found in the array!!!");
        else
        	System.out.println("The element "+ele+" is located at the position: "+loc);
	}
}
