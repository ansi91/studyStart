package book.chap06;

public class TransportTest {

	public static void main(String[] args) {
		Student st1 = new Student("이순신", 12000);
		
		Bus bus15 = new Bus(15);
		st1.takeBus(bus15);
		
		
		Student st2 = new Student("이성계",10000);
		st2.takeBus(bus15);
		bus15.showInfo();
		
		Student st3 = new Student("강호동", 15000);
		Subway subway7 = new Subway(7);
		st3.takeSubway(subway7);
		String name =st3.studentName;
		subway7.showInfo();
		System.out.println(name + "이 " + subway7.lineNumber + "호선에 타고 있습니다.");
	}
	
}
