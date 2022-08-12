import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LambdaDemo6 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "한지민");
		map.put("Address", "부산광역시 해운대구");
		map.put("C.P", "010-1234-5678");
		map.put("Email", "aaa@aaa.com");
		
//		Iterator<String> iters = map.keySet().iterator();
//		while(iters.hasNext()) {
//			String key = iters.next();
//			System.out.println(key + " --> " + map.get(key));
//		}
		
		map.forEach((key, value)-> System.out.println(key + " -> " + value));
	}
}
