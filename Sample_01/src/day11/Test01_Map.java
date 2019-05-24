package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

import javax.security.auth.kerberos.KerberosKey;

public class Test01_Map {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<String, String>();
		map.put("fava01", "1234");
		map.put("fava02", "3456");
		map.put("fava03", "1523");
		map.put("fava04", "1252");
		map.put("user05", "4286");
		map.put("user06", "6473");
		
		map.forEach((String t, String u)->{System.out.println(t+"  "+u);});
		map.forEach((t,u) -> System.out.println(t+"="+u));
		
		
		//map.put("fava01", "9752");
		
		/*
		 * System.out.println(map); Set<String> key = map.keySet(); Iterator<String> it
		 * = key.iterator(); while (it.hasNext()) { String keyname = (String) it.next();
		 * System.out.println(keyname+"/"+map.get(keyname)); }
		 * System.out.println(map.containsKey("fava01"));
		 */
		
		/*
		 * Scanner input = new Scanner(System.in); while(true) {
		 * System.out.println("ID 와 PW를 입력하세요.."); System.out.println("ID : ___");
		 * String id = input.nextLine().trim(); System.out.println("PW : ___"); String
		 * pw = input.nextLine().trim();
		 * 
		 * if(!map.containsKey(id)) { System.out.println("입력하신 ID 는 존재하지 않습니다..");
		 * continue; }else { if(!pw.equals(map.get(id))) { System.out.println("로그인 실패");
		 * }else { System.out.println("로그인 성공"); } } }
		 */		
	}
}
