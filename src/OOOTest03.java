/*
 	
 */
public class OOOTest03 {
	public static void main(String[] args) {
		
		//u�O�ޥ�
		//u�O�����ܼ�
		User u = new User();
		
		//�W�Ӫ����g��
		//u.addr = new Adress();
		
		//a�O�ޥ�
		//a�O�����ܼ�
		Adress a = new Adress();
		u.addr = a;
		
		System.out.println(u.addr.city); //null
		
		System.out.println(a.city); //null
		
		a.city = "�s�_";
		System.out.println(u.addr.city); //�s�_
		
	}
}
