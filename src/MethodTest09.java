/*
 	在返回值類型是void的方法當中使用"return;"語句
 	"return"語句出現在返回值void的方法當中主要是為了終止當前方法.
 */
public class MethodTest09 {
	public static void main(String[] args) {
		m();
		
		for(int i =10; i>0; i--) {
			if(i == 2) {
				return;
			}
			System.out.println("date --> " + i);
		}
		System.out.println("Execute Here");
		}

	//錯誤, 對於類型為空的方法, 無法返回值
	/*
	public static void m() {
		return 10;
	}
	*/
	
	/*public static void m() {
		return;
	}*/
	
	public static void m() {
		for(int i = 0; i<10; i++) {
			if(i ==5) {
				return; //不是終止for循環, 終止的是m方法
				//break; //終止for循環
			}
			System.out.println("i -->" + i);
		}
		System.out.println("Hello World");
	
	}


}
