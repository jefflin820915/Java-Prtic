/*
 ���Y�B���
 	>	�j��
 	>=	�j�󵥩�
 	<	�p��
 	<=	�p�󵥩�
 	==	����
 	!=	������
 	
 	= �O��ȹB���
 	== �O���Y�B���
 	
 	���Y�B��Ū��B�⵲�G�@�w�O���L����:  true/false
 	
	���Y�B��Ū��B���z:
		int a = 10;
		int b = 10;
		a > b ������ɭ�, ������Oa���O�s��10�Mb���O�s��10�o�ӭȤ������j�p���
		a == b �]�O.
 */
public class OperatorTest01 {
	public static void main (String[] args) {
		
		int a = 10;
		int b = 10;
		System.out.println(a > b); //fasle
		System.out.println(a >= b); //true
		System.out.println(a < b);	//fasle
		System.out.println(a <= b);	//true
		System.out.println(a == b); //true
		System.out.println(a != b); //fasle
		
	}

}
