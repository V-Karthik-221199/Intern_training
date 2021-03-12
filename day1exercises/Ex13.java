package day1exercises;
import java.util.Scanner;

public class Ex13 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int nstud = s.nextInt();
		System.out.println("Enter number of subjects: ");
		int nsub = s.nextInt();
		int marks[][] = new int[nstud][nsub];
		
		for(int i=0; i<nstud; i++) {
			System.out.println("Enter Student "+(i+1)+" marks:::");
			for(int j=0; j<nsub; j++) {
				System.out.println("Enter sub "+(j+1)+" mark: ");
				marks[i][j] = s.nextInt();
			}
			System.out.println("");
				
		
		}
			
		HelperFunctions hf = new HelperFunctions();
		hf.calculateResult(marks, nstud, nsub);
		s.close();
		
	}
}


