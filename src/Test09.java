/*
 * �X�ݱ����v���׹���:
 * 		
 * 		1. �X�ݱ����v���׹��Ũӱ������X�ݽd��
 * 		
 * 		2. �X�ݱ����v���׹��ť]�A:
 * 			public		��ܤ��}��,�b�����m����X��
 * 			protected	�Ppackage,�l��
 * 			�ʬ�			�Ppackage
 * 			private		��ܨp����,�u��b�����X��
 * 		
 * 		3. �X�ݱ����v���׹��ťi�H�׹���, �ܼ�, ��k...
 * 
 * 		4. ��Y�Ӽƾڥu�Ʊ�l���ϥ�,�ϥ�protected�i��׹�
 * 
 * 		5. �׹��Ū��d��:
 * 				private < �ʬ� < protected < public
 */
public class Test09 {
	
	public static void main(String[] args) {
		
		User07 u = new User07();
		
		System.out.println(u.i);
		System.out.println(u.j);
	}
}
