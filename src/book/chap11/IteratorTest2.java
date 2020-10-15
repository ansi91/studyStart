package book.chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorTest2 {

	public static void main(String[] args) {

		Map<String,Object> pmap = new HashMap<String,Object>();
		pmap.put("apple", "사과");
		pmap.put("banana","바나나");
		pmap.put("orange","오렌지");
		
		Set<Entry<String, Object>> eset = pmap.entrySet();
		Iterator it = eset.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println("결과는 :" + obj);
			
		}

	}
}
