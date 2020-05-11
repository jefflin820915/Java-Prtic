/*
 * 關於main方法中的參數列表String[] args
 * 
 * 1. String[] args是專門用來接收命令行參數的
 * 
 * 2. 例如: java ArrayTest07 abc def aaa 
 * 	JVM在調用ArrayTest07這個類的main方法之前, 先 "abc def aaa"這個字符串以"空格"的方式分割, 然後存儲在String數組中
 */
public class ArrayTest07 {
	
	//main方法中的String[]數組的設計主要是用來接收命令行參數的
	public static void main(String[] args) {
		
		/*
		System.out.println("String類型中的數組元素個數是" + args.length);
	
		//編歷
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		//需求說明: 運行該軟件的時候必須提供用戶名和密碼.
		//格式: java ArrayTest07 username password
		//如果用戶沒有提供足夠的參數則退出系統
		if(args.length != 2) {
			System.out.println("要想使用該系統,必須這樣輸入: java ArrayTest07 username password");
			return;
		}
		//參數提供正確, 如果用戶名是admin, 密碼是123則登入成功
		String username = args[0];
		String password = args[1];
		
		//java中比較字符串是否相等, 必須使用equals方法.
		//String類型是SUN提供的, 已經equals重寫了, 比較的是內容.
		if("admin".equals(username) && "123".equals(password)) { //這種方式可以避免空指針異常
		//if(username.equals("admin") && password.equals("123")) {
			System.out.println("登入成功, 歡迎["+username+"]回來");
		}else {
			System.out.println("登入失敗, 用戶名["+username+"]不存在或密碼錯誤");
		}
	
	
	
	}
}
