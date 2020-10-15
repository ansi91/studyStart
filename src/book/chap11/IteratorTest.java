package book.chap11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Iterator<String> it = list.iterator();
		
		
		while(it.hasNext()) {
			String result = it.next();
			System.out.println("결과 : " + result);
		}
		
		it = list.iterator();
		while(it.hasNext()) {
			String result = it.next();
			System.out.println("결과 : " + result);
		}
	}
	
}
