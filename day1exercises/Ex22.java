package day1exercises;


public class Ex22 {

	public static void main(String[] args) {
		AccessSpecifiersDemo obj = new AccessSpecifiersDemo();
		System.out.println("Private Variable Value"+obj.pri); // Private Variable is not accessible
		System.out.println("Protected Variable Value"+obj.pro);
		System.out.println("Default Variable Value"+obj.nomod);
		System.out.println("Public Variable Value"+obj.pub);
		obj.privateTest();  //Private Method is Not accessible
		obj.protectedTest();
		obj.defaultMethod();
		obj.publicTest();
	}

}

class AccessSpecifiersDemo{
	// variables
	int nomod = 2;
	private int pri = 3;
	protected int pro = 5;
	public int pub = 7;
	
	//methods
	private void privateTest() {
		System.out.println("Private Method");
	}
	protected void protectedTest() {
		System.out.println("Protected Method");
	}
	void defaultMethod() {
		System.out.println("Default Method");
	}
	public void publicTest() {
		System.out.println("Public Method");
	}
}