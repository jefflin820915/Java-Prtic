/*
 * ����JAVA�y������char����
 	��q�r��	\
 	��q�r�ťX�{�b�S��r�Ť��e,�|�N�S��r�Ŵ������q�r��
 	
 	\n	�����
 	\t	����
 	\'	���q��޸�
 	\"	���q���޸�
 	\\	���q�ϱ׺b
 */
public class DataTypeTest01 {
	public static void main(String[] args) {
		
		//���q��n�r��
		char c1 = 'n';
		System.out.println(c1);
	
		//�H�U���O�r�Ŧ�,�ӬO�@�ӬO�r��
		//�o�O�@�Ӵ����, �ݩ�@��char�����ƾ�
		//�ϱ׺b�bjava�y�����㦳��q�\��
		char c2 = '\n';
		
		/*System.out.println("HELLO");
		System.out.println("WORLD"); */
		
		//System.out.print�MSystem.out.println�ϧO: println��X���ᴫ��,  print��ܿ�X, ������
		
		/*System.out.print("HELLO");
		System.out.println("WORLD"); */
	
		System.out.print('A');
		System.out.print(c2);
		System.out.println('B');
		
		//���q��t�r��
		char x = 't';
		System.out.println(x);
		
		//����TAB
		//���ũM�Ů椣�P, ASCII���@��, �b��L�W���ؤ��P
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");
	
		//�n�D����x�W��X"�ϱ׺b�r��"
		//�ϱ׺b�N�᭱����޸���q������ƯS��t�q�����q��޸��r��
		//���䪺��޸��ʤ֤F��������޸��r��
		/*char k = '\';
		System.out.println(k); */
		
		/*�Ĥ@�Ӥϱ׺b�㦳��q�\��,�N�᭱���ϱ׺b��q�����q���ϱ׺b�r��*/
		
		char k = '\\';
		System.out.println(k);
		
		//�b����x�W��X���q����޸��r��
		//�Ĥ@�ӳ�޸���ĤG�ӳ�޸��t��,�̫��޸��䤣��t��
		//char a = ''';
		//System.out.println(a);
		
		//�ϱ׺b�㦳��q�\��,�N�ĤG�ӳ�޸��ഫ�����q����޸�
		//�Ĥ@�ӳ�޸���̫��޸��t��
		char a = '\'';
		System.out.println(a);
	
		char f = '"';
		System.out.println(f);
		
		System.out.println("HelloWorld!");
		//���~
		//System.out.println(""HelloWorld!"");
		//�ȥ�
		System.out.println("\"HelloWorld!\"");
	
		char m = '��';
		System.out.println(m);
	
		//JDK���۱a��nativ2ascii.exe�R�O,�i�H�N��r�ഫ��unicode�s�X�Φ�
		
		char n = '\u4e2d'; //'��'������unicode���s�X  4e2d
		System.out.println(n);
		
		//char g = '4e2d'; ���~ 		
		//char g = 'u4e2d'; ���~
		//�ϱ׺bu�X�_�ӫ᭱���@��Ʀr�O�Y�Ӥ�r��unicode�s�X
		char g = '\u4e2d';
		System.out.println(g);
		
		//g = '\u456a';
		//g = '\u256a';
		//g = '\u256b';
		g = '\u456b';
		System.out.println(g);
		
		System.out.println("============================");
		//char�������q�{��
		char c10 = '\u0000';
		System.out.println(c10);
		
		
		
		/*
		*�Q�i��: 0 1 2 3 4 5 6 7 8 9 10 11 12 13...
		*�G�i��: 0 1 10 11 100 101...
		 *�Q���i��: 0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20...
		 *�K�i��: 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....		
		 */
	
	}
}
