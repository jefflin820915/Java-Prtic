/*
	java���K�ذ򥻼ƾ��������]�˺���
		
		�򥻼ƾ�����			�]������
		byte				java.lang.Byte;
		short				java.lang.Short;
		int					java.lang.Integer;
		long				java.lang.Long;
		
		float				java.lang.Float;
		double				java.lang.Double;
		
		boolean				java.lang.Boolean;
		
		char				java.lang.Character;
		
		���:	java���@���K�ؼƾ����������ζ�?������java���٭n���ѹ������]����
					��K
 */
public class IntegerTest01 {
	
	
	//�ݨD: �W�wm1��k�i�H����java������@�ؼƾ�����
	//m1��k�p�G�Q����byte�������ƾ�, �i�H�Nbyte�������]�˦�java.lang.Byte;�A�ǻ��Ѽ�
	public static void m1(Object o) {
		System.out.println(o);
	}
	
	
	//�J�f
	public static void main(String[] args) {
		
		//�򥻼ƾ�����
		byte b = 10;
		
		//�ޥμƾ�����
		Byte b1 = new Byte(b);
		
		m1(b1); //10 Byte�w�g�NObject����Sring��k���g 
	}
}	
