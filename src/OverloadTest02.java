/*
  ��k��������
*/

public class OverloadTest02 {
	public static void main(String[] args) {
		
	//�եΤ�k�N���ϥΤ@�Ӥ�k�@��
	//�Ѽƪ��������P, �����եΪ���k���P, 
	//���ɰϤ���k���A�̾a��k�W, �̾a���O�Ѽƪ��ƾ�����
		System.out.println(sum(1, 2)); 
		System.out.println(sum(1.0, 2.0)); 
		System.out.println(sum(1L, 2L));
		
	
	}
	//�H�U�T�Ӥ�k�c����k��������
	public static int sum(int a, int b){
		System.out.println("sum(int, int)" );
		return a+b;	
	}
	public static long sum(long a, long b){
		System.out.println("sum(long, long)" );
		return a+b;
	}
	public static double sum(double a, double b){
		System.out.println("sum(double, double)" );
		return a+b;
	}


}
