/*
 * ��e�H�U�{�Ǥ��ϥ�"��k", ���R�s�b���ǯ��I
	�H�U�N�X���O�������int�����ƾڪ��M, �ۦP���N�X�g�T�M.(�u���L�C���ѻP�D�M���ƾڤ��P)
	�N�X���S���o�쭫�ƨϥ�.
	
	���Ӧbjava�y�������ؾ���:
		�Y�ӥ\��N�X�u�ݭn�g�@�M
		�n�ϥγo�ӥ\��, �u�ݭn���o�ӥ\��ǻ����骺�ƾ�
		�o�ӥ\�৹�������^�@�ӳ̲ת����G
		�o�˥N�X�N�୫�ƧQ��,�����N�X�_�Ω�. [��k]
		
	�ϥγo�Ӥ�k�ڭ̺٬�"�ե�/invoke"
*/
public class MethodTest {
	public static void main(String[] args) {
		
		//�ݨD1 : �нs�g�{�ǭp��10�M20���M �ñN���G��X [�\��: �p����int�����ƾڪ��M]
		
		int a = 10;
		int b = 20;
		int c = a + b ;
		System.out.println(a + "+" + b + "=" + c);
		
		//�ݨD2: �Эp��666�M888���M, �ñN���G��X [�\��: �p����int�����ƾڪ��M]
		
		int x = 666;
		int y = 888;
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
		
		//�ݨD3: �Эp��111�M222���M, �ñN���G��X [�\��: �p����int�����ƾڪ��M]
		
		int m = 111;
		int n = 222;
		int e = m + n;
		System.out.println(m + "+" + n + "=" + e);
		
		//�H�W���T�ӻݨD���N�O�@�ӻݨD 
		//�ݨD�O�p����int�������M, �\��ۦP,
		//�u���L�C�@���ѻP�p�⪺����ƾڤ��P.
		
	}
}
