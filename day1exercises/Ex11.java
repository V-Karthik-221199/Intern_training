package day1exercises;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int rows,value=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		rows=sc.nextInt();
		int mat[][]=new int[rows][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++)
				mat[i][j]=value++;
		}
		Helper11 h = new Helper11();
		h.printRectMat(mat,rows);
		sc.close();

	}

}


class Helper11 {
	public void printRectMat(int[][] mat,int rows) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(mat[i][j]+"  ");
			System.out.println();
		}
	}
}