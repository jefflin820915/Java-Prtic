import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set���X:	HashSet
	
	1.HashSet���h��ڤW�O�@��HashMap, HashMap���h�D�n�ĥΤF���ƪ�ƾڵ��c.
	
	2.���ƪ�S�s�����C��,  ���ƪ��h�O�@�ӼƲ�, �o�ӼƲդ��C�@�Ӥ���
	�O�@�ӳ�V���, �C�ӳ�V������@�ӿW�@�L�G�����ƭ�, �N��Ʋժ�
	�U��. �b�Y�ӳ�V������C�@�Ӹ`�I�W�����ƭȬO�۵���, ���ƭȹ�ڤW
	�Okey�ե�hashCode����k, �b�q�L"hash function"�ഫ������.
	
	3.�p��V���ƪ��K�[����:
		���եγQ�s�x��key��hashCode��k, �g�L�Y�Ӻ�k�o�Xhash��, �p�G�b
		�o�ӫ��ƪ����s�b�o�ӫ��ƭ�, �h�����[�J����. �p�G�ӫ��ƭȤw�g
		�s�b, �~��ե�key������equals��k, �p�Gequals��k��^false, �h�N
		�Ӥ����K�[, �p�Gequals��k��^true, �h���K�[�Ӥ���.
		
	4.HashSet���OHashMap����Key����. HashSet���ƻ�S�I, HashMap����key ���Ө㦳�ۦP���S�I
	
	5.HashMap�MHashSet��l�Ʈe�q���O16 , �q�{�[���]�l�O0.75
 */
public class SetTest01 {

	public static void main(String[] args) {
		
		//�Ы�Set���X
		Set s = new HashSet();
		
		//�L�Ǥ��i����
		s.add(1);
		s.add(1);
		
		s.add(100);
		s.add(85);
		s.add(88);
		
		//�M��
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	
}
