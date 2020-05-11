
//方法調用的時候實參和形參要求個數對應相同, 數據類型對應相同
//類型不同的時候要求能夠進行相應自動的類型轉換
public class MethodTest04 {
	
	
	
	public static void main(String[] args) {
		
		//錯誤, 參數數量不同
		//MethodTest04.sum();
		
		//錯誤, 實參和形參的類型不是對應相同的
		//MethodTest04.sum(true, false);
	
		//可以
		MethodTest04.sum(10L, 20L);
		
		//存在自動類型轉換: int-->long
		MethodTest04.sum(10, 20);
		
		//錯誤, 參數類型不是對應相同的
		//MethodTest04.sum(3.0, 20);
	
		//可以
		MethodTest04.sum((long)3.0, 20);
	}

	//需求
	public static void sum(long a,long b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}





}
