/*
 關於switch語句:
 	1. switch語句也屬於選擇結構, 也是分支語句
 	2. switch語句的語法結構:
 		一個比較完整的switch語句應該這樣編寫:
 			switch(int或String類型的字面值或變數){
 				case int或String類型的字面值或變數 :
 					java語句;
 					.....
 					break;
 				case int或String類型的字面值或變數 :
 					java語句;
 					.....
 					break;
 				case int或String類型的字面值或變數 :
 					java語句;
 					.....
 					break;
 				case int或String類型的字面值或變數 :
 					java語句;
 					.....
 					break;
 				.....
 				default :
 					java語句;
 					......
 			}
 	3. switch語句的執行原理:
 		switch後面的小括號當中的"數據"和case後面的"數據"進行一一匹配, 匹配成功的分支執行.
 		怎麼匹配?
 		按照自上而下的順序依次匹配.
 	
 	4. 匹配成功的分支執行, 分支當中最後有"break"語句的話, 整個switch語句終止
    
    5. 匹配成功的分支執行, 分支當中最後沒有"break"語句的話, 直接進行下一個分支執行(不進行匹配), 
    	這個現象稱為case穿透現象.[提供break;語句可以避免穿透]
    	
    6. 所有分支都沒有匹配成功, 當有default的語句, 會執行default分支當中的程序.
    
    7. switch後面和case後面只能是int或者String類型的數據, 不能是其他類型.
    	當然byte, short, char,也可以直接寫到switch和case後面, 因為它們可以進行自動類型轉換.
    	
    	byte,short,char可以自動類型轉換成int類型.
    	
    	JDK6的話, switch和case後面只能探測int類型.
    	
    	JDK7之後包括7版本在內, 引入新特性, switch關鍵字和case關鍵字後面可以探測int或String類型數據
    	
    8. case可以合併:
    	int i = 10
    	switch(i){
    	case 1: case 2: case 3: case 10:
    	 	system.out.println("Test code");
    	}
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		/*
		 long a = 10L;
		 int b = a; //錯誤
		 */
		
		/*
		long x = 10L;
			switch (x) {} */ //錯誤
		
		//解決錯誤
		long x = 100L;
		switch ((int)x) {}
	
		byte b = 10;
		switch(b) {}
		
		short t = 10;
		switch(t) {}
		
		char c ='A';
		switch(c) {}
		
		char n = 97;
		switch(n) {}
		
	  //switch(true) {} 錯誤
		
		String username = "tzuen";
		switch(username) {}
		
		/*
		switch較完整的語句
		*/
		//接收用戶的輸入:
		//1 表示星期一
		//2 表示星期二
		//....
		//7 表示星期日
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("請輸入數字: ");
		int num = s.nextInt();
		switch(num) {
			case 1:
				System.out.println("星期一");
			break;
			case 2:
				System.out.println("星期二");
			break;
			case 3:
				System.out.println("星期三");
			break;
			case 4:
				System.out.println("星期四");
			break;
			case 5:
				System.out.println("星期五");
			break;
			case 6:
				System.out.println("星期六");
			break;
			case 7:
				System.out.println("星期日");
			break;
		
			default :
				System.out.println("無法確認");
		}
		
		System.out.println("-------------------------------------------------");
		
		//case穿透現象
		switch(num) {
		case 1:
			System.out.println("星期一");
		case 2:
			System.out.println("星期二");
		case 3:
			System.out.println("星期三");
		break;
		case 4:
			System.out.println("星期四");
		break;
		case 5:
			System.out.println("星期五");
		break;
		case 6:
			System.out.println("星期六");
		break;
		case 7:
			System.out.println("星期日");
		break;
	
		default :
			System.out.println("無法確認");
	
		}
		
		System.out.println("-------------------------------------------------");
		
		//case穿透現象
		switch(num) {
		case 1:
			System.out.println("星期一");
		case 2:
			System.out.println("星期二");
		case 3:
			System.out.println("星期三");
		case 4:
			System.out.println("星期四");
		case 5:
			System.out.println("星期五");
		case 6:
			System.out.println("星期六");
		case 7:
			System.out.println("星期日");
		default :
			System.out.println("無法確認");
		}
		System.out.println("-------------------------------------------------");
		
		//case合併
		switch(num) {
		case 1: case 0:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default :
			System.out.println("無法確認");
		}
		
	}
}
