/*
 * 	1. 異常是甚麼?
 * 		異常模擬的是現實世界中"不正常"的事件.
 * 		java中採用"類"去模擬異常.
 * 		類是可以創建對象.
 * 		NullPointerException e = 0x1234;
 * 		e是引用類型, e中保存的內存地址指向堆中的"對象"
 * 		這個對象一定是NullPointerException類型.
 * 		這個對象就表示真實存在的異常事件
 * 		NullPointerException是一類異常.
 * 		
 * 		類和對象的概念
 * 		
 * 	2. 異常機制的作用
 * 		java語言為我們提供一種完善的異常處理機制
 		作用是: 程序員發生異常之後,為我們輸出詳細異常
 		程序通過這個訊息,可以對程序進行一些處理,使程序更加健壯
 * 		 
 */
public class ExcaptionTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int c = a/b; //ArithmeticException e = 0x2323;
		
		//上面的代碼出現了異常,沒有處理,下面代碼不會執行,直接退出JVM,
		System.out.println("HW");
		
/*
以上編譯通過了, 但是運行時出現了異常, 表示發生了某個異常事件
JVM向控制台輸出如下的訊息
本質: 程序執行過程中發生了算數異常這個事件, JVM為我們創建了一個ArithmeticException類型的對象
並且這個對象中包含了詳細的異常訊息,並且JVM將這個對象中的訊息輸出到控制台
Exception in thread "main" java.lang.ArithmeticException: / by 
zeroat ExcaptionTest.main(ExcaptionTest.java:24)
*/
	}
}
