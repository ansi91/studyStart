package book.chap01;

public class Gugudan2 {

	public static void main(String[] args) {
	
		int dan = 2;
		int su  = 1;
		
		while(dan <=9) {
			su = 1;
			while(su <=9) {
				if(dan<su) break;
				System.out.println(dan + "X" + su +"=" +dan*su);
				su++;
			}
			dan++;
			System.out.println();
		}
		
		
	}
}
