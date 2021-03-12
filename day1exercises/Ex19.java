package day1exercises;

public class Ex19 {
	public static void main(String[] args) {
		HelperFunctions hf = new HelperFunctions();
		int[][] mat = hf.scanMatrix();
		System.out.println("Original Matrix: ");
		hf.printMatrix(mat);
		Helper19 h19 = new Helper19();
		int[][] resMat = h19.reverseMatrix(mat);
		System.out.println("Reversed Matrix: ");
		hf.printMatrix(resMat);
	}
}

class Helper19 {
	public int[][] reverseMatrix(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		int[][] reverseMat=new int[row][col];
		int i,j;
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				reverseMat[i][j]=mat[i][col-j-1];
		return reverseMat;
	}
}
