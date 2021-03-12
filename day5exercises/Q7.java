package day5exercises;

public class Q7 {
	public static void main(String[] args) {
		/* An identifier can begin with a letter (most common) or a dollar sign($) or an underscore(_).
		 * An identifier cannot start with anything else such as a number, a hash, # or a dash -. An identifier cannot have a dash in its body,
		 *  but it may have an underscore _. Choice 4) _3_ looks strange but it is an acceptable, 
		 *  if unwise form for an identifier. */
		
		int 2variable; // not accepted
		int variable2;// accepted
		int _whatavariable;// accepted
		int _3_;// accepted
		int $anothervar;// accepted
		int #myvar;// not accepted
	}
}


