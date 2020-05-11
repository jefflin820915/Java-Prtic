import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set集合:	HashSet
	
	1.HashSet底層實際上是一個HashMap, HashMap底層主要採用了哈希表數據結構.
	
	2.哈希表又叫做散列表,  哈希表底層是一個數組, 這個數組中每一個元素
	是一個單向鏈表, 每個單向鏈表都有一個獨一無二的哈希值, 代表數組的
	下標. 在某個單向鏈表中的每一個節點上的哈希值是相等的, 哈希值實際上
	是key調用hashCode的方法, 在通過"hash function"轉換成的值.
	
	3.如何向哈希表中添加元素:
		先調用被存儲的key的hashCode方法, 經過某個算法得出hash值, 如果在
		這個哈希表中不存在這個哈希值, 則直接加入元素. 如果該哈希值已經
		存在, 繼續調用key之間的equals方法, 如果equals方法返回false, 則將
		該元素添加, 如果equals方法返回true, 則放棄添加該元素.
		
	4.HashSet其實是HashMap中的Key部分. HashSet有甚麼特點, HashMap中的key 應該具有相同的特點
	
	5.HashMap和HashSet初始化容量都是16 , 默認加載因子是0.75
 */
public class SetTest01 {

	public static void main(String[] args) {
		
		//創建Set集合
		Set s = new HashSet();
		
		//無序不可重複
		s.add(1);
		s.add(1);
		
		s.add(100);
		s.add(85);
		s.add(88);
		
		//遍歷
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	
}
