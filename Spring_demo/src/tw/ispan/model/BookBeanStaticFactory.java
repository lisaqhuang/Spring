package tw.ispan.model;

import java.util.HashMap;

public class BookBeanStaticFactory {
	//
	private static HashMap<Integer,Book> bookmap = new HashMap<Integer,Book>();
	
	static {
		bookmap.put(1, new Book(1,"learn java"));
		bookmap.put(2, new Book(2,"learn math"));
	}
	public static Book getBook(Integer key) {
		return bookmap.get(key);
	}

}
