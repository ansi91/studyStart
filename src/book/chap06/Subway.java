package book.chap06;

public class Subway {

	int lineNumber;
	int passenger;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.money += money;
	}
	public void showInfo() {
		System.out.println(lineNumber + "호선의 승객은 " + passenger + "명 이고 수입은" +money +"입니다." );
	}
}
