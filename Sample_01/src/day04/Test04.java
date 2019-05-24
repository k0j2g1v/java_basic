package day04;

public class Test04 {

	public static void main(String[] args) {
		String[] s = {"Java programing","JDBC","Oracle10g","JSP/servlet"};
		
		
			for(String data:s) {
				for(int  i = data.length()-1; i>=0;i--){
					System.out.print(data.charAt(i));
				}
			System.out.println();
		}
		

	}

}
