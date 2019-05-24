package day10_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		// HashSet = 중복제거 TreeSet = 중복제거 + 순서나열
		Set<Book> set = new TreeSet<Book>();
		set.add(new Book("java",800));
		set.add(new Book("sql",800));
		set.add(new Book("DB",800));
		set.add(new Book("sql",800));
		set.add(new Book("sql",800));
		
		System.out.println(set);
		
		//for(Book data:set) {
		//	System.out.println(data);
		//	}
			Iterator<Book> it = set.iterator();
			while(it.hasNext()) {
				Book book = (Book) it.next();
				//System.out.println(book);
				if(book.getTitle().equalsIgnoreCase("SQL")) {
					it.remove();
				}
		}
			
			System.out.println(set);
		//}
		/*
		 * Set<Book> set = new HashSet<Book>(); set.add(new Book("java", 900));
		 * set.add(new Book("sql", 190)); set.add(new Book("DB", 99)); set.add(new
		 * Book("Spring", 49900)); set.add(new Book("Spring", 49900)); set.add(new
		 * Book("sql", 190)); set.add(new Book("sql", 190)); set.add(new Book("sql",
		 * 190));
			System.out.println(set.size());
		 */		
		
		
	}
}
