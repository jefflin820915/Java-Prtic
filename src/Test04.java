/*
 * 實例代碼塊/實例語句塊[了解內容,使用非常少]
 * 		1.實例代碼塊可以編寫多個,也是遵循至上而下的順序依序執行
 * 		2.實例代碼塊在構造方法執行之前執行,構造方法執行一次,實例代碼塊對應執行一次
 * 		3.實例代碼塊也是java為程序員準備的一個特殊的時機,時機被稱為對象初始化時機
 */
public class Test04 {
	
	public Test04(){
		System.out.println("Test類的缺省構造類執行");
	}
	
	//實例代碼塊
	{
		System.out.println(1);
	}
	
	//實例代碼塊
	{
		System.out.println(2);
	}
	
	//實例代碼塊
	{
		System.out.println(3);
	}
	
	//主方法
	public static void main(String[] args) {
		
		System.out.println("123");
		new Test04();
		new Test04();
	}
}
