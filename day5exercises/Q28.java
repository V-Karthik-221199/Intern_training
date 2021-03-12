package day5exercises;

public class Q28 {
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("there");
		String s3=new String();
		
		s3=s1 + s2; // only this operation works ( string concatination )
		// Below operations are not supported
		s3=s1-s2;
		s3=s1 & s2;
		s3=s1 && s2;
	}
}
