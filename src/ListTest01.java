import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	List���X�s�x�����S�I:
		1.����(List���X���s�x���U��):�s�i�h�O�o�˶���, ���X���٬O���ӳo�Ӷ���.
		2.�i����
 */
public class ListTest01 {

	public static void main(String[] args) {
		
		 //�Ыؤ@��List���X
		List l = new ArrayList<E>();
		
		//�K�[
		l.add(100);
		l.add(99);
		l.add(23);
		l.add(250);
		l.add(250);
		
		//�M��
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
