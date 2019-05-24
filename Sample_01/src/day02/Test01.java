package day02;
import java.util.Date;
public class Test01 {

	public static void main(String[] args) {
		
		char i; //local variable
		
		i = 'a';
		System.out.println(i);
		
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d2 = d;		
		d=null;
		
		String ss = new Date().toString();
		System.out.println(ss);
		
		double p1 = Math.PI;
		double r = Math.random();
		int r1 = (int)Math.random();
		System.out.println(p1+","+r+","+r1);
		System.out.printf("p1 =%f, r = %f r1 = %d %n",p1,r,r1);
		System.out.printf("p1 =%.4f, r = %.2f r1 = %d %n",p1,r,r1);
		
		String s1 =  new String("hello"); //힙영역에 올라감
		String s2 =  "hello";//코드영억에 들어감
	}
	

}
