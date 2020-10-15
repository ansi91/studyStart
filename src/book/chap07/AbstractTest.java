package book.chap07;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
 }
 class Marine extends Unit{
	 void move(int x, int y) {
		 System.out.println("마린이 x축으로" + x +"y축으로 " + y+"만큼 이동 했습니다."  );
	  }
	 }
 class Tank extends Unit{
	 void move(int x, int y) {
		 System.out.println("탱크가 x축으로" + x +"y축으로 " + y+"만큼 이동 했습니다."  );
	 }
 }

public class AbstractTest {
   public static void main(String[] args) {
	   Unit[] unit = {new Marine(), new Tank()};
	   for (int i=0; i<unit.length; i++) {
		   unit[i].move(100, 200);
	   }
   }
}
 
