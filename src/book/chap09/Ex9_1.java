package book.chap09;

public class Ex9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		if (v1. equals(v2)) {
			System.out.println("s1과 s2는 같습니다");
		}else {
			System.out.println("s1과 s2는 같지 않습니다.");
		}
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {

		Value v = (Value) obj;

		if (!(obj instanceof Value)) return false;

		return this.value == v.value;
	}

}