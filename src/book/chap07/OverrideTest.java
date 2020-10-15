package book.chap07;

class MyPoint3d extends Object {
	int x;
	int y;
	
	MyPoint3d(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x:" + x+"y:"+y;
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3d mp3 = new MyPoint3d(5,7);
		
		System.out.println(mp3.toString());
	}
}
