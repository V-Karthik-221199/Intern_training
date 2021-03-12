package day11exercises;

public class Ex5 {
	public static void main(String[] args) {
		try {
			met(); // error: Unhandled exception type CustomException
		} 
//		catch (Exception e) {
//			System.out.println(e); 
//		}
		finally {
			System.out.println("finally block..");
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
