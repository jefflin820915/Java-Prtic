/*
 	�`�Jreturn�y�y
 		�a��return����r��java�y�y�u�n����, �Ҧb����k���浲��.
 		
 		�b"�P�@�ӧ@�ΰ�"��, return�y�y�U������s�g����N�X, �]���o�ǥN�X�û����椣��, �ҥH����.
 		
 		
 */
public class MethodTest08 {
	public static void main(String[] args) {
		/*
		int retValue = m();
		System.out.println(retValue);
		*/
		
		//���~, �եΤ�k, ��k�W�᭱���A��.
		//System.out.println(m);
		
		System.out.println(m());
	
	}
	
	/*����, �ʤ֪�^�y�y, �H�U�{�ǽsĶ���{��
	//�L�k�ʤ��ʪ��O��return 1;�|����
	public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
		}
	}*/

	//�H�U�{�ǥi�H�O��return 1; �� return 0; ����
	/*public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
		}else {
			return 0;
		}
		
	}		
	
	//�M�W��ۦP	
	public static int m() {
			int a = 10;
			if(a>3) {
				return 1;
			}
				return 0;
	
	}*/


	/*public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
			//�o�̤���s�g�N�X, ����, �]���L�k�X�ݻy�y
			//System.out.println("Hello");
		}
		//�o�̪��N�X�i�H�����
		System.out.println("Hello");
		return 0;
		//�o�̤���s�g�N�X, ����, �]���L�k�X�ݻy�y
		//System.out.println("Hello");

}*/

	public static int m() {
		//return 10 > 3 ? 1 : 0 ;
		return 2 > 3 ? 1 : 0 ;

}
}