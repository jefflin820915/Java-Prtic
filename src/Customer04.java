/*
 * 餓漢式單例模式
 */
public class Customer04 {
	
	//類加載只執行一次
	private static Customer04 c = new Customer04();
	
	//構造方法私有化
	
	private Customer04() {}
	
	//提供公開的方法
	
	public static Customer04 geCustomer04() {
		return c;
	}
}
