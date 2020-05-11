/*
 	do...while循環
 		1. do..while循環的語法結構
 			
 			do{
 				循環體;
 			}while(布林表達式);
 			
 		2. do..while循環的執行原理
 			先執行循環體:
 				判斷布林表達式結果:
 					true
 						執行循環體
 							判斷布林表達式結果:
 								true
 									執行循環體
 										判斷布林表達式結果:
 											true
 												執行循環體
 													判斷布林表達式結果:
 														.......
 											false
 												循環結束
 								false
 									循環結束
 					false
 						循環結束
 		
 		3. do..while循環的執行次數
 			do..while的循環體代碼片段次數是: 1~N次 [至少一次]
 		
 		4. 使用do..while循環的注意事項
 			do..while循環語句最終有個"分號"
 */
public class DoWhileTest {
	public static void main(String[] args) {
	
		int i = 10;
		
		do {
			System.out.println(i);
		}while(i > 100);
		
		System.out.println("-------------------------------");
		
		while(i > 100) {
			System.out.println("i --> " + i);
		}
		
		System.out.println("--------------------------------");
		
		int a = 1;
		do {
			System.out.println(a); // 1 2 3 4 5 6 7 8 9 10
			a++;
		}while(a<=10);
		
		
	}

}
