/*
 	��k���եΤ��@�w�bmain��k��,�i�H�b��L��k��.
	�u�n�O�{�ǥi�H���檺��m, ���i�H�h�եΨ�L��k
 */
public class MethodTest03 {
	
	public static void sum(int a,int b) {
		
		System.out.println(a + "+" + b + "=" + (a + b));
		
		//�ե�doSome��k
		MethodTest03.doSome();
	}
	
	//�D��k
	public static void main(String[] args) {
		
		//�ե�sum��k
		MethodTest03.sum(1, 2);
	
		System.out.println("Hello World");
	
	}

	public static void doSome() {
		System.out.println("do some");
	}

}
