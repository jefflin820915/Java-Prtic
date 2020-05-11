import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
	關於增強for循環
	
	語法:
		for(類型 變數:數組名/集合名){}
		
		集合要想要使用增強for循環這種語法, 集合需要使用泛型
		如果不使用泛型,需要用Object類型來定義集合中的元素
 */
public class ForeachTest01 {

	public static void main(String[] args) {
		
		int[] a = {1,2,34,5,6,7};
		
		//遍歷
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------------------------------");
		
		//foreach
		for(int e:a) { //int e代表是集合或著數組中的每一個元素
			System.out.println(e);
		}
	
		System.out.println("--------------------------------");
		
		//集合
		Set<String> strs = new HashSet<String>();
		
		strs.add("張三");
		strs.add("李四");
		strs.add("王五");
		strs.add("趙六");
		
		//遍歷
		for (String name:strs) {
			System.out.println(name);
		}
		
		//集合不使用泛型
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
	
		//遍歷
		//如果集合不使用泛型, 該集合在用增強for循環的時候該用Object類型定義
		for(Object element:l) {
			System.out.println(element);
		}
		
		
		
	}
}
