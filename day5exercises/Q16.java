package day5exercises;

public class Q16 {
	public static void main(String[] args) {
		int a = statmet(3);
		int b = statmet(3, 9);
		System.out.println(a+", "+b);
		/* Answer: Methods cannot be overriden to be more private */
	}
	static int statmet(int i) {
		return 0;
	}
	static int statmet(int i, int j) {
		return 1; 
	}
}
