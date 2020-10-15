package book.chap01;

public class ContinueExam {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		for (; i < 10; i++) {
			if (i % 2 == 0) {				
				continue;
			}
				sum += i;
			System.out.println(i);
		}
		System.out.println("홀수의합 " +sum);
	}

}
