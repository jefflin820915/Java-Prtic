
//���R�w�U�{�Ǫ���X���G

public class MethodTest2_02 {
	public static void main(String[] args) {
		int i = 10;
		method(i);
		System.out.println("main----->" + i); //10
	}
		
	public static void method(int i) {
		i++;
		System.out.println("methid----->" + i); //11
	}
}
