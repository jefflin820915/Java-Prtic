/*
 * 匿名內部類: 只的是類沒有名字
 */
public class OuterClass04 {
	
	//靜態方法
	public static void t(CustomerService01 cs) {
		
		cs.logout();
	}
	
	
	//入口
	public static void main(String[] args) {
		
		//調用t方法
		//t(new CustomerServiceImpl01());
		
		//使用匿名內部類的方式執行t方法
		//整個這個"new CustomerService01(){}"這個就是匿名內部類
		t(new CustomerService01() {
			
			@Override
			public void logout() {
				System.out.println("系統退出");
			}
		});
	
		//匿名內部類的優點: 少定義一個類.
		//缺點: 無法重複使用
	
	}
}



//接口
interface CustomerService01{
	
	//退出系統
	void logout();
	
}

//編寫一個類實現 CustomerService01接口
/*
class CustomerServiceImpl01 implements CustomerService01{
	public void logout() {
		System.out.println("退出系統");
	}
}*/