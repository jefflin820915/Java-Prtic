
public class Customer03Test {
	public static void main(String[] args) {
		
		//創建Customer對象
		Customer03 c1 = new Customer03();
		c1.name = "TzuEn";
		
		//c1購物
		c1.shopping();
		
		//再創建Customer對象
		Customer03 c2 = new Customer03();
		c2.name = "list";
		
		//c2購物
		c2.shopping();
		
		//調用doSome(修飾符列表上有static)
		//採用"類名."的方式訪問,顯然這個方法在執行的時候不需要對象的參加.
		Customer03.doSome();
		
		//調用doOther
		Customer03.doOther();
	}

}
