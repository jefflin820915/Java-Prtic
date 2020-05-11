import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
	深入remove.
		1.迭代器的remove方法
		2.結合自身帶的remove
 */
public class CollectionTest05 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		
		//遍歷
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			//推薦使用迭代器自身帶的remove方法刪除元素
			
			Object element = it.next();
		
			//刪除
			it.remove(); //通過迭代器刪
			
			
			/*
			//使用集合自身所帶的remove方法
			Object element = it.next();
			
			//刪除
			c.remove(element);
			*/
		
		}
			System.out.println(c.size()); //0
	}
}
