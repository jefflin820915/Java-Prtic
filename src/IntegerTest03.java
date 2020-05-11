/*
	����Integer���`�Ϊ���k
 */
public class IntegerTest03 {

	public static void main(String[] args) {
		
		//int -> Integer
		//�򥻼ƾ����� -> �ޥμƾ�����
		Integer i1 = new Integer(10); //int -> Integer
		
		//�NInteger-->int
		//�ޥ�����-->������
		int i2 = i1.intValue();
		
		System.out.println(i2 + 1); //11
		
		//���n: static int parseInt(String s);
		//String -> int
		int age = Integer.parseInt("25");
		System.out.println(age+1); //26
		
		
		//"abc"�o�Ӧr�Ŧꥲ���O�Ʀr�r�Ŧ�~��
		//int price = Integer.parseInt("abc"); //java.lang.NumberFormatException
		
		
		//���n: static double parseDouble(String s);
		double price = Double.parseDouble("3.0");
		System.out.println(price+1.0); //4.0
		
		//�Nint�������Q�i���ഫ��2�i��
		
		String s1 = Integer.toBinaryString(10);
		System.out.println(s1); //1010
		
		//�Nint�������Q�i���ഫ��16�i��
		String s2 = Integer.toHexString(10);
		System.out.println(s2); //a
		
		//�Nint�������Q�i���ഫ��8�i��
		String s3 = Integer.toOctalString(10);
		System.out.println(s3); //12
		
		//int -> Integer
		Integer i3 = Integer.valueOf(10);
		
		//String -> Integer
		Integer i4 = Integer.valueOf("10");
		
		System.out.println(i3);
		System.out.println(i4);
	
		
	}
}
