/*
 	*����java����ƫ�
 		�ƾ�����		 ���ΪŶ��j�p		�q�{��			���Ƚd��
 	-------------------------------------------------------------	
 		byte			1			 0			[-128 ~ 127]
 		short			2			 0			[-32768 ~ 32767]
 		int				4			 0			[-2147483648 ~ 2147483647]
 		long			8			 0L		

 		
java����"��ƫ��r����"�Q�q�{��@int�����ӳB�z, �n���o��"��ƫ��r����"�Q��
long�����ӳB�̪���, �ݭn�b"��ƫ��r����"�᭱�K�[l/L, �ظq�j�gL
java�y��������ƫ��r���Ȧ��T�ت�ܤ覡:
	�Q�i��: [�O�@�دʬ��q�{���覡]
	�K�i��: [�b�s�g�K�i��r���Ȫ��ɭԻݭn�H0�}�l]
	�Q���i��: [�b�s�g�Q���i��r���Ȫ��ɭԻݭn�H0x�}�l]
 */
public class DataTypeTest02 {
	
	public static void main (String[] args) {
	
		int a = 10;
		int b = 010;
		int c = 0x10;
		
		System.out.println(a); //10
		System.out.println(b); //8
		System.out.println(c); //16
		System.out.println(a + b + c); //34
	
		//�o�Ӿ�ƫ��r���ȬOint����
		//i�ܼ��n�����ɭԤ]�Oint����
		//int������123��ȵ�int�������ܼ�i, ���s�b�����ഫ
		int i = 123;
		System.out.println(i);
		
		//456��ƫ��r���ȳQ��@int����, �e��4�Ӧ줸��
		//x�ܼƦb�n�����ɭԬOlong����, �e��8�Ӧ줸��
		//int�������r����456��ȵ�long�������ܼ�x , �s�b�����ഫ
		//int�����ഫ��long����
		//int�����O�p�e�q
		//long�����O�j�e�q
		//�p�e�q�i�H�۰��ഫ���j�e�q, �٬��۰������ഫ����
		long x = 456;
		System.out.println(x);
		
		//2147483647�Oint����, �e��4�Ӧ줸��
		//y�Olong����, �e��8�Ӧ줸��, �۰������ഫ
		long y = 2147483647;
		System.out.println(y);
		
		//���~, �L�j�����
		//2147483648�Q��@int����,4�Ӧ줸�ճB��, ���o�Ӧr���ȶW�Xint�����d��
		//long z = 2147483648;
		
		//2147483648�r���Ȥ@�W�ӴN��long�B�z, �b�r���ȫ᭱�K�[L
		//2147483648L�O8�Ӧ줸�ժ�long����
		//z�Olong�������ܼ�, �H�U���s�b�����ഫ
		long z = 2147483648L;
		System.out.println(z);
	}
}
