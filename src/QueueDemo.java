import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		String [] array = {"박지민", "홍지민", "한지민", "한지민", "이지민"};
		for(String str:array) {
			queue.offer(str);	//add
		}
		System.out.println(queue.poll());	//박지민 빼고 뒤에 애들이 앞으로 가는거(포인터가 이동하는게 아님)
		System.out.println(queue.poll());	
		System.out.println(queue.poll());	
		System.out.println(queue.poll());
	}
}
