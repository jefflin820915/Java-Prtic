import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
	���󶰦X�u���� java.util.Collections; ��
	
	java.util.Collection; ���X���f.
 */
public class CollectionsTest01 {

	public static void main(String[] args) {
		
		//�ϥ�Collections�u�㧹�����X���Ƨ�
		List l = new ArrayList();
		
		//�K�[����
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		
		//�M��
		/*
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		*/
		/*
		for (Iterator it = l.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		*/
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//�Ƨ�
		Collections.sort(l);
		
		System.out.println("-----------------------------");
		
		//�M��
		it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//���wSet���X
		Set s = new HashSet();
		
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		
		//��Set���X�Ƨ�
		//Collections.sort(s);
		
		//�NSet���X�ഫ��List���X
		List list = new ArrayList(s);
		
		Collections.sort(list);
		
		System.out.println("-------------------------");
		
		//�M��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//�Ы�List���X, List���X���s�xPerson����
		/*
		//Collections�u�����i�H��List���X���������ƦC, ���O���X�������������O"�i�����", ��{Comparable���f.
		List ps = new ArrayList();
		
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		ps.add(new CollectionsPerson());
		
		Collections.sort(ps);
		*/
		
		//�NArrayList���X�ഫ���u�{�w����.
		List myList = new ArrayList();
		Collections.synchronizedList(myList);
	}
}
class CollectionsPerson{
	
}

