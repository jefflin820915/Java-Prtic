/*	
	�H�U��k���ϥΤ�k��������, ���ϥ�overload, ���R���I�b��?
 		1. sumInt, sumDouble, sumLong�\�ण�P���O�\��ۦ�, ���O�D�M
 		�b�H�U�{�Ƿ��\��ۦ�����k,���O�_�F�T�Ӥ��P���W�r, �o���{�ǭ��ӻ�, 
 		�եΤ�k������, �{�ǭ��ݭn�O�Ч�h����k, �~�৹���ե�.
 		
 		2. �N�X�����[.
 		
 */
public class OverloadTest01 {
	
	//�J�f
	public static void main(String[] args) {
		
		//�եΤ�k
		int result = sumInt(1, 2);
		System.out.println(result);
		double result2 = sumDouble(1.0, 2.0);
		System.out.println(result2);
		long result3 = sumLong(1L, 2L);
		System.out.println(result3);

	
}



//�w�q�@�Ӥ�k,�i�H�p����int�������M
	public static int sumInt(int a, int b) {
		return a + b;
	}
//�w�q�@�Ӥ�k,�i�H�p����double�������M
	public static double sumDouble(double a, double b) {
		return a + b;
	}
//�w�q�@�Ӥ�k,�i�H�p����long�������M
	public static long sumLong(long a, long b) {
		return a + b;
	}
//�o��ĪG:�{�ǭ��b�ϥΤW���T�Ӭۦ�����k���ɭ�, �N���b�ϥΤ@�Ӥ�k�@��
//java���, ���ǻy�������: javascrpit
}
