import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
	�`�Jremove.
		1.���N����remove��k
		2.���X�ۨ��a��remove
 */
public class CollectionTest05 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		
		//�M��
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			//���˨ϥέ��N���ۨ��a��remove��k�R������
			
			Object element = it.next();
		
			//�R��
			it.remove(); //�q�L���N���R
			
			
			/*
			//�ϥζ��X�ۨ��ұa��remove��k
			Object element = it.next();
			
			//�R��
			c.remove(element);
			*/
		
		}
			System.out.println(c.size()); //0
	}
}
