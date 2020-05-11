import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	List集合存儲元素特點:
		1.有序(List集合中存儲有下標):存進去是這樣順序, 取出來還是按照這個順序.
		2.可重複
 */
public class ListTest01 {

	public static void main(String[] args) {
		
		 //創建一個List集合
		List l = new ArrayList<E>();
		
		//添加
		l.add(100);
		l.add(99);
		l.add(23);
		l.add(250);
		l.add(250);
		
		//遍歷
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
