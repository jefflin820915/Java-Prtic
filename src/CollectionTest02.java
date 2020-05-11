import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;


/*
	Iterator iterator(); 獲取集合所依賴的迭代器.
	通過迭代器中的方法完成集合的迭代(遍歷).
	
	注意: 這種方式是所有集合通用的編歷方式.
	
 */
public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//創建集合對象
		Collection c = new LinkedList();
		
		//添加元素
		c.add(100);	//自動裝箱
		c.add(3.14); //自動裝箱
		c.add(false); //自動裝箱
		
		//迭代,遍歷
		//1.獲取迭代器對象
		//不需要關心底層集合的具體類型, 所有集合依賴的迭代器都實現了java.util.Iterator;接口
		//Iterator it = c.iterator(); //迭代器是面向接口編程.
									//it是一個引用, 保存內存地址, 	指向堆中的"迭代器對象"
		
		//java.util.LinkedList$ListItr 類是LinkedList集合所依賴的迭代器
		//java.util.ArrayList$Itr@15db9742 類是ArrayList集合所依賴的迭代器

		//System.out.println(it); //java.util.LinkedList$ListItr@15db9742
		
		//2.開始調用方法, 完成遍歷, 迭代.
		//while循環
		/*
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element); //100,3.14,false
		}
		/*
		/*
			boolean b = it.hasNext(); 判斷是否有更多的元素, 如果有返回true
			Object o = it.next(); 將迭代器向下移動一位, 並且取出指向的元素
			
			原則: 調用it.next()方法之前必須調用it.hashNext();
		 */
		
		//for循環
		for (Iterator it = c.iterator();it.hasNext();) {
			Object o = it.next();
			System.out.println(o);
		}

	
	
	}

}
