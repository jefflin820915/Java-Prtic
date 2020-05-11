/*
   while循環語句
   	1. while循環語法結構:
   		
   		while(布林表達式){
   			循環體:
   		}
   	
   	2. while循環的執行原理:
   	
   		先判斷布林表達式的結果:
   			true
   				執行循環體
   					判斷布林表達式的結果
   						true
   							執行循環體
   								判斷布林表達式的結果:
   									true
   										執行循環體
   											判斷布林表達式的結果:
   												......
   									false
   										循環結束
   						false
   							循環結束
   			false
   				循環結束
   		
   	3. while循環的循環次數:
   		0 ~ N次
   			while循環的循環體可能執行次數為0次.
 */
public class WhileTest {
	public static void main(String[] args) {
	
		/*
		//死循環
		while(true) {
			System.out.println("A");
		}
		*/
		//編譯器檢測到永遠無法被執行, 所以錯誤.
		//System.out.println("Hello World");
		
		int i = 10;
		int j = 3;
		
		while(i>j) {
			System.out.println("呀呼");
		}
		
		//正確
		System.out.println("Hello World");
		
		/* 
		while(10>3) {
			System.out.println("呀呼");
		} */
		
		// 錯誤
		//System.out.println("Hello World");
		
		
		
	}

}
