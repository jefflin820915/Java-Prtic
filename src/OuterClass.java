/*
 * �����R�A������
 * 	1. �R�A�������i�H���P�ݰ��R�A�ܼ�
 * 
 * 	���������n���@��, �i�H�X�ݥ~�������p�����ƾ�
 * 
 * 	2.�R�A�������i�H�����X�ݥ~�������R�A�ƾ�, �L�k�����X�ݦ����ܼ�/��k
 */
public class OuterClass {
		
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
	
	//�R�A������
	//�i�H�γX�ݱ����v�����׹��ŭ׹�
	//public ,protected,private,�ʬ�
	static class InnerClass{
		
		//�w�q�R�A��k
		public static void m3() {
			System.out.println(s1);
			m1();
			//m2();
			//System.out.println(s2);
			
		}
	
		//������k
		public void m4() {
			
			System.out.println(s1);
			m1();
			
			//m2();
			//System.out.println(s2);
		}
	}
	
	
	//�J�f
	public static void main(String[] args) {
		
		//����m3
		OuterClass.InnerClass.m3();
		
		//����m4
		InnerClass ic = new InnerClass();
		ic.m4();
	}
	
	
	
	
	
	
}
