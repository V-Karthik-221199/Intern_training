package collections_practise;

import java.util.HashMap;

public class Program7 {
	public static void main(String[] args) {
		HashMap obj = new HashMap();
		obj.put("A", new Integer(1));
		obj.put("B", new Integer(2));
		obj.put("C", new Integer(3));
		System.out.println(obj.entrySet());
	}
}
