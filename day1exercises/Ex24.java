package day1exercises;


public class Ex24 {

	
	//equation of the form ax^2+bx+c
	private int a;
	private int b;
	private int c;
	
	public Ex24() {
		this.a=1;
		this.b=1;
		this.c=1;
	}
	
	public Ex24(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void modifyValues(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	
	public long compute(int x) {
		return (this.a*(x*x))+(this.b*x)+this.c;
		
	}
	public static void main(String[] args) {
		Ex24 obj1 = new Ex24(); //without arguments
		System.out.println("Result with Default Values: "+obj1.compute(2));
		obj1.getA();
		obj1.getB();
		obj1.getC();
		obj1.modifyValues(3, 9, 9);
		System.out.println("Result with Modified Values: "+obj1.compute(2));
		Ex24 obj2 = new Ex24(2,2,1); // with arguments
		System.out.println("Result with Constructor Values: "+obj2.compute(2));

	}
}

