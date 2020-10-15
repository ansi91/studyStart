package book.chap01;

public class SwitchExam {

	public static void main(String[] args) {
		
		int i = 80;
		String grade = "";	
		switch ( i / 20) {
		 case 5:
			 grade = "A학점";
			 break;
		 case 4:
			 grade = "B학점";
			 break;
		 case 3:
			 grade = "C학점";
			 break;
		 case 2:
			 grade = "D학점";
			 break;
		 case 1:
			 grade = "F학점";
			 break;
		default : 
			System.out.println(0);
		}
		System.out.println("당신의 학점은 " + grade + "입니다. ");
	}
}
