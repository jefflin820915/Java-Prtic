/*
   system.out.println();	�t�d�V����x��X[���s�챱��x][��X���L�{]
   
       �����Τ���L��J, �q"��L"��"���s". [��J���L�{, �줺�s���h]
 */
public class KeyInputTest {
	public static void main(String[] args) {
		
		//�Ĥ@�B: �Ы���L���y����H
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		//�ĤG�B: ��Scanner��H��next()��k�}�l�����Τ���L��J
		//�{�ǰ����o�̷|���U�ӵ��ݥΤ᪺��J
		//��Τ��J���ɭ�, �åB�̲׺V�^�����, ��J���T���|�۰ʽ�ȵ�userInputContent
		//�{�ǰ����o��, �Τ��J���T���w�g�줺�s���F
		//�����奻[�H�r�Ŧ�Φ�����]
		//String userInputContent = s.next(); //���W���N
		
		//�����Ʀr[�H��ƫ�int���Φ��ӱ���] 
		int num = s.nextInt();
		
		//�N���s�����ƾڿ�X�챱��x
		//System.out.println("�z��J�F:" + userInputContent);
		System.out.println("�z��J���Ʀr�O:" + num);
		System.out.println("�z��J���Ʀr�O:" + (num + 100));
	}
}

/* �O��N�X,�ε۪����N�N�X�ƻs�K�W
	�Ĥ@�B:
	java.util.Scanner s = new java.util.Scanner(System.in);
	�ĤG�B:
	String str = s.next();
	��
	int num = s.nextInt();

*/