/*
 	
 */
public class OOOTest03 {
	public static void main(String[] args) {
		
		//u是引用
		//u是局部變數
		User u = new User();
		
		//上個版本寫的
		//u.addr = new Adress();
		
		//a是引用
		//a是局部變數
		Adress a = new Adress();
		u.addr = a;
		
		System.out.println(u.addr.city); //null
		
		System.out.println(a.city); //null
		
		a.city = "新北";
		System.out.println(u.addr.city); //新北
		
	}
}
