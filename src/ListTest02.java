import java.util.ArrayList;
import java.util.List;

/*
	�`�JList���X
	
	ArrayList���X���h�O�Ʋ�, �ƲլO���U�Ъ�
	�ҥHArrayList���X���ܦh�ۤv���S��
	
	ArrayList���X���h�q�{��l�Ʈe�q�O 10, �X�j���᪺�e�q�O��e�q��1.5��
	Vector���X���h�q�{��l�Ʈe�q�]�O10. �X�j���᪺�e�q�O��e�q��2��
	
	�p���u��ArrayList�MVector?
		�ɶq����X�e�ާ@, �]���X�e�ݭn�Ʋի���, �Ʋի����ܯӤ��s
		�@����˦b�Ыض��X���ɭԫ��w��l�Ʈe�q
 */
public class ListTest02 {

	public static void main(String[] args) {
		
		//�Ы�List���X
		List l = new ArrayList();
		
		//�K�[����
		l.add(123);
		l.add(321);
		l.add(69);
		
		//�b�U�Ь�1����m�W�K�[555
		l.add(1,555);
		
		//���o�Ĥ@�Ӥ���
		System.out.println(l.get(0));
	
		System.out.println("----------------------------------");
		
		//�M��(List���X�S�����M���覡)
		for (int i = 0; i < l.size(); i++) {
			Object element = l.get(i);
			System.out.println(element);
		}
	
	}
}
