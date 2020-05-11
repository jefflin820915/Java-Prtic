import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
	����W�jfor�`��
	
	�y�k:
		for(���� �ܼ�:�ƲզW/���X�W){}
		
		���X�n�Q�n�ϥμW�jfor�`���o�ػy�k, ���X�ݭn�ϥΪx��
		�p�G���ϥΪx��,�ݭn��Object�����өw�q���X��������
 */
public class ForeachTest01 {

	public static void main(String[] args) {
		
		int[] a = {1,2,34,5,6,7};
		
		//�M��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------------------------------");
		
		//foreach
		for(int e:a) { //int e�N��O���X�εۼƲդ����C�@�Ӥ���
			System.out.println(e);
		}
	
		System.out.println("--------------------------------");
		
		//���X
		Set<String> strs = new HashSet<String>();
		
		strs.add("�i�T");
		strs.add("���|");
		strs.add("����");
		strs.add("����");
		
		//�M��
		for (String name:strs) {
			System.out.println(name);
		}
		
		//���X���ϥΪx��
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
	
		//�M��
		//�p�G���X���ϥΪx��, �Ӷ��X�b�μW�jfor�`�����ɭԸӥ�Object�����w�q
		for(Object element:l) {
			System.out.println(element);
		}
		
		
		
	}
}
