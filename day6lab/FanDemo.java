package day6lab;

import java.util.Scanner;

public class FanDemo {
	public static void main(String[] args) throws Exception {
//		BadFan shaitan=new BadFan();
		Scanner scan=new Scanner(System.in);
		String[] classes = {"On","Medium","High","Off"};
		int c = 0;
		while(true) {
			System.out.println("Please enter to call pull method....");
			scan.next();
			KaithanFan kaithan = Container.triggerKaithanFan(classes[c%4]);
			kaithan.pull();
			c += 1;
		}
	}
}

class Container{
	static int c = 0;
	public static KaithanFan triggerKaithanFan(String classname) throws Exception {
		KaithanFan kf = new KaithanFan();
		State state = (State)Class.forName("day6lab."+classname).newInstance();
		kf.state = state;
		return kf;
	}
}


//class BadFan{
//	int state=0;
//	public void pull() {
//		if(state==0) {
//			System.out.println("switch on state....");
//			state=1;
//		}
//		else if(state==1) {
//			System.out.println("medium speed state...");
//			state=2;
//		}
//		else if(state==2) {
//			System.out.println("high speed state...");
//			state=3;
//		}
//		else if(state==3) {
//			System.out.println("switch off state...");
//			state=0;
//		}
//	}
//}
class KaithanFan{
	State state;
	public void pull() {
		System.out.println(state);
	}
}

abstract class State { 
	
}

class On extends State {
	
}

class Medium extends State {
	
}

class High extends State {
	
}

class Off extends State {
	
}