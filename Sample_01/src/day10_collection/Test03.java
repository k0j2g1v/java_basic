package day10_collection;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		//List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector<Book>();
		
		list.add(new Book("java", 900));
		list.add(new Book("sql", 190));
		list.add(new Book("DB", 99));
		list.add(new Book("Spring", 49900));
		list.add(new Book("Spring", 49900));
		System.out.println(list);
		
		/*list.remove(new Book("Spring", 49900));
		//Collections.sort(list);
		System.out.println(list);
		
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.println(list.get(i).getTitle().charAt(0)+"***");*/
			
			Iterator<Book> it = list.iterator();
			while(it.hasNext()) {
				Book book = (Book) it.next();
				//System.out.println(book);
				if(book.getTitle().equalsIgnoreCase("SQL")) {
					it.remove();
				}
		}
		System.out.println(list);
	}
}

class Book extends Object implements Serializable,Comparable<Book> {

	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null && title.length() > 0)
			this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = -price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;

		if (obj instanceof Book) {
			return ((this.title.equals(((Book) obj).title) && (this.price == ((Book) obj).price)));
		}
		return flag;
	}

	@Override
	public int compareTo(Book o) {
		//return price-o.price;
		return title.compareTo(o.title);
	}

}
