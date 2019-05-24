package Prob9;

import java.io.Serializable;

public class Book extends Object implements Serializable {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	/*@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj instanceof Book) {
			return ((this.title.equals(((Book) obj).title) 
					&& (this.price == ((Book) obj).price)));
		}
		return flag;*/

		// if(obj !=null && obj instanceof Book) {
		// Book temp = (Book) obj;
		// if(title.equals(temp.title) && price == temp.price) {// title 주소 price 데이터
		// flag = true;
		// }
		// }

		
	

}
