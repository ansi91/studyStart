package book.chap10;

import java.util.Calendar;

public class Ex10_1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.print(today.get(Calendar.YEAR)+"년" +" ");
		int minute = today.get(Calendar.MINUTE);
		int m = today.get(Calendar.MONTH);
		m +=1;
		
		Object result = (m < 10) ? "0"+m:m;
		Object result2 = (minute < 10) ? "0"+minute:minute;
		
		System.out.print(result.toString() +"월" +" ");
		System.out.print(today.get(Calendar.DAY_OF_MONTH)+"일" +" ");
		System.out.print(today.get(Calendar.HOUR) +"시" +" ") ;
		System.out.print(result2+"분");
		
		
		
	}
}
