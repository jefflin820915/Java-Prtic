import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
	SortedSet集合存儲元素為什麼可以自動排序?
		因為被存儲的元素實現了Comparable接口.
		SUN編寫的TreeSet集合在添加元素的時候,會
		調用compareTo方法完成比較
 */
public class SortedSetTest02 {

	public static void main(String[] args) {
		
		SortedSet users = new TreeSet();
		
		SortedSet_User u1 = new SortedSet_User(15);
		SortedSet_User u2 = new SortedSet_User(16);
		SortedSet_User u3 = new SortedSet_User(25);
		SortedSet_User u4 = new SortedSet_User(13);
		SortedSet_User u5 = new SortedSet_User(11);
	
		//添加元素
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		//遍歷
		Iterator it = users.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
	}
}
class SortedSet_User implements Comparable{
	
	//String name;
	
	int age;
	
	public SortedSet_User(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "User[age = "+age+"]";
	}

	//實現java.lang.Comparable;接口中的compareTo方法
	//該方法程序員負責實現, SUN提供的程序已經調用了該方法
	//按照User年齡排序
	public int compareTo(Object o) {
		
		//編寫一個比較規則
		int age1 = this.age;
		int age2 = ((SortedSet_User)o).age;
		return age1-age2;
	} 

}