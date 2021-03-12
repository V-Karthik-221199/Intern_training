package day1exercises;

public class Ex9 {
	public static void main(String[] args) {
		int arr[], reversedArray[];
		HelperFunctions hf = new HelperFunctions();
		arr = hf.scanArray();
		System.out.println("Original Array: ");
		hf.printArrayElements(arr);
		reversedArray = hf.reverseArray(arr, arr.length);
		System.out.println("Reversed Array: ");
		hf.printArrayElements(reversedArray);
	
		
		
	}
}
