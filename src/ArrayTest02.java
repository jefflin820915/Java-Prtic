/*
 * �Ʋդ��s�x�����������O�Τ@��, �C�Ӥ����b���s���Ҧ���
 * �Ŷ��j�p�O�ۦP��,���D�Ʋժ������������s�a�}, �n�d�䪺�����u�n
 * ���D�U�дN�i�H�ֳt���p��X�����q, �q�L���������s�a�}�[�W�����q
 * �ֳt�p��X�n�d�䤸�������s�a�}, �q�L���s�a�}�ֳt�w��Ӥ���,
 * �ҥH�Ʋլd�䤸�����Ĳv����.
 * 
 * �H������Ʋնi��W�R����, ��W�[�������ɭ�, ���F�O�ҼƲդ�����
 * �b�Ŷ��s�x�W�O���Ǫ�, �ҥH�Q�K�[������m�᭱���Ҧ��������n�V�Ჾ��.
 * �R�������]�O, �᭱�Ҧ��������n�V�e����, �ҥH�Ʋժ��W�R�����Ĳv�ܧC.
 * 
 * ��l�Ƥ@���Ʋզ���ؤ覡:
 * 	1.�R�A��l��
 * 	2.�ʺA��l��
 */
public class ArrayTest02 {
	
	public static void main(String[] args) {
		
		//�R�A��l�Ƥ@��int�������@���Ʋ�
		int[] a1  = {10,12,31};
	
		//���o�Ĥ@�Ӥ���
		System.out.println("�Ĥ@�Ӥ���" + a1[0]);
		System.out.println("�̫�@�Ӥ���" + a1[2]);
		System.out.println("�̫�@�Ӥ���" + a1[a1.length-1]);
		
		//���o�Ӽ�
		System.out.println("�Ʋդ��������ӼƬO" + a1.length);
		
		//�M���@���Ʋ�
		for(int i=0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
	
		//�N�ĤG�Ӥ����ק令100
		a1[1] = 100;
		System.out.println("-----------------");
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	
	
	
	
	
	
	
	}
}
