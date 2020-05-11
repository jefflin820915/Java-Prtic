/*
 	方法的返回值類型不是void的時候
 	
 		1. 返回值類型不是void的時候要求方法必須保證百分百的執行"return 值;
 		"這樣的語句來完成值的返回, 沒有這語句會報錯.
 		
 		2. 一個方法有返回值的時候,當我們調用這個方法的時候, 方法返回了一個值
 		對於調用者來說這個返回值, 這個返回值可以選擇接收, 也可以選擇不接收.
 		但是大部分情況下我們都是選擇接收的.
 		
 		3. 
 */
public class MethodTest07 {
	public static void main(String[] args) {
		
		//調用方法
		 //這裡沒有接收這個方法的返回數據
	
		//這裡接收一下方法執行結束之後的返回值
		//採用變數接收
		//變數的數據類型需要和返回值的數據類型相同, 或者可以自動類型轉換.
		//boolean b = divide(10,3); //編譯報錯, 類型不兼容
		
		//賦值運算符的右邊先執行, 將執行結果賦值給左邊的變數
		int i = divide(10, 3);
		System.out.println(i);
		
		long x = divide(10,3);
		System.out.println(x);
	}
	
	/*
	 	需求:
	 		請定義實現一個方法, 該方法可以計算兩個int類型數據的商,
	 		要求將最終的計算結果返回給調用者.
	*/
	
	//編譯報錯,缺少返回語句
	/*
	public static int divide(int a,int b) {
		
	}
	*/
	
	//編譯錯誤, 缺少返回值
	/*public static int divide(int a,int b) {
		return ;
	}*/

	//編譯錯誤, 方法定義的時候要求返回一個int類型, 此時返回boolean類型, 類型不兼容
	/*public static int divide(int a,int b) {
		return true;
	}*/
	
	//可以, 但具體的方法體中編寫的代碼無法滿足當前需求
	/*public static int divide(int a,int b) {
		int c = a / b;
		return c;
	}*/
	
	public static int divide(int a,int b) {
		System.out.println("Hello World");
		return a/ b;
	}
}
