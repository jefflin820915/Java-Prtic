import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	����JDK5.0���s�S��:	�x��(�sĶ������)
	
	1.������ޤJ�x��
		1�i�H�Τ@���X�����ƾ�����
		2.�i�H��ֱj�������ഫ
	
	2.�x���y�k�p���{
	
	3.�x�����u�I�M���I
		�u�I: �Τ@����,��ֱj���ഫ
		���I: �����ӲΤ@,�u��s�x�@������
		
	�H�U�{�ǨS���ϥΪx��
		�p�G���X���ϥΪx��, �h���X���������������Τ@
		�b�M�����X���ɭ�,�u�ள�X��Object����, �ݭn��
		�j�q���j�������ഫ, �·�
 */
public class GenericTest01 {

	public static void main(String[] args) {
		
		//�Ыؤ@�Ӷ��X,�s�xA,B,C
		
		Set s = new HashSet();
		
		genericA a = new genericA();
		
		genericB b = new genericB();
		
		genericC c = new genericC();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		//�ݨD: �M�����X, �p�G�OgenericA���� �ե�m1��k, genericB�����ե�m2��k, genericC�����ե�m3��k
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			
			//�u�వ�j�q���j�������ഫ
			if(o instanceof genericA) {
				genericA a1 = (genericA)o;
				a1.m1();
			}else if(o instanceof genericB) {
				genericB b1 = (genericB)o;
				b1.m2();
			}else if(o instanceof genericC) {
				genericC c1 = (genericC)o;
				c1.m3();
			}
		}		
	}
}

class genericA{
	
	public void m1() {
		System.out.println("A's m1");
	}
}

class genericB{
	
	public void m2() {
		System.out.println("B's m2");
	}
}

class genericC{
	
	public void m3() {
		System.out.println("C's m3");
	}
}