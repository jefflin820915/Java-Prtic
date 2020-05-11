import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	關於JDK5.0的新特性:	泛型(編譯期概念)
	
	1.為什麼引入泛型
		1可以統一集合中的數據類型
		2.可以減少強制類型轉換
	
	2.泛型語法如何實現
	
	3.泛型的優點和缺點
		優點: 統一類型,減少強制轉換
		缺點: 類型太統一,只能存儲一種類型
		
	以下程序沒有使用泛型
		如果集合不使用泛型, 則集合中的元素類型不統一
		在遍歷集合的時候,只能拿出來Object類型, 需要做
		大量的強制類型轉換, 麻煩
 */
public class GenericTest01 {

	public static void main(String[] args) {
		
		//創建一個集合,存儲A,B,C
		
		Set s = new HashSet();
		
		genericA a = new genericA();
		
		genericB b = new genericB();
		
		genericC c = new genericC();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		//需求: 遍歷集合, 如果是genericA類型 調用m1方法, genericB類型調用m2方法, genericC類型調用m3方法
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			
			//只能做大量的強制類型轉換
			if(o instanceof genericA) {
				genericA a1 = (genericA)o;
				a1.m1();
			}else if(o instanceof genericB) {
				genericB b1 = (genericB)o;
				b1.m2();
			}else if(o instanceof genericC) {
				genericC c1 = (genericC)o;
				c1.m3();
			}
		}		
	}
}

class genericA{
	
	public void m1() {
		System.out.println("A's m1");
	}
}

class genericB{
	
	public void m2() {
		System.out.println("B's m2");
	}
}

class genericC{
	
	public void m3() {
		System.out.println("C's m3");
	}
}