package day09.exception;

public class Test02 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
			
			//throw new Exception("고의로 발생시켰음");
			
			
		} catch (Exception e) {
		System.out.println("에러 메세지 : " + e.getMessage());
		e.printStackTrace();
	}
		System.out.println("프로그램이 종료되었음.");
}
}