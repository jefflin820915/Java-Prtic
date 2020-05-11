/*
 1. 循環結構:
 	在程序當中總有一些代碼需要重複執行, 假設沒有循環結構.
 	那麼需要重複執行的代碼自然需要重複編寫, 代碼無法得到重複
 	使用,所以多數編成語言都是支持循環結構.將來把反覆執行的代碼片段
 	放到"循環體"在聯合"計數器", 共同控制需要重複執行的代碼.
 
 2. 基本上所有編成語言支持的循環包括三種:
 	for循環
 	while循環
 	do...while循環
 
 3. 當前實例主要講解for循環, for循環的語法結構是甚麼
 	
 	語法結構:
 		
 		for(初始化表達式	; 布林表達式	; 更新表達式){
 			//這裡是需要重複執行的代碼片段[循環體: java語句組成]
 		}
 4. for循環的執行過程/原理 [*****]
 	4.1. 初始化表達式, 布林表達式, 更新表達式都不是必需的 [兩個分號是必須的]
 	4.2. 初始化表達式最先執行, 並且在整個for循環當中只執行一次.
 	4.3. 布林表達式必須式true/false, 不能是其他值.
 	4.4 . for的執行過程:
 		
 		先執行初始化表達式, 並且該表達式只執行一次
 		
 		判斷布林表達式的結果是true還是false
 			
 		-	布林表達式true
 				
 				執行循環體
 				
 				執行更新表達式
 				
 				判斷布林表達式是true還是false
 				
 					布林表達式true
 						
 						執行循環體
 						
 						執行更新表達式
 							
 							判斷布林表達式是true還是false
 								
 								布林表達式true
 								
 									執行循環體
 									
 									執行更新表達式
 										
 										判斷布林表達式是true還是false
 											
 											.......
 								
 								布林表達式false
 									
 									循環結束
 					
 					布林表達式false
 					
 						循環結束
 			
 		-	布林表達式false
 		
 				循環結束
 */
public class ForTest {
	public static void main(String[] args) {
		/*
		//輸出數字1~10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		
		//使用循環結構來替代以上所有反覆執行的代碼
		//使用循環語句可以讓代碼量變少
		//上面代碼改for循環
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 10 ; i += 1) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 10 ; i = i + 1) {
			System.out.println(i);
		}
	
		
		//死循環
		for(; ;) {
			System.out.println("a");
		}
	
	
	
	}

}
