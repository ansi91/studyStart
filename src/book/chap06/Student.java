package book.chap06;

public class Student {

	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1200);
		bus.busNumber=15;
		money -= 1200;
	
	}

	public void takeSubway(Subway subway) {
		subway.take(1250);
		subway.lineNumber=7;
		money-=1250;
	}
	public void showInfo() {
		System.out.println(studentName +"의" + "남은 돈은 " +money +"입니다.");
	}
}
