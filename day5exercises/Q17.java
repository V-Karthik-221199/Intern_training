package day5exercises;


class Base {}
class Sub extends Base {}
class Sub2 extends Base {}

public class Q17 {
	public static void main(String argv[]){
		Base b=new Base();
		Sub s=(Sub) b;
	}
}

/* Runtime Exception occurs  */