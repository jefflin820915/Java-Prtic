/*
 	��k����^���������Ovoid���ɭ�
 	
 		1. ��^���������Ovoid���ɭԭn�D��k�����O�Ҧʤ��ʪ�����"return ��;
 		"�o�˪��y�y�ӧ����Ȫ���^, �S���o�y�y�|����.
 		
 		2. �@�Ӥ�k����^�Ȫ��ɭ�,��ڭ̽եγo�Ӥ�k���ɭ�, ��k��^�F�@�ӭ�
 		���եΪ̨ӻ��o�Ӫ�^��, �o�Ӫ�^�ȥi�H��ܱ���, �]�i�H��ܤ�����.
 		���O�j�������p�U�ڭ̳��O��ܱ�����.
 		
 		3. 
 */
public class MethodTest07 {
	public static void main(String[] args) {
		
		//�եΤ�k
		 //�o�̨S�������o�Ӥ�k����^�ƾ�
	
		//�o�̱����@�U��k���浲�����᪺��^��
		//�ĥ��ܼƱ���
		//�ܼƪ��ƾ������ݭn�M��^�Ȫ��ƾ������ۦP, �Ϊ̥i�H�۰������ഫ.
		//boolean b = divide(10,3); //�sĶ����, �������ݮe
		
		//��ȹB��Ū��k�������, �N���浲�G��ȵ����䪺�ܼ�
		int i = divide(10, 3);
		System.out.println(i);
		
		long x = divide(10,3);
		System.out.println(x);
	}
	
	/*
	 	�ݨD:
	 		�Щw�q��{�@�Ӥ�k, �Ӥ�k�i�H�p����int�����ƾڪ���,
	 		�n�D�N�̲ת��p�⵲�G��^���եΪ�.
	*/
	
	//�sĶ����,�ʤ֪�^�y�y
	/*
	public static int divide(int a,int b) {
		
	}
	*/
	
	//�sĶ���~, �ʤ֪�^��
	/*public static int divide(int a,int b) {
		return ;
	}*/

	//�sĶ���~, ��k�w�q���ɭԭn�D��^�@��int����, ���ɪ�^boolean����, �������ݮe
	/*public static int divide(int a,int b) {
		return true;
	}*/
	
	//�i�H, �����骺��k�餤�s�g���N�X�L�k������e�ݨD
	/*public static int divide(int a,int b) {
		int c = a / b;
		return c;
	}*/
	
	public static int divide(int a,int b) {
		System.out.println("Hello World");
		return a/ b;
	}
}
