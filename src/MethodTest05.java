/*
 	��k�ե�:
 		1. ��k���׹��ŦC�����static����r, ���㪺�եΤ覡�O: ���W.��k�W(��ѦC��);
 		
 		2. ���O, �����ɭ�"���W."�i�H�ٲ�, �ƻ򱡪p�U�i�H�ٲ�:
 			m1(){
 				m2();
 			}
 			m1��k�Mm2��k�b�P�@����������ɭ�, "���W."�i�H�ٲ����g
 		
 		3. ��ĳ�b�@��java������u�w�q�@��class, ����M��, �o�̥u�O���F���Ҥ�K�~�b
 		�@��java������s�g�F�h��class, ���n�ҥ�.
 */
public class MethodTest05 {
	
	
	
	public static void main(String[] args) {
		
		//�եΤ�k
		MethodTest05.m();
		
		//����k���׹��ŦC�����static����r��: "���W."�i�H�ٲ����g��
		m();
	
		//�եΨ�L��[���O����]������k
		A.doOther();
	
		//�ٲ�"���W."�ո�
		//����, "���W."�ٲ�����, �q�{�q��e������"doOther"��k, �b��e�����Ӥ�k���s�b.
		//doOther();
		
	}

	public static void m() {
		System.out.println("m method execute");
	
		//���㪺�覡
		MethodTest05.m2();
		
		//�ٲ����覡
		m2();
		
		//���Q�եη�e��������m2��k, �o�ӮɭԴN�����K�["���W."�F
		A.m2();
	}

	public static void m2() {
		System.out.println("m2 execute");
	}
}

class A{	
	public static void doOther() {
		System.out.println("A's doOther method invoke");
	}

	public static void m2() {
		System.out.println("A's method m2 invoke");
	}


}