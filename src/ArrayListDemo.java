import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("한지민", "박지민", "홍지민", "김지민", "이지민", "서지민", "신지민");
		ArrayList<String> array = new ArrayList<String>();
		
		for(String str:list) {
			array.add(str);
		}
		System.out.println("방개수 : " + array.size() );
		
		array.remove(0);	// "한지민" 삭제
		System.out.println("방개수 : " + array.size() );
		System.out.println(array.get(0));
	}
}
