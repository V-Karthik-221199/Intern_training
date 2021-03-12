package day11exercises;

public class Ex4 {
	public static void main(String[] args) {
		try {
			met();
		} catch (Exception e) {
			System.out.println(e); 
		}
	}
	
	public static void met() throws CustomException {
		throw new CustomException("this is custom exception");
	}
}


class CustomException extends Exception {
	String msg;
	public CustomException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Exception: "+msg;
	}
}
