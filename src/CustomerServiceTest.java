
public class CustomerServiceTest {
	
	//入口
	public static void main(String[] args) {
		
		//要執行CustomerServiceImpl中的logout方法
		
		//以下程序面向接口去調用
		CustomerService cs = new CustomerServiceImpl(); //多態
			
		//調用
		cs.logout();
	}
}
