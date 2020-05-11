/*
 	
 */
public class OOOTest03 {
	public static void main(String[] args) {
		
		//u琌まノ
		//u琌Ы场跑计
		User u = new User();
		
		//セ糶
		//u.addr = new Adress();
		
		//a琌まノ
		//a琌Ы场跑计
		Adress a = new Adress();
		u.addr = a;
		
		System.out.println(u.addr.city); //null
		
		System.out.println(a.city); //null
		
		a.city = "穝";
		System.out.println(u.addr.city); //穝
		
	}
}
