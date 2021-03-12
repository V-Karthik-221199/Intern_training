package day1exercises;

public class Ex25 {
	public static void main(String[] args) {
		
	}
}
protected class Base{ // error: Illegal modifier for the class Base; only public, abstract & final are permitted
	String method() {
		return "wow";
	}
}

class Derived{  
	public void useD() {
		Base z = new Base();
		System.out.println("base says "+z.method());
		
	}
}