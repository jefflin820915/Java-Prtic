/*
	���R�H�U�{�Ǧ��X�ӽu�{
 		�H�U�{�ǥu���@�ӽu�{, �N�O�D�u�{
		main,m1,m2,m3�o�|�Ӥ�k�b�P�@�Ӵ̪Ŷ���
		�S���Ұʨ�L����u�{
 */
public class ThreadTest01 {

	public static void main(String[] args) {
		
		m1();
		
	}


	public static void  m1() {
		
		m2();
	}

	public static void m2() {
		
		m3();
	}
	
	public static void m3() {
		
		System.out.println("m3....");
	}


}
