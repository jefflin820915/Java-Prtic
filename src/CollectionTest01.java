import java.util.ArrayList;
import java.util.Collection;

/*
	boolean add(Object element); 向集合中添加元素
	int size();	獲取集合中元素的個數 
	void clear();	清空集合
	boolean isEmpty();	判斷集合中是否有元素
	Object[] toArrary();	將集合轉換成數組
	
	
	
	Iterator<E> iterator();	獲取集合所依賴的迭代器對象
	
	boolean contains(Object o);	判斷集合中是否包含某個元素
	boolean remove(Object o);	刪除集合中某個元素
	
 */
public class CollectionTest01 {

	public static void main(String[] args) {
		
		//1.創建集合
		Collection c = new ArrayList(); //多態
		
		//2.添加元素
		c.add(1); //JDK5.0後, 自動裝箱
		c.add(new Integer(100));
		
		Object o = new Object();
		c.add(o); //Collection集合只能單個存儲元素, 並且只能存儲引用類型
	
		Custom cus = new Custom("JACK", 20);
		c.add(cus);
	
	
		//3.獲取元素個數
		System.out.println(c.size()); //4
		System.out.println(c.isEmpty()); //false
		
		//4.將集合轉換成Object類型的數組
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		
		//5.清空
		c.clear();
		System.out.println(c.size()); //0
		System.out.println(c.isEmpty()); //true
	}	
}

class Custom{
	String name;
	int age;
	
	public Custom(String name,int age) {
		this.name = name;
		this.age = age;

	}
	//重寫Objeect中的toString
	public String toString() {
	return "Custom[name="+name+",age="+age+"]";	
	}

}