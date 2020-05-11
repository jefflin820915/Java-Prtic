import java.util.ArrayList;
import java.util.List;

/*
	深入List集合
	
	ArrayList集合底層是數組, 數組是有下標的
	所以ArrayList集合有很多自己的特性
	
	ArrayList集合底層默認初始化容量是 10, 擴大之後的容量是原容量的1.5倍
	Vector集合底層默認初始化容量也是10. 擴大之後的容量是原容量的2倍
	
	如何優化ArrayList和Vector?
		盡量減少擴容操作, 因為擴容需要數組拷貝, 數組拷貝很耗內存
		一般推薦在創建集合的時候指定初始化容量
 */
public class ListTest02 {

	public static void main(String[] args) {
		
		//創建List集合
		List l = new ArrayList();
		
		//添加元素
		l.add(123);
		l.add(321);
		l.add(69);
		
		//在下標為1的位置上添加555
		l.add(1,555);
		
		//取得第一個元素
		System.out.println(l.get(0));
	
		System.out.println("----------------------------------");
		
		//遍歷(List集合特有的遍歷方式)
		for (int i = 0; i < l.size(); i++) {
			Object element = l.get(i);
			System.out.println(element);
		}
	
	}
}
