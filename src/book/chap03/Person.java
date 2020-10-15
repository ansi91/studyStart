package book.chap03;

public class Person {

	String name;
	float height;
	float weight;
	
	
	public Person(String name, float height, float weight) {		
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("김유신",168.8F,72);
		
		
		System.out.println("이름 " +p1.name+"\n"+ "키 " +p1.height +"\n"+ "몸무게 " + p1.weight);
	}
	
	
	
}
