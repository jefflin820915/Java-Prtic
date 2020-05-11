import java.util.ArrayList;
import java.util.Collection;

/*
	boolean contains(Object o);	判斷集合中是否包含元素
	boolean remove(Object o);	刪除集合中某個元素
	
	存儲在集合中的元素應該去重寫equals方法

 */
public class CollectionTest03 {
	
	public static void main(String[] args) {
		
		//創建集合
		Collection c = new ArrayList();
		
		//創建兩個Integer類型對象
		Integer i1 = new Integer(10);
		
		
		//添加元素
		c.add(i1);
		
		//判斷集合中是否包含i1
		System.out.println(c.contains(i1)); //true
		
		//創建Integer類型的對象
		Integer i2 = new Integer(10);
		
		//contains方法底層調用equals方法, 如果equals返回true,就是包含
		System.out.println(c.contains(i2)); //true
		
		Manager m1 = new Manager(100, "JACK");
		c.add(m1);
		
		System.out.println(c.contains(m1)); //true
		
		Manager m2 = new Manager(100, "JACK");
		
		//重寫equals方法之前
		//System.out.println(c.contains(m2)); //false
		
		//重寫equals方法之後, 比較內容
		System.out.println(c.contains(m2)); //true
	
	}
}

class Manager{
	
	int no;
	String name;
	
	public Manager(int no,String name) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
	
	
	}

	//重寫Manger,equals方法
	//需求規定: 如果編號和姓名都相同則表示同一個Manager
	public boolean equals(Object o) {
		
		if(this==o) return true;
			if(o instanceof Manager) {
				Manager m = (Manager) o;
				if(m.no==this.no && m.name.equals(this.name)) {
					return true;
				}
			} 
				return false;
		}
	}