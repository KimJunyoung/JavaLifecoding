package basic_section3_last;

import java.util.ArrayList;

import basic_section3_7.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book("준영", "김준"));
		list.add(new Book("준영", "김준"));
		list.add(new Book("준영", "김준"));
		list.add(new Book("준영", "김준"));
		list.add(new Book("준영", "김준"));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).showBookInfo();
		}
	}

}
