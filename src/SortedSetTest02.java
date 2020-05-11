import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
	SortedSet���X�s�x����������i�H�۰ʱƧ�?
		�]���Q�s�x��������{�FComparable���f.
		SUN�s�g��TreeSet���X�b�K�[�������ɭ�,�|
		�ե�compareTo��k�������
 */
public class SortedSetTest02 {

	public static void main(String[] args) {
		
		SortedSet users = new TreeSet();
		
		SortedSet_User u1 = new SortedSet_User(15);
		SortedSet_User u2 = new SortedSet_User(16);
		SortedSet_User u3 = new SortedSet_User(25);
		SortedSet_User u4 = new SortedSet_User(13);
		SortedSet_User u5 = new SortedSet_User(11);
	
		//�K�[����
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		//�M��
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

	//��{java.lang.Comparable;���f����compareTo��k
	//�Ӥ�k�{�ǭ��t�d��{, SUN���Ѫ��{�Ǥw�g�եΤF�Ӥ�k
	//����User�~�ֱƧ�
	public int compareTo(Object o) {
		
		//�s�g�@�Ӥ���W�h
		int age1 = this.age;
		int age2 = ((SortedSet_User)o).age;
		return age1-age2;
	} 

}