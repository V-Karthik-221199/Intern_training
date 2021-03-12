package day5exercises;


abstract class MineBase {
	abstract void amethod();
	static int i;
}

public class Q11 extends MineBase { // Error Q11 must be declared abstract
	/* A class that contains an abstract method must itself be declared as abstract.
	 * It may however contain non abstract methods. Any class derived from an abstract class 
	 * must either define all of the abstract methods or be declared abstract itself. */
	public static void main(String argv[]){
		int[] ar=new int[5];
		for(i=0;i < ar.length;i++)
			System.out.println(ar[i]);
	}
}