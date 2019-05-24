package Prob9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob9 {
	public static void main(String[] args) {

		try {
			BookMgr bm = new BookMgr();
			Scanner sc = new Scanner(new File("C://lib/bookdata.txt"));
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] datalist = data.split("/");
				String title = datalist[0];
				int price = Integer.parseInt(datalist[1]);
				Book b = new Book(title, price);
				bm.addBook(b);
			}
			bm.printBookList();
			bm.printTotalPrice();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
