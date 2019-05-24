package Prob9;

public class Prob6_Main {
	public static void main(String[] args) {
	 	BookMgr mgr = new BookMgr();
	 	
	 	mgr.addBook( new Book("java", 600));
	 	mgr.addBook( new Book("java1", 600));
	 	mgr.addBook( new Book("java2", 600));
	 	mgr.addBook( new Book("SQL Fundamentals", 600));
	 	mgr.addBook( new Book("EJB", 600));
	 	
	 	mgr.printBookList();
	 	mgr.printTotalPrice();
	}
}
