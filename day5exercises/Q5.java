package day5exercises;

public class Q5{
	public static void main(String argv[])
	{
		System.out.println(argv[2]); 
		/*
		 *  Exception raised: "java.lang.ArrayIndexOutOfBoundsException: 2"
		 *  zero starts with good, morning would be 1 and there is no parameter 2 so an exception is raised 
		 * 
		 *  o/p: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
			at day5exercises.Q5.main(Q5.java:6)
	
	*/
	}
}