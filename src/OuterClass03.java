/*
 * �������������P�󧽳��ܼ�
 * 
 * �����������b�X�ݧ����ܼƪ��ɭ�,�����ܼƥ����ϥ�final�׹�
 */
public class OuterClass03 {
	
	//��k
	public void m1() {
		
		//�����ܼ�
		
		final int i = 10;
		
		//�����ܼ���
		//��������������γX�ݱ����v���׹��ŭ׹�
		class InnerClass{
			
			
			//���������঳�R�A�n��
			//public static void m1() {}
			
			//������k
			public void m2() {
				System.out.println(i); //10
			}
		}
	
		//�ե�m2
		InnerClass ic = new InnerClass();
		ic.m2();
	
	}
		
		//�J�f
		public static void main(String[] args) {
			OuterClass03 oc = new OuterClass03();
			oc.m1();
			 
			
		}
}
