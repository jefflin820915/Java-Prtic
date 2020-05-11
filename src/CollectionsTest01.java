import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
	關於集合工具類 java.util.Collections; 類
	
	java.util.Collection; 集合接口.
 */
public class CollectionsTest01 {

	public static void main(String[] args) {
		
		//使用Collections工具完成集合的排序
		List l = new ArrayList();
		
		//添加元素
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		
		//遍歷
		/*
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		*/
		/*
		for (Iterator it = l.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		*/
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//排序
		Collections.sort(l);
		
		System.out.println("-----------------------------");
		
		//遍歷
		it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//給定Set集合
		Set s = new HashSet();
		
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		
		//對Set集合排序
		//Collections.sort(s);
		
		//將Set集合轉換成List集合
		List list = new ArrayList(s);
		
		Collections.sort(list);
		
		System.out.println("-------------------------");
		
		//遍歷
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//創建List集合, List集合中存儲Person類型
		/*
		//Collections工具類可以對List集合中的元素排列, 但是集合中的元素必須是"可比較的", 實現Comparable接口.
		List ps = new ArrayList();
		
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		
		Collections.sort(ps);
		*/
		
		//將ArrayList集合轉換成線程安全的.
		List myList = new ArrayList();
		Collections.synchronizedList(myList);
	}
}
class CollectionsPerson{
	
}

