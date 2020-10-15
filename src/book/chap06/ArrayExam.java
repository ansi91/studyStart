package book.chap06;

public class ArrayExam {
	static float f;
	static String str;
	public static void main(String[] args) {
		int [] arr = {50, 55, 60};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(ArrayExam.f);
		System.out.println(ArrayExam.str);
	}
}
