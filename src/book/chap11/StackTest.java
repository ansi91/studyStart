package book.chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st.peek());
		System.out.println("꺼낸값 : "+ st.pop());
		System.out.println(st.peek());
		System.out.println(st.empty());
		System.out.println(st.search(3));
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1.홍길동");
		queue.offer("2.강호동");
		queue.offer("3.김병만");
		queue.offer("4.유재석");
		queue.offer("5.이성계");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		
		
		
	}
	
}
