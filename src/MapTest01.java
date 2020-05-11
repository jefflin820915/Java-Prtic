import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	關於Map集合中常用的方法
	void	clear(); 清空Map
	
	boolean	containsKey(Object key); 判斷Map中是否包含這樣的key
	boolean	containsValue(Object value); 判斷Map中是否包含這樣的value
	
	Set<Map.Entry<K,V>>	entrySet(); 返回此映射中包含的映射關係
	
	Object	get(Object key); 通過key來獲取value
	Object	put(Object key, Object value); 向集合中添加鍵值對
	
	boolean	isEmpty(); 判斷該集合是否為空
	Object	remove(Object key); 通過key將鍵值對刪除
	int	size(); 獲取Map中鍵值對的個數
	
	Set	keySet(); 獲取Map中所有的key
	Collection	values(); 獲取Map集合中所有的value
	
	存儲在Map集合key部分的元素需要同時重寫hashCode和equals方法
	
 */
public class MapTest01 {

	public static void main(String[] args) {
		
		//1.創建Map集合
		Map persons = new HashMap(); //HashMap的默認初始化容量是16, 默認加載因子是0.75
		
		//2.存儲鍵值對
		persons.put("10000", "JACK");
		persons.put("10011", "JACK");
		persons.put("10002", "SUN");
		persons.put("10003", "COOK");
		persons.put("10004", "KING");
		persons.put("10000", "LUCY");
	
		//3.判斷鍵值對的個數
		//Map中的key是無序不可重複, 和HashSet相同
		System.out.println(persons.size());
		
		//4.判斷集合中是否包含這樣的key
		System.out.println(persons.containsKey("10000")); //true
		
		//5.判斷集合中是否包含這樣的value
		//注意: Map中如果key重複了, value採用的是"覆蓋"
		System.out.println(persons.containsValue("LUCY")); //true
		
		//6.通過key獲取value
		String k = "10002";
		Object v = persons.get(k);
		System.out.println(v); //SUN
		
		//7.通過key刪除鍵值對
		persons.remove("10002");
		System.out.println(persons.size()); //4
		
		//8.獲取所有的value
		
		Collection values = persons.values();
		Iterator it = values.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
	
		//9.獲取所有的key
		//以下程序演示如何遍歷Map集合
		Set keys = persons.keySet();
		
		Iterator it2 = keys.iterator();
		
		while(it2.hasNext()) {
			Object id = it2.next();
			Object name = persons.get(id);
			System.out.println(id+"->"+name);
		}
	
		//10.entrySet
		//將Map轉換成Set集合
		/*
		Set entrySet = persons.entrySet();
		Iterator it3 = entrySet.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		*/
	
	
	}
}
