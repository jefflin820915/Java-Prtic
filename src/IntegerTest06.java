/*
	�`�J�۰ʸ˽c�M�۰ʩ�c:
		1. �۰ʸ˽c�M�۰ʩ�c�O�{�ǽs�{���q���@�ӷ���
		�M�{�ǹB��L��
 
 		2. �۰ʸ˽c�M�۰ʩ�c�D�n�ت��O��K�{�ǭ�
 */
public class IntegerTest06 {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//�o�̤��|���۰ʩ�c
		System.out.println(i1==i2); //false
		
		//������Integer�������ƾڬO�_�۵�, �����"=="
		//Integer�w�g���g�FObject����equals��k
		System.out.println(i1.equals(i2)); //true

		//���I:
		Integer i3 = 128;
		Integer i4 = 128;
		
		//�W�����P��
		//Integer i3 = new Integer(128);
		//Integer i4 = new Integer(128);
		
		System.out.println(i3==i4); //false
	
		
		//�`�N�H�U�{��
		//�p�G�ƾڬO�b(-128~127)����, java���ޤJ�F�@��"�㫬�`�Ʀ�", �b��k�Ϥ�
		//�Ӿ㫬�`�Ʀ��u�s�x-128~127�������ƾ�
		Integer i5 = 127; //�o�ӵ{�Ǥ��|�b�襤�Ыع�H, �|�����q�㫬�`�Ʀ�����.
		Integer i6 = 127;
		
		System.out.println(i5==i6); //true
	
		Integer i7 = -128;
		Integer i8 = -128;
		
		System.out.println(i7==i8); //true
		
		Integer i9 = -129;
		Integer i10 = -129;
		
		System.out.println(i9==i10); //false
	}
	
}
