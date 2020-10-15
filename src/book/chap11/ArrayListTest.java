package book.chap11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for (int i=0; i < list.size(); i++) {
			System.out.println("list의 " +i+"번째 값"+list.get(i));
				
			}
		
		for(int j=list.size(); j>0; j--) {
			System.out.println(j);
			list.remove(new Integer(j));
		}
		
		
	}
	
}
