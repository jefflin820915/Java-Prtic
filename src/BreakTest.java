/*
 關於java控制語句的break語句:
 	
 	1. break是java語言當中的關鍵字, 被翻譯為"中斷/折斷"
 	
 	2. break + ";"可以成為一個單獨的完整地java語句: break;
 	
 	3. break語句使用在switch語句當中, 用來終止switch語句執行.
 	
 	4. break語句同樣可以使用在循環語句當中, 用來終止循環的執行.
 	
 	5. break終止哪個循環?
 	
 	6. break; 語句使用在for,while,do...while循環語句當中用來跳出循環, 終止循環.
 	因為當程序循環到某個條件的時候, 後續的循環沒必要執行了, 再執行也是耗費資源, 所以
 	 可以終止循環, 這樣可以提高程序的執行效率
 	 
 	7.  以下以for循環為例使用break;語句.
 	
 	8. 在默認情況下, break;語句終止的是與它最近的循環語句, 當然也可以指定終止某個循環.
 	需要給循環起名. 採用這種語法:	break 循環名稱;
 */
public class BreakTest {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i ==5) {
				break; //終止的是當前的for循環
			}
			System.out.println("i--->" + i); // 0 1 2 3 4
		}
		
		//這裡的程序和以上的for循環無關
		System.out.println("Hello Wolrd");
		
		for(int j = 0; j<3; j++) {
			for(int i=0; i<10; i++) {
				if(i ==5) {
					break; //當前的break語句終止的是內層的for循環, 因為離它最近
						   //這裡的break語句不會影響到外層的for循環
				}
					System.out.println("i--> " + i);
			
			}
		}		
		
			System.out.println("------------------------------------------------------------");
		//給for循環起名for1
		for1:for(int j = 0; j<3; j++) {
			//給for循環起名for2
			for2:for(int i=0; i<10; i++) {
				if(i ==5) {
					break for1; //終止for1循環
			}
				System.out.println("i--> " + i);	
		}
		}
		System.out.println("Hello World");	
			
			
			

		
		
	}

}