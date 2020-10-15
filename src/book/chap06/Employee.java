package book.chap06;

public class Employee {

	static int serialNum = 10000;
	int employeeId;
	String employeeName; 
	
	
	public Employee() {
		serialNum++;
		this.employeeId = serialNum; 
	}
	
}
