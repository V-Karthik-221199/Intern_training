package day5exercises;


public class Q2 {
	public static void main(String arguments[]) {
		amethod(arguments);
		/* Can't make static reference to void amethod().
		 * Because main is defined as static you need to create an instance of the class in order to call any non-static methods. 
		  */
		
	}
	public void amethod(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments[1]);
	}
}