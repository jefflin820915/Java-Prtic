/*
  continue語句:
  	1. continue表示: 繼續/go on/下一個
  	
  	2. continue也是一個continue關鍵字加一個分號, 構成一個單獨的完整的java語句, 
  	主要出現循環語句當中用來控制循環的執行.
  	
  	3. break和contimnue的區別?
  		break表示循環不執行了,  跳出循環, 終止循環
  		continue表示終止當前本次循環,  直接進入下一次循環繼續執行.
  	
  	4. continue也有這樣的語法:
  		continue 循環名稱; 
 */
public class ContinueTest {
	public static void main(String[] args) {
	
		for(int i = 0; i< 10; i++) {
			if(i ==5) {
				break;
			}
			System.out.println("i---> " + i); // 0 1 2 3 4
		} 
		System.out.println("Hello World");
	
	
		for(int i = 0; i< 10; i++) {
			if(i ==5) {
				continue; //只要這個語句執行, 當前本次循環停止, 直接進入下一次"繼續"執行
			}
			System.out.println("i---> " + i); // 0 1 2 3 4 6 7 8 9
		} 
		System.out.println("Hello World");
	
	
		
		for1:for(int i = 0; i< 10; i++) {
			if(i ==5) {
				continue for1; //只要這個語句執行, 當前本次循環停止, 直接進入下一次"繼續"執行
			}
			System.out.println("i---> " + i); // 0 1 2 3 4 6 7 8 9
		} 
		System.out.println("Hello World");
	
	
	}
}
