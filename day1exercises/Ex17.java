package day1exercises;

// 17a. to modify const member

/*

public class Ex17 {
	public static void main(String[] args) {
		final int num = 1;
		num = 5; //it will throw a compile time error as constant/final variable value cannot be changed
	}
}
*/


// 17b. to access static member in a non-static method

public class Ex17 {
	private static int staticVar = 1;
	private void nonStaticMethod() { 
		System.out.println(staticVar); 
		}

	public static void main(String[] args) {
		Ex17 obj=new Ex17();
		obj.nonStaticMethod();
	}
}


//17c. constructor- initiate obj without param

/*
public class Ex17 {
	public static void main(String[] args) {
		 Test t = new Test(); // throws error as we have to pass a value as arguments to the constructor
	}
}
	class Test
	{
		Test(int n)
		{
			System.out.println("passed arg value: "+n);
		}
	}
*/