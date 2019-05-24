package day11;

import java.util.ArrayList;
import java.util.List;

import Prob9.Book;

public class Test05 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java", 3500));
		books.add(new Book("sql", 4500));
		books.add(new Book("servlet&jsp", 5500));
		books.add(new Book("html5", 6200));
		books.add(new Book("Java", 500));
		books.add(new Book("Java", 500));
		
		books.forEach(i -> System.out.println(i.getTitle().charAt(0)+"**"));
		
		books.stream().forEach(i -> System.out.println(i));
		System.out.println("-----------------------------------");
		books.stream().distinct().forEach(i -> System.out.println(i));
		
		long count = books.stream().filter(i -> i.getPrice() > 1000).count();
		System.out.println(count);
		
		long sum = books.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println(sum);
		
	}
}
