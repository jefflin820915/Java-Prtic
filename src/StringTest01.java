/*
 * java.lang.String�O�r�Ŧ�����
 * 	1. �r�Ŧ�@���Ы�,���i�b����. "abc"�r�Ŧ�@���Ы�, ���i�b���ܦ�"abcd"
 * 	
 * 	2. ���ɦr�Ŧꪺ�X�ݮĲv,�b�{�Ǥ��ϥΤF"�w�s"�޳N. �ҥH�bjava���Ҧ�"���޸�"�A�_��
 * 	���r�Ŧ곣�|�b"�r�Ŧ�`�Ʀ�"���Ыؤ@��, �r�Ŧ�`�Ʀ��b��k�Ϥ��Q�s�x
 * 	
 * 	3. �b�{�ǰ���L�{��, �p�G�{�ǥΨ�Y�Ӧr�Ŧ�, �Ҧp"abc", ����{�Ƿ|�b�r�Ŧ�`�Ʀ�
 * 	���h�j���Ӧr�Ŧ�, �p�G�S�����h�b�r�Ŧ�`�Ʀ����s�ؤ@��"abc"�r�Ŧ�, �p�G���N����
 * 	���ӥ� .(�r�Ŧ�`�Ʀ��O�@�ӽw�s��, ���F�����X�ݦr�Ŧꪺ�Ĳv)
 */
public class StringTest01 {
	
	public static void main(StringTest01[] args) {
		
		//�Ыؤ@��"abc"�r�Ŧ��H, �ӹ�H�����s�a�}, ��s1�ܼƫO�s
		//s1�O�@�Ӥޥ�, s1���V"abc"��H
		String s1 = "abc";
		
		//�i�H��s1���s���V  s1�O�����ܼ�,s1�e��S��final, �ҥH�i�H���s���V.
		//���O"def"�r�Ŧꤣ�i��
		s1 = "def";
		
		String s2 = "HELLO"; //�b�r�Ŧ�`�Ʀ����s�ؤ@��"HELLO"�r�Ŧ��H, �ӹ�H���i��
		String s3 = "HELLO"; //�q�r�Ŧ�`�Ʀ����������ӥ�
	
		System.out.println(s2==s3); //true
		
		//�����Ӧr�ŬO�_�۵�, �����"=="
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		System.out.println(s4==s5); //false
		
		//�����Ӧr�Ŧ�O�_�@�P, �����ϥ�String�����Ѫ�equals��k.
		System.out.println(s4.equals(s5)); //true
		
		//�w�U�{�ǵ�������|�b�r�Ŧ�`�Ʀ����Ы�3�Ӧr�Ŧ��H 
		//"aaa" "bbb" "aaabbb"
		String s6 = "aaa";
		String s7 = "bbb";
		String s8 = s6 + s7;
	
	
	
	}
}
