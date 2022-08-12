import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EnumerationDemo {
	public static void main(String[] args) {
		String [] array = {"박지민", "홍지민", "한지민", "한지민", "이지민"};
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		for(String str:array) {
			stack.push(str);
			queue.offer(str);
		}
		
//		Enumeration<String> enums = stack.elements();
//		while(enums.hasMoreElements()) {
//			System.out.println(enums.nextElement());
//		}
		
		Iterator<String> iters = queue.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}
