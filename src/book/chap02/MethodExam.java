package book.chap02;

public class MethodExam {

	public int plus (int num1, int num2) {
		
		return num1+num2;
	}
	
	
	public static void main(String[] args) {
		
		MethodExam me = new MethodExam();
		
		System.out.println(me.plus(10, 10));
		
	}
	
}
