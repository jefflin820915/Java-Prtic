import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	�x���y�k�p���{
	�x���O�@�ӽsĶ���q���y�k
	�b�sĶ���q�Τ@���X��������
 */
public class GenericTest02 {

	public static void main(String[] args) {
		
		//�Ыؤ@��List���X,�u��s�x�r�Ŧ�����
		List<String> strs = new ArrayList<String>();
		
		//�K�[����
		//Error
		//strs.add(1);
		
		strs.add("JACK");
		strs.add("SUN");
		strs.add("KING");
		strs.add("SMITH");
		
		//�M��
		Iterator<String> it = strs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}
}
