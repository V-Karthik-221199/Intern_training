package day1exercises;


public class Ex23 {
	public static void main(String[] args) {
		SecondClass secondObj = new SecondClass();
		secondObj.met();
	}
}

class FirstClass {
	protected int var = 3;
}

class SecondClass {
	public void met()
	{
		FirstClass firstObj = new FirstClass();
		System.out.println(firstObj.var);
	}
	
}

