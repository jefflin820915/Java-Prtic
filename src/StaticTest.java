/*
 * ��k�ƻ�ɭԩw�q���R�A��k
 * 		��k�y�z���O�ʧ@,��Ҧ�����H����o�Ӱʧ@���ɭ�,�̲ײ��ͪ��v�T�O�@�˪�,����
 * 		�o�Ӱʧ@�w�g���A�ݩ�Y�Ӥ@�ӹ�H���ʧ@,�i�H�N�o�Ӱʧ@���ɬ����ŧO���ʧ@,�ҪO
 * 		�ŧO���ʧ@.
 * 
 * �R�A��k���L�k�����X�ݹ���ܼ�,��Ҥ�k
 * 
 * �j�h��k���w�q����Ҥ�k,�@��@�Ӧ欰�Ϊ̤@�Ӱʧ@�o�ͪ��ɭ�,���ݭn��H���ѻP
 * ���O�]���ҥ~, �Ҧp:�j�h��"�u����"������k���O�R�A��k,�]���u�����N�O��k�s��,���F
 * ��K�ե�,�۵M���ݭnnew��H�O�̦n��.
 */
public class StaticTest {
	
	//����ܼ�
	int i = 100;
	
	//��Ҥ�k
	public void doSome() {
		
	}
	
	//�R�A��k
	public static void main(String[] args) {
	//System.out.println(i);
	//doSome();
		
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.doSome();
		
		//�ϥμƾǤu����
		System.out.println(MathUtil.sumInt(10, 20));
		System.out.println(MathUtil.divide(40, 20));
	}

}
/*
 * class ��{
 * 		�R�A�N�X��;
 * 		��ҥN�X��;
 * 
 * 		�R�A�ܼ�
 * 		����ܼ�
 * 		
 * 		�c�y��k
 * 
 * 		�R�A��k
 * 		��Ҥ�k
 * }
	this
	static

*/