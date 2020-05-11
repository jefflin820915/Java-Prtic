/*
 關於java語言當中的if語句, 選擇結構, if語句又被稱為分支語句/條件控制語句:
 	1. if語句的語法結構: 四種編寫方式
 		第一種:
 			if(布林表達式){
 				java語句;
 				java語句;
 				java語句;
 				.....
 			}
 		
 		第二種:
 			if(布林表達式){
 				java語句;
 				java語句;
 				java語句;
 				....
 			}
 			else{
 				java語句;
 				java語句;
 				java語句;
 				...
 			}
 		
 		第三種: 
 			if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}.....
 		
 		
 		第四種:
 			if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else if(布林表達式){
 				java語句;
 				java語句;
 				...
 			}else{
 				java語句;
 				java語句;
 				.....
 			}
 				
 		2. 重點: 對於java的if語句來說, 只要有一個分支執行, 整個if語句全部結束.
 		
 		3. 注意: 以上的第二種編寫方式跟第四種編寫方式都帶有else分支, 這兩種方式可以100%保證會有分支執行.
 		
 		4. "所有的控制語句"可以互相嵌套使用的, 只要合理嵌套就可以.
 			if(){
 				if(){
 					if(){
 					}
 				}
 			
 			}else{
 				if(){
 				}else{
 					if(){
 						if(){
 						
 						}
 					}
 				}
 			}
 			
 			注意: 嵌套使用的時候代碼格式要保證完美.[該縮進時必須縮進, 大部分情況下使用大括號包圍需要縮進]
 		{
 	{
 {
 			
 }
 	}
 	  	}
 	  
 	  5. if語句的分支中只有一條java語句的話,大括號可以省略不寫.
 	  	  if(true/false){
 	  	  	 一條java語句;
 	  	  }
 	  	  
 	  	  if(true/false) 一條java語句;
 	  	  這種方式不推薦使用, 別人這樣寫能看懂就行.
 		
 */
public class ifTest {
	public static void main(String[] args) {
		
		//需求: 所在位置的五公里範圍之內有肯德基的話, 去KFC吃午飯
		//公里數
		//double n = 6.0; //單位 KM
		double n = 1.0;
		//判斷語句
		if( n < 5 ) {
			System.out.println("去KFC吃中餐!");
		}

		 /* 假設系統給一個考生成績,成績可能帶小數點,成績要求範圍是 [0~100]
		          根據學生的成績判斷該學生的成績等級:
				[90-100] A
				[80-90]  B
				[70-80]  C
				[60-70]  D
				[0-60]   E
		  以上的邏輯判斷用if語句完成,
		 */	
		
		/*
		//double g = 90.0;
		//double g = 85.0;
		//double g = 75.0;
		//double g = 65.0;
		//double g = 55.0;
		double g = 120;
		if( g >= 90.0 ) {
			System.out.println('A');
		}else if( g >= 80.0){
			System.out.println('B');
		}else if( g >= 70.0){
			System.out.println('C');
		}else if( g >= 60.0){
			System.out.println('D');
		}else{
			System.out.println('E');
		} */
	
		double s = 59.5;
		
		//使用以下這種方式可以完成需求,但是這種方式效率較低,每個if都是不相關的,獨立的
		//每個if都會判斷一次
		/*
		if() {
		
		}
		
		if() {
			
		}
		
		if() {
			
		} */
	
		//根據需求決定選擇以上的第四種結構來完成需求
		
		/*
		if( s < 0 || s > 100) {
			System.out.println("對不起, 成績範圍超出");
		}else if( s >= 90 && <= 100) { //沒必要判斷是否<=100, 能執行到這裡一定是<=100
			
		} */
		
		s = 60.0;
		s = 110.0;
		s = -100;
		s = 90;
		s = 100;
		s = 0;
		
		if( s < 0 || s > 100) {
			System.out.println("對不起, 成績範圍超出");
		}else if( s >= 90 ) { //能夠判斷到這裡說明成績一定是在[0~100]
			System.out.println("該學生成績等級是: A");
		}else if( s >= 80 ) { //能夠判斷到這裡說明成績一定小於90分
			System.out.println("該學生成績等級是: B");
		}else if( s >= 70 ) {
			System.out.println("該學生成績等級是: C");
		}else if( s >= 60)  {
			System.out.println("該學生成績等級是: D");
		}else {
			System.out.println("該學生成績等級是: E");
		}
		
		s = -100;
		s = 95.5;
		
		String gd = "該學生成績等級是: E";
		if( s < 0 || s > 100) {
			gd = "對不起, 成績範圍超出";
		}else if( s >= 90 ) {
			gd = "該學生成績等級是: A";
		}else if( s >= 80 ) {
			gd = "該學生成績等級是: B";
		}else if( s >= 70 ) {
			gd = "該學生成績等級是: C";
		}else if( s >= 60)  {
			gd = "該學生成績等級是: D";
		}
		System.out.println(gd);
	}
}