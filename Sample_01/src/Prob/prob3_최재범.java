package Prob;

public class prob3_최재범 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.
		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			//System.out.print(c);
			
			
			
			 // if(ch == ' ') sb.append(ch); else if(ch + 3 <= 122) sb.append((char)(ch +
			 // 3)); else if(ch + 3 < 97) sb.append((char)(ch + 3 +26)); else if(ch + 3 >
			 // 122) sb.append((char)(ch + 3 - 26));
			 
			// c = 3>='a' &&c<='w' ? (char)(c+3):
			// (c>='x' && c<='z')?(char)(c-23):c;
			// else if (ch == ' ') sb.append(ch);
			c = c >= 'a' && c <= 'z' ? (char) ('a' + ((c - 'a') + 3) % 26) : c;
			sb.append(c);
		}
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		encodedString = sb.toString();
		// 프로그램 구현부 끝.
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}
}
