package book.chap01;

public class WhileExam {

	public static void main(String[] args) {

		int i = 1;
		int total = 0;
		while (i <= 10) {
			total += i;
			i++;
		}
		System.out.println("1부터 10까지의 합" + total );

	}
}
