import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map�ϥΪx��
 */
public class GenericTest03 {

	public static void main(String[] args) {
		
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		//�s
		maps.put("���", 10);
		maps.put("ī�G", 9);
		maps.put("����", 20);
		
		//�M��
		Set<String> keys = maps.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String k = it.next();
			Integer v = maps.get(k);
			System.out.println(k+"--->" +v);
		}
		
	}
}
