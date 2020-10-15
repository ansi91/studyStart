package book.chap06;

public class Bus {

	int busNumber;
	int passenger;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은" + passenger +"명 이고, 수입은" + money +"원 입니다." );
	}
	
}
