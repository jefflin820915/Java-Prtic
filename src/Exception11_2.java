/*
 * �������U
 */
public class Exception11_2 {
	
	public static void main(String[] args) {
		
		//���p�Τ᪺���Ѫ��Τ�W�p�U
		String username = "asdsadadasda";
		
		//���U
		Exception11_1 cs = new Exception11_1();
		
		try {
			cs.register(username);
		} catch (Exception11 e) {
			System.out.println(e.getMessage());
		}
	}
}
