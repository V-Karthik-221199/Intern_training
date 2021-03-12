package day5exercises;

public class Q13 {
	public static void main(String[] args) {
		int i=9;
		switch (i) {
		default:
		System.out.println("default");
		case 0:
		System.out.println("zero");
		break;
		case 1:
		System.out.println("one");
		case 2:
		System.out.println("two");
		}
		// O/P: default, zero
		
		/* Although it is normally placed last the default statement does not have to be the last item as you fall through the case block.
		 * Because there is no case label found matching the expression the default label is executed and the code continues to fall through until it encounters a break.

 */
	}
}
