package book.chap06;

public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.add(5L, 3L);
		System.out.println("add => " + result);
		System.out.println("minus => "+ mm.subtract(5, 3) );
		System.out.println("multiple => " + mm.multiple(5, 3));
		System.out.println("divide => " + mm.divide(6, 3));
		mm.pritGugudan(5);
	}
}

class MyMath{
	
	void pritGugudan (int dan) {
		for (int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d%n", dan,i, dan * i);
		}
	}
	
	long add(long a, long b) {return a+b;}
	long subtract(long a, long b) {return a-b;}
	long multiple(long a, long b) {return a*b;}
	double divide (long a, long b) {return a/b;}
}
