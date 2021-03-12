package day5exercises;


class Q33 implements Runnable{
	int i=0;
	public int run(){ // throws an error: The return type is incompatible with Runnable.run()
		while(true){
			i++;
			System.out.println("i="+i);
		} //End while
		return 1;
	}//End run
}//End class

/*
 * The code will cause an error at compile time

The error is caused because run should have a void not an int return type.
Any class that is implements an interface must create a method to match all of the methods in the interface. 
The Runnable interface has one method called run that has a void return type.

 */