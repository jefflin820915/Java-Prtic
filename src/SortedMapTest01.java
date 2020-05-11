import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
	SortedMap����key�S�I: �L�Ǥ��i����, ���O�s�i�h�������i�H���Ӥj�p�۰ʱƦC
	
	�p�G�Q�۰ʱƧ�: key�����������ݭn, 1. ��{Comparable���f. 2.��W�g�@�Ӥ����
 */
public class SortedMapTest01 {

	public static void main(String[] args) {
		 
		//Map,key�s�xProduct, value�s�x�Ӽ�.
		//SortedMap products = new TreeMap();

		//�ΦW������(��W�g�����)
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
		
		
		//�ǳƹ�H
		SortedMapPorduct p1 = new SortedMapPorduct("���", 1.0);
		SortedMapPorduct p2 = new SortedMapPorduct("ī�G", 4.0);
		SortedMapPorduct p3 = new SortedMapPorduct("��l", 5.0);
		SortedMapPorduct p4 = new SortedMapPorduct("����", 3.0);
	
		//�K�[
		products.put(p1, 8.0);	//�۰ʸ˽c
		products.put(p2, 3.0);
		products.put(p3, 4.0);
		products.put(p4, 10.0);
	
		//�M��
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
//��{Comparable���f
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
	
	
	//��{CompareTo��k
	//���Ӱӫ~����Ƨ�
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