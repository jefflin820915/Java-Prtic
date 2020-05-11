import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.Other;

/*
	讓SortedSet集合做到排序還有另一種方式: java.util.Comparator;
	
	單獨編寫一個比較器
	
 */
public class SortedSetTest03 {

	public static void main(String[] args) {
		
	//創建TreeSet集合的時候提供一個比較器
		
		//SortedSet products = new TreeSet(new ProductComparator());
		
	//匿名內部類 不推薦使用, 比較器無法重複利用
		SortedSet products = new TreeSet(new Comparator() {
			public int compare(Object o1,Object o2) {
				
				double price1 =((Sorted_SetProduct)o1).price;
				double price2 =((Sorted_SetProduct)o2).price;
				
				if(price1 == price2) {
					return 0;
				}else if(price1>price2) {
					return 1;
				}else {
					return -1;
					}
				}
		});
		
		Sorted_SetProduct p1 = new Sorted_SetProduct(3.4);
		Sorted_SetProduct p2 = new Sorted_SetProduct(4.0);
		Sorted_SetProduct p3 = new Sorted_SetProduct(3.0);
		Sorted_SetProduct p4 = new Sorted_SetProduct(2.4);
		Sorted_SetProduct p5 = new Sorted_SetProduct(5.0);
		
		//添加元素
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		//編歷
		Iterator it = products.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		
	}
}
class Sorted_SetProduct{
	
	double price;
	
	
	public Sorted_SetProduct(double price) {
		this.price = price;
	}

	public String toString() {
		return price+"";
	}


}

//單獨編寫一個比較器
/*
class ProductComparator implements Comparable{
	 
	//需求按照商品價格排序
	public int compare(Object o1,Object o2) {
		
		double price1 =((Sorted_SetProduct)o1).price;
		double price2 =((Sorted_SetProduct)o2).price;
		
		if(price1 == price2) {
			return 0;
		}else if(price1>price2) {
			return -1;
		}else {
			return 1;
			}
		}
	}
*/