package day1exercises;

import java.util.Scanner;

public class HelperFunctions {
	public boolean checkPrime(int n) {
		for(int i=2; i <= Math.sqrt(n); i++ )
			if( n % i == 0) 
				return false;
		return true;
	}
	public int SumOfN(int[] arr) {
		int sum = 0;
		for(int x:arr)
			sum += x;
		return sum;
	}
	public void printArrayElements(int[] arr) {
		System.out.println("The Array elements are : ");
		for(int x:arr)
			System.out.println(x);
	}
	public int[] resizeArray(int[] arr, int ns) {
		int newArray[], i;
		newArray = new int[ns];
		
		for( i=0; i < arr.length; i++)
			newArray[i] = arr[i];
		
		return newArray;
	}
	public int[] sortArray(int[] arr, int oKey) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {
            	if( oKey == 0 ) {
            		if(arr[i] > arr[j]) {    
                        temp = arr[i];    
                        arr[i] = arr[j];    
                        arr[j] = temp;    
                    }
            	}
            	else {
            		if(arr[i] < arr[j]) {    
                        temp = arr[i];    
                        arr[i] = arr[j];    
                        arr[j] = temp;    
                    }
            	}
                    
            }     
        }
		return arr;
	}
	
	public int[] scanArray() {
		int n, arr[], i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		n = s.nextInt();
		arr = new int[n];
		for( i=0; i<n; i++ ) {
			System.out.println("Enter the number: ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public int findIndex(int[] arr, int ele) {
		for( int i=0; i<arr.length; i++ )
			if( arr[i] == ele )
				return i+1;
		return -1;
	}
	
	public int[] reverseArray(int[] arr, int n) {
		int[] revArray = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            revArray[j - 1] = arr[i]; 
            j = j - 1; 
        }
        return revArray;
	}
	
	public int[][] scanMatrix() {
		Scanner s = new Scanner(System.in);
		 
        int i,j,row,col;

        System.out.println("Enter the number of rows:");
        row = s.nextInt();
        System.out.println("Enter the number of columns:");
        col = s.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the elements of the matrix") ;
        for(i=0;i<row;i++)
        { 
        	for(j=0;j<col;j++)
        	{ 
        		mat[i][j] = s.nextInt();
        	}
        }
        
        return mat;
	}
	
	public void printMatrix(int[][] mat) {

	    	int row = mat.length;
	    	int col = mat[0].length;
		   	System.out.println("The elements of the matrix: ") ;
		   	System.out.println("");
		    for(int i=0;i<row;i++)
		    { 
		     for(int j=0;j<col;j++)
		     { 
		       System.out.print(mat[i][j]+"  ");
		     }
		      System.out.println("");
		      System.out.println("");
		    }
		    
	}
	
	public void calculateResult(int marks[][], int nstud, int nsub) {
		int tot;
		int avg;
		
		for(int i=0; i < nstud; i++) {
			tot = 0;
			avg = 0;
			for(int j=0; j<nsub; j++) {
				tot += marks[i][j];
			}
			avg = tot/nsub;
			System.out.println("Total Marks of Student "+(i+1)+": "+tot);
			System.out.println("Average of Student "+(i+1)+": "+avg);
			System.out.println("");
		}
	}
         
}
