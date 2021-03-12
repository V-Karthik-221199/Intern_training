package day11exercises;

import java.io.IOException;

public class Ex1 {
 public static void main(String[] args) {
	ExceptionDemo.met();
}
}

class ExceptionDemo {
	public static void met() {
		throw new IOException(); // Unhandled exception type IOException
	}
}