/*
 * 關於java語言當中final關鍵字:
 * 		1. final是一個關鍵字,表示最終的,不可變的
 * 		2. final修飾的類無法被繼承
 * 		3. final修飾的方法無法被覆蓋
 * 		4. final修飾的變數一旦賦值之後不可重新賦值
 * 		5. final修飾的實例變數,必須手動賦值,不能採用系統默認值
 * 		6. final修飾的引用
 * 			final修飾的引用雖然指向某個對象之後不能指向其他對象,但是所指向的對象內部的內存是可以修改的.
 * 		7. final修飾的實例變數,一般和static聯合使用,被稱為常數
 * 	
 */
public class FinalTest01 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
	
	final int k = 100;
	//錯誤,無法為最終變數k分配值
	//k = 200;
	
	final int m;
	m = 200;
	//錯誤,無法為最終變數m分配值
	//m = 300;
	
	
	}
}