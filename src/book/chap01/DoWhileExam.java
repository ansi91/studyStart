package book.chap01;

public class DoWhileExam {

	
	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		do {
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("sum" + sum+" " + num); 
	}
	
}
