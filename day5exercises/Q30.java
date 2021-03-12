package day5exercises;


public class Q30 {
	public static void main(String argv[]){ }
	/*Modifier at XX */ class MyInner {}
	public class Pub {}
	private class Pri {}
	static class Stat {}
	// All the above modifiers are supported
	friend class Fri {} // friend is not a modfier
}