
/*
 * ���󦨭�������
 * 	
 * 	1. �����������i�H���P�ݰ������ܼ�
 * 	
 * 	2.���������������঳�R�A�n��
 * 
 * 	3.�����������i�H�X�ݥ~�����Ҧ��ƾ�
 *  
 * 	
 */
public class OuterClass02 {
		
	//�R�A�ܼ�
	static String s1 = "A";
	
	//�����ܼ�
	private String s2 = "B";
	
	//�R�A��k
	private static void m1() {
		System.out.println("static's m1 method execute");
	}
	
	//������k
	private void m2() {
		System.out.println("static's m2 method execute");
	}
	
	//����������
	//�i�H�γX�ݱ����v�����׹��ŭ׹�
	//public ,protected,private,�ʬ�
	class InnerClass{
		
		//�w�q�R�A��k
		//public static void m3() {}
	
		//������k
		public void m4() {
			
			System.out.println(s1);
			m1();
			
			m2();
			System.out.println(s2);
		}
	}
	
//�J�f	
public static void main(String[] args) {
	
	//�Ыإ~������H
	OuterClass02 oc = new OuterClass02();
	InnerClass ic = oc.new InnerClass();
	
	ic.m4();

}
	
	
	
	
	
}
