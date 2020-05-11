import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
	SortedSet���X�ϥΪx��.
 */
public class GenericTest04 {

	public static void main(String[] args) {
		
		SortedSet<GenericManager> ss = new TreeSet<GenericManager>();
		
		//�K�[����
		GenericManager m1 = new GenericManager(1000);
		GenericManager m2 = new GenericManager(1500);
		GenericManager m3 = new GenericManager(1300);
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		
		//�M��
		Iterator<GenericManager> it = ss.iterator();
		while(it.hasNext()) {
			GenericManager m = it.next();
			m.work(); 
		}
		
		
	}
}
class GenericManager implements Comparable<GenericManager>{
	
	double sal;
	
 public GenericManager(double sal) {
	 
	 this.sal = sal;
 }

public String toString() {
	return sal+"";
}

public void work() {
	System.out.println("�u�@, �@�Ӥ�"+sal+"��");
}
public int compareTo(GenericManager m) {
	double sal1 = this.sal;
	double sal2 = m.sal; //���ݭn�j��
	if(sal1>sal2) {
		return 1;
	}else if(sal1<sal2) {
		return -1;
	}else
	return 0;
	}
}