/*
 	����java����"+"�B���
 		1. "+"�B��Ŧ���ӧ@��:
 				�[�k�B��, �D�M
 				�r�Ŧꪺ�s���B��
 			
 		2. ��"+"�B��Ũ��䳣�O�Ʀr����, �@�w�O�i��[�k�B��.
 		
 		3. ��"+"�B���,�u�n���䪺�ƾڥu�n���@�ӼƾڬO�r�Ŧ�,�@�w�|�i��r�Ŧ�s���B��.
 		�åB,�s���B�⤧�᪺���G�٬O�@�Ӧr�Ŧ�����.
 		
 		�Ʀr + �Ʀr ---> �Ʀr [ �D�M ]
 		�Ʀr + "�r�Ŧ�" ---> "�r�Ŧ�" [�r�Ŧ�s��]
 		
 		4. �b�@�Ӫ�F�����i�H�X�{�h��"+", �b�S���K�[�p�A�����e�����U, ��`�ۥ��V�k������.
 */
public class OperatorTest04 {
	public static void main(String[] args) {
		
		System.out.println(10 + 20); // 30	�o�̪��[���O�D�M 
		System.out.println(10 + 20 + 30); // 60	�o�̪��[���]�O�D�M 
		System.out.println(10 + 20 + "30"); // "3030"  �ۥ��V�k�̦��B��, �Ĥ@�ӥ[���O�D�M, �ĤG�ӥ[���O�r�Ŧ�s��
		System.out.println(10 + (20 + "30")); //"102030"
		int a = 10;
		int b = 20;
		
		//�n�D�b����x�W��X"10 + 20 = 30"
		System.out.println("10 + 20 = 30");
		
		//�n�D�H�ʺA���覡��X
		System.out.println("10 + 20 = " + a + b); // "10 + 20 = 1020"
		
		System.out.println("10 + 20 = " + (a + b));
		
		System.out.println("a + 20 = " + (a + b));
		
		System.out.println(a + " + 20 = " + (a + b));
		
		System.out.println(a + " + b = " + (a + b));
		
		System.out.println(a + " + "+ b + " = " + (a + b));
		
		a = 100;
		b = 200;
		
		System.out.println(a + " + "+ b + " = " + (a + b));
		
		//�ޥ�����String
		//String�OSUN�bjava�����Ѫ��r�Ŧ�����
		//String.class���
		//int�O�򥻼ƾ�����, i�O�ܼƦW, 10�Oint�������r����
		int i = 10;
		
		//String�O�ޥμƾ�����, s�O�ܼƦW, "abc"String�������r����
		String s = "abc";
		
		//���~,�������ݮe
		//String ss = 10;
		
		//�w�q�@��String�������ܼ�, �_�Wusername, ��� "tzuen"
		String username = "tzuen";
		System.out.println("�n�J���\, �w��username�^��");
		
		System.out.println("�n�J���\, �w��" + "�^��");
		
		System.out.println("�n�J���\, �w��" + username + "�^��");
		
		username = "Lin";
		
		System.out.println("�n�J���\, �w��" + username + "�^��");
}

}
