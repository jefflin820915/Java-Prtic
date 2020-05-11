/*
 	關於方法的遞歸調用
 		1. 甚麼是遞歸
 			方法自身調用自身
 			a(){
 				a():
 			}
 		2. 遞歸是很耗費內存, 遞歸算法可以不用就不用
 		
 		3. 以下程序運行有錯[不是異常, 是錯誤Error]
 			java.lang.StackOverfolwError
 			棧內存溢出錯誤
 			錯誤發生無法挽回, 只有一個結果, 只能讓JVM結束
 		
 		4. 遞歸必須有結束條件, 沒有結束條件一定會發生棧內存溢出錯誤
 		
 		5. 遞歸即使有了結束條件, 即使結束條件是正確的, 也有可能發生棧內存易出錯誤.
 		因為遞歸的太深了
 		
 		注意:
 			遞歸可以不使用盡量別用
 			但是有些情況下該功能的實現必須靠遞歸方式.
 */
public class RecursionTest01 {
	
	//主方法
	public static void main(String[] args) {
		
		System.out.println("main begin");
		//調用doSome方法
		doSome();
		System.out.println("main over");
	}
	
	//以下代碼片段雖然只有一份
	//但是可以被重複調用, 並且只要調用doSome方法就會在棧內存中新分配一塊所屬內存空間
	public static void doSome() {
		System.out.println("doSome begin");
	
		doSome();//這行代碼不結束, 下一行不能執行
		
		System.out.println("doSome over");
	}
	
	

}
