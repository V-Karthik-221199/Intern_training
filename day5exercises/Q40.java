package day5exercises;

class Base{
	Base(int i){
		System.out.println("base constructor");
	}
	Base(){
	}
}

public class Ex40 extends Base{
	public static void main(String argv[]){
		Ex40 s= new Ex40();
		//One
	}
	Ex40()	
	{
		//Two
		super(10); // Constructors can only be invoked from within constructors
	}
	public void derived()
	{
		//Three
	}
}

