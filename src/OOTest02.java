//測試類
public class OOTest02 {

	public static void main(String[] args) {
		
		//創建User對象
		//u是局部變數
		//u是一個引用
		//u保存內存地址指向堆內存的User對象
		User u = new User();
		
		//輸出User對象內部實例變數的值
		System.out.println(u.no); //0
		System.out.println(u.name); //null
		System.out.println(u.addr); //null
		
		//修改u的對象內部實例變數的值
		u.no = 110;
		u.name = "jack"; //"jack"是一個java對象,屬於Srring對象
		u.addr = new Adress();
		
		//在main方法當中目前只看到一個引用"u"
		//一切都只能通過u來進行訪問
		System.out.println(u.name + "居住在哪個城市: " + u.addr.city);
		System.out.println(u.name + "居住在哪個街道: " + u.addr.stree);
		System.out.println(u.name + "郵編: " + u.addr.zipcode);
		
		u.addr.city = "新北";
		u.addr.stree = "中正路";
		u.addr.zipcode = "1111111";
		
		System.out.println(u.name + "居住在哪個城市: " + u.addr.city);
		System.out.println(u.name + "居住在哪個街道: " + u.addr.stree);
		System.out.println(u.name + "郵編: " + u.addr.zipcode);
		
		
	
	
	
	}
}
