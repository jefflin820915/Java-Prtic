
/*
 * ��{�p�������
 		+
 		-
 		*
 		/
 		%
 	��{���
 		1. ��ܩҦ��ƾڱq��L��J
 		2. �ϥ�switch�y�y�i��P�_
 		3. �ݭn�q����x��J�T��:
 			�Ĥ@�ӼƦr
 			�B���
 			�ĤG�ӼƦr
 		
 		�̲צb����x�W�O�o�˳���:
 			�w��ϥ�²��p�⾹�t��:
 			�п�J�Ĥ@�ӼƦr: 10
 			�п�J�B���: +,-,*,/,%
 			�п�J�ĤG�ӼƦr: 20
 			�B�⵲�G: 10 + 20 = 30
 			
 */
public class switchTest03 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("�п�J�Ĥ@�ӼƦr");
		int num1 = s.nextInt();
		System.out.println("�п�J�B���");
		String Opr = s.next();
		System.out.println("�п�J�ĤG�ӼƦr");
		int num2 = s.nextInt();

		int result = 0;
		
		switch (Opr) {
		case "+" :
			result = num1 + num2;
			//System.out.println(num1 + num2 );
			break;
		
		case "-" :
			result = num1 - num2;
			//System.out.println(num1 - num2);
			break;
		
		case "*" :
			result = num1 * num2;
			//System.out.println(num1 * num2);
			break;
		
		case "/" :
			result = num1 / num2;
			//System.out.println(num1 / num2);
			break;
		
		case "%" :
			result = num1 % num2;
			//System.out.println(num1 % num2);
			break;
		
		default :
			System.err.println("�L�k�T�{");
		}
		System.out.println("�B�⵲�G��: " + num1 + Opr + num2 + " = " + result);
		
		
		
	}
}
