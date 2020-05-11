import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
	SortedMap中的key特點: 無序不可重複, 但是存進去的元素可以按照大小自動排列
	
	如果想自動排序: key部分的元素需要, 1. 實現Comparable接口. 2.單獨寫一個比較器
 */
public class SortedMapTest01 {

	public static void main(String[] args) {
		 
		//Map,key存儲Product, value存儲個數.
		//SortedMap products = new TreeMap();

		//匿名內部類(單獨寫比較器)
		SortedMap products = new TreeMap(new Comparator() {
			
			public int compare(Object o1,Object o2) {
				double price1 = ((SortedMapPorduct)o1).price;
				double price2 = ((SortedMapPorduct)o2).price;
			
				if(price1<price2) {
					return -1;
				}else if(price1>price2) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		
		
		//準備對象
		SortedMapPorduct p1 = new SortedMapPorduct("西瓜", 1.0);
		SortedMapPorduct p2 = new SortedMapPorduct("蘋果", 4.0);
		SortedMapPorduct p3 = new SortedMapPorduct("桃子", 5.0);
		SortedMapPorduct p4 = new SortedMapPorduct("香蕉", 3.0);
	
		//添加
		products.put(p1, 8.0);	//自動裝箱
		products.put(p2, 3.0);
		products.put(p3, 4.0);
		products.put(p4, 10.0);
	
		//遍歷
		Set keys = products.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Object k = it.next();
			Object v = products.get(k);
		System.out.println(k+"--->" + v );
		
		}
	
	
	}
}
/*
//實現Comparable接口
class SortedMapPorduct implements Comparable{
	
	String name;
	double price;
	
	public SortedMapPorduct(String name,double price) {
		this.name = name;
		this.price = price;
	
	}
	public String toString() {
		return "product[name="+name+",price="+price+"]"; 
	}
	
	
	//實現CompareTo方法
	//按照商品價格排序
	public int compareTo(Object o) {
		
		double price1 = this.price;
		double price2 = ((SortedMapPorduct)o).price;
	
		if(price1<price2) {
			return -1;
		}else if(price1>price2) {
			return 1;
		}else {
			return 0;
		}
	
	}
}
*/
class SortedMapPorduct{
	
	String name;
	double price;
	
	public SortedMapPorduct(String name,double price) {
		this.name = name;
		this.price = price;
	
	}
	public String toString() {
		return "product[name="+name+",price="+price+"]"; 
		}
	}