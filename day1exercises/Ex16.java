package day1exercises;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HelperFunctions hf = new HelperFunctions();
		int arr[] = hf.scanArray();
		
		System.out.println("Enter key to be searched: ");
		int key = sc.nextInt();
		Helper16 h16 = new Helper16();
		h16.displayLocAndFreq(arr, key, arr.length);
		sc.close();
	}

}

class Helper16 {
	public void displayLocAndFreq(int arr[], int key, int size) {
		int count = 0;
		int val = 0;
		int loc[] = new int[size];
		int k=0;
		
		for(int i=0; i<size; i++) {
			if(key == arr[i]) {
				count++;
				val = 1;
				loc[k++] = i+1;
			}
		}
		
		if(val == 0)
			System.out.println(key+ " is not found");
		else
			System.out.println(key+" is found "+count+" times at the location: ");
		
		for(int i=0; i<size; i++)
			if(loc[i] != 0)
				System.out.print(loc[i]+" ");
	}
}