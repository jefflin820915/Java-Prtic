/*
 	關於java中的"+"運算符
 		1. "+"運算符有兩個作用:
 				加法運算, 求和
 				字符串的連接運算
 			
 		2. 當"+"運算符兩邊都是數字的話, 一定是進行加法運算.
 		
 		3. 當"+"運算符,只要兩邊的數據只要有一個數據是字符串,一定會進行字符串連接運算.
 		並且,連接運算之後的結果還是一個字符串類型.
 		
 		數字 + 數字 ---> 數字 [ 求和 ]
 		數字 + "字符串" ---> "字符串" [字符串連接]
 		
 		4. 在一個表達式當中可以出現多個"+", 在沒有添加小括號的前提之下, 遵循自左向右的順序.
 */
public class OperatorTest04 {
	public static void main(String[] args) {
		
		System.out.println(10 + 20); // 30	這裡的加號是求和 
		System.out.println(10 + 20 + 30); // 60	這裡的加號也是求和 
		System.out.println(10 + 20 + "30"); // "3030"  自左向右依次運算, 第一個加號是求和, 第二個加號是字符串連接
		System.out.println(10 + (20 + "30")); //"102030"
		int a = 10;
		int b = 20;
		
		//要求在控制台上輸出"10 + 20 = 30"
		System.out.println("10 + 20 = 30");
		
		//要求以動態的方式輸出
		System.out.println("10 + 20 = " + a + b); // "10 + 20 = 1020"
		
		System.out.println("10 + 20 = " + (a + b));
		
		System.out.println("a + 20 = " + (a + b));
		
		System.out.println(a + " + 20 = " + (a + b));
		
		System.out.println(a + " + b = " + (a + b));
		
		System.out.println(a + " + "+ b + " = " + (a + b));
		
		a = 100;
		b = 200;
		
		System.out.println(a + " + "+ b + " = " + (a + b));
		
		//引用類型String
		//String是SUN在java當中提供的字符串類型
		//String.class文件
		//int是基本數據類型, i是變數名, 10是int類型的字面值
		int i = 10;
		
		//String是引用數據類型, s是變數名, "abc"String類型的字面值
		String s = "abc";
		
		//錯誤,類型不兼容
		//String ss = 10;
		
		//定義一個String類型的變數, 起名username, 賦值 "tzuen"
		String username = "tzuen";
		System.out.println("登入成功, 歡迎username回來");
		
		System.out.println("登入成功, 歡迎" + "回來");
		
		System.out.println("登入成功, 歡迎" + username + "回來");
		
		username = "Lin";
		
		System.out.println("登入成功, 歡迎" + username + "回來");
}

}
