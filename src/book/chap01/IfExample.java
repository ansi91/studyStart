package book.chap01;

public class IfExample {

	static int age = 20;
	static int money = 0;
	
	public static void main(String[] args) {
		
		if (age <= 19) {
			money += 5000;
			System.out.println("학생입니다.");
		}else {
			money += 7000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 " + money + " 입니다.");	
	}
}
