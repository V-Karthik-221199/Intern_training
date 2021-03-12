package day5exercises;

class Base{
	public void amethod(int i) { }
}
public class Q23 extends Base{
	public static void main(String argv[]){

	}
	
	//option 1
	// void amethod(int i) throws Exception {}
	 
	
	//Method Here
	//option 2
	void amethod(long i)throws Exception {} // or
	
	// option 3
	// void amethod(long i){}
	
	// option 4
	// public void amethod(int i) throws Exception {}
}



/* Options 1, & 4 will not compile as they attempt to throw Exceptions not declared in the base class.
 * Because options 2 and 3 take a parameter of type long they represent overloading not overriding and there is no such limitations on overloaded methods. */
 */