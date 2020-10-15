package book.chap03;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentId=6;
		student.studentAge=30;
		student.studentName="조자룡";
		student.studentAddress="인천시 부평구";
		
		System.out.println("이름 : " + student.studentName + " ,주소 " +student.studentAddress);
	}
	
	
	

	
}
