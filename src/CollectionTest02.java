import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;


/*
	Iterator iterator(); ������X�Ҩ̿઺���N��.
	�q�L���N��������k�������X�����N(�M��).
	
	�`�N: �o�ؤ覡�O�Ҧ����X�q�Ϊ��s���覡.
	
 */
public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//�Ыض��X��H
		Collection c = new LinkedList();
		
		//�K�[����
		c.add(100);	//�۰ʸ˽c
		c.add(3.14); //�۰ʸ˽c
		c.add(false); //�۰ʸ˽c
		
		//���N,�M��
		//1.������N����H
		//���ݭn���ߩ��h���X����������, �Ҧ����X�̿઺���N������{�Fjava.util.Iterator;���f
		//Iterator it = c.iterator(); //���N���O���V���f�s�{.
									//it�O�@�Ӥޥ�, �O�s���s�a�}, 	���V�襤��"���N����H"
		
		//java.util.LinkedList$ListItr ���OLinkedList���X�Ҩ̿઺���N��
		//java.util.ArrayList$Itr@15db9742 ���OArrayList���X�Ҩ̿઺���N��

		//System.out.println(it); //java.util.LinkedList$ListItr@15db9742
		
		//2.�}�l�եΤ�k, �����M��, ���N.
		//while�`��
		/*
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element); //100,3.14,false
		}
		/*
		/*
			boolean b = it.hasNext(); �P�_�O�_����h������, �p�G����^true
			Object o = it.next(); �N���N���V�U���ʤ@��, �åB���X���V������
			
			��h: �ե�it.next()��k���e�����ե�it.hashNext();
		 */
		
		//for�`��
		for (Iterator it = c.iterator();it.hasNext();) {
			Object o = it.next();
			System.out.println(o);
		}

	
	
	}

}
