import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.Other;

/*
	��SortedSet���X����Ƨ��٦��t�@�ؤ覡: java.util.Comparator;
	
	��W�s�g�@�Ӥ����
	
 */
public class SortedSetTest03 {

	public static void main(String[] args) {
		
	//�Ы�TreeSet���X���ɭԴ��Ѥ@�Ӥ����
		
		//SortedSet products = new TreeSet(new ProductComparator());
		
	//�ΦW������ �����˨ϥ�, ������L�k���ƧQ��
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
		
		//�K�[����
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		//�s��
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

//��W�s�g�@�Ӥ����
/*
class ProductComparator implements Comparable{
	 
	//�ݨD���Ӱӫ~����Ƨ�
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