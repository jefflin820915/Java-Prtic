/*
	分析以下輸出結果:
		main begin
		m1 begin
		m2 begin
		m3 begin
		m3 over
		m2 over
		m1 over
		main over

		對於當前的程序來說:
			main方法最先被調用, 也是最後一個結束
			最後調用的方法是m3方法, 該方法最先結束
			
		main方法結束之後, 整個程序結束 [ 這句話只適合當前所講內容 ]
		
		不用刻意記憶: 
			只要記住方法中的代碼是自上而下的順序依次執行即可.
			當前行的程序在沒有結束的時候, 下一行代碼是無法執行的.
 */
public class MethodTest06 {
	public static void main(String[] args) {
		System.out.println("main begin");
	
		m1(); //暫停
		
		System.out.println("main over");
	}

	public static void m1() {
		System.out.println("m1 begin");
		
		m2(); //暫停
		
		System.out.println("m1 over");
	}
	
	public static void m2() {
		System.out.println("m2 begin");
		
		m3(); //暫停
	
		System.out.println("m2 over");
	}
	
	public static void m3() {
		
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
		
}