package day5exercises;

public class Q25 {
	public static void main(String[] args) {
		Integer ten=new Integer(10); // warning: The constructor Integer(int) is deprecated since version 9
		Long nine=new Long (9); // warning: The constructor Long(long) is deprecated since version 9
		System.out.println(ten + nine);
		int i=1;
		System.out.println(i + ten);
		
		// O/P:
		// 19 followed by 11
	}
}
