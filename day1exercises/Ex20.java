package day1exercises;


public class Ex20 {
	public static void main(String[] args) {
		HelperFunctions hf = new HelperFunctions();
		int[][] mat = hf.scanMatrix();
		hf.printMatrix(mat);
		int i,j;
		for(i=0;i<mat.length;i++)
			System.out.println("Maximum element of Row "+(i+1)+" is "+findMax(mat[i]));
	}
	static int findMax(int arr[])
	{
		int i,max=0;
		for(i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}
}
