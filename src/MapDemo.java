import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Date now = new Date();
		String str = now.toString();
		String [] array = str.split("\\s+");	//방 6개인 방 생성
		System.out.println("오늘은 " + array[5] + "년 " + new MapDemo().getMonth(array[1]) + "월 " + array[2] + "일입니다");
	}
	
	int getMonth(String key) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("Jan", 1);	map.put("Feb", 2);	map.put("Mar", 3);
		map.put("Apr", 4);	map.put("May", 5);	map.put("Jun", 6);
		map.put("Jul", 7);		map.put("Aug", 8);	map.put("Sep", 9);
		map.put("Oct", 10);	map.put("Nov", 11);	map.put("Dec", 12);
		Set<String> set= map.keySet();
		System.out.println(set);
		return map.get(key);
	}
}
