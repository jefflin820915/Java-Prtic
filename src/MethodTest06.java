/*
	���R�H�U��X���G:
		main begin
		m1 begin
		m2 begin
		m3 begin
		m3 over
		m2 over
		m1 over
		main over

		����e���{�Ǩӻ�:
			main��k�̥��Q�ե�, �]�O�̫�@�ӵ���
			�̫�եΪ���k�Om3��k, �Ӥ�k�̥�����
			
		main��k��������, ��ӵ{�ǵ��� [ �o�y�ܥu�A�X��e�������e ]
		
		���Ψ�N�O��: 
			�u�n�O���k�����N�X�O�ۤW�ӤU�����Ǩ̦�����Y�i.
			��e�檺�{�Ǧb�S���������ɭ�, �U�@��N�X�O�L�k���檺.
 */
public class MethodTest06 {
	public static void main(String[] args) {
		System.out.println("main begin");
	
		m1(); //�Ȱ�
		
		System.out.println("main over");
	}

	public static void m1() {
		System.out.println("m1 begin");
		
		m2(); //�Ȱ�
		
		System.out.println("m1 over");
	}
	
	public static void m2() {
		System.out.println("m2 begin");
		
		m3(); //�Ȱ�
	
		System.out.println("m2 over");
	}
	
	public static void m3() {
		
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
		
}