/*
 	深入return語句
 		帶有return關鍵字的java語句只要執行, 所在的方法執行結束.
 		
 		在"同一個作用域"當中, return語句下面不能編寫任何代碼, 因為這些代碼永遠執行不到, 所以報錯.
 		
 		
 */
public class MethodTest08 {
	public static void main(String[] args) {
		/*
		int retValue = m();
		System.out.println(retValue);
		*/
		
		//錯誤, 調用方法, 方法名後面有括號.
		//System.out.println(m);
		
		System.out.println(m());
	
	}
	
	/*報錯, 缺少返回語句, 以下程序編譯器認為
	//無法百分百的保證return 1;會執行
	public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
		}
	}*/

	//以下程序可以保證return 1; 或 return 0; 執行
	/*public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
		}else {
			return 0;
		}
		
	}		
	
	//和上方相同	
	public static int m() {
			int a = 10;
			if(a>3) {
				return 1;
			}
				return 0;
	
	}*/


	/*public static int m() {
		int a = 10;
		if(a>3) {
			return 1;
			//這裡不能編寫代碼, 報錯, 因為無法訪問語句
			//System.out.println("Hello");
		}
		//這裡的代碼可以執行到
		System.out.println("Hello");
		return 0;
		//這裡不能編寫代碼, 報錯, 因為無法訪問語句
		//System.out.println("Hello");

}*/

	public static int m() {
		//return 10 > 3 ? 1 : 0 ;
		return 2 > 3 ? 1 : 0 ;

}
}