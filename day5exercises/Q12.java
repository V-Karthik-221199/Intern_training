package day5exercises;

public class Q12 {
	public static void main(String[] args) {
		int i=1;
		switch (i) {
		case 0:
		System.out.println("zero");
		break;
		case 1:
		System.out.println("one");
		case 2:
		System.out.println("two");
		default:
		System.out.println("default");
		}
		/* O/P: one, two, default
		Code will continue to fall through a case statement until it encounters a break. */
	}
}
