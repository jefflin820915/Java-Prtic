/*
 * 關於JAVA語言當中的char類型
 	轉義字符	\
 	轉義字符出現在特殊字符之前,會將特殊字符換成普通字符
 	
 	\n	換行符
 	\t	制表符
 	\'	普通單引號
 	\"	普通雙引號
 	\\	普通反斜槓
 */
public class DataTypeTest01 {
	public static void main(String[] args) {
		
		//普通的n字符
		char c1 = 'n';
		System.out.println(c1);
	
		//以下不是字符串,而是一個是字符
		//這是一個換行符, 屬於一個char類型數據
		//反斜槓在java語言當中具有轉義功能
		char c2 = '\n';
		
		/*System.out.println("HELLO");
		System.out.println("WORLD"); */
		
		//System.out.print和System.out.println區別: println輸出之後換行,  print表示輸出, 不換行
		
		/*System.out.print("HELLO");
		System.out.println("WORLD"); */
	
		System.out.print('A');
		System.out.print(c2);
		System.out.println('B');
		
		//普通的t字符
		char x = 't';
		System.out.println(x);
		
		//制表符TAB
		//制表符和空格不同, ASCII不一樣, 在鍵盤上按建不同
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");
	
		//要求控制台上輸出"反斜槓字符"
		//反斜槓將後面的單引號轉義成不具備特殊含義的普通單引號字符
		//左邊的單引號缺少了結束的單引號字符
		/*char k = '\';
		System.out.println(k); */
		
		/*第一個反斜槓具有轉義功能,將後面的反斜槓轉義為普通的反斜槓字符*/
		
		char k = '\\';
		System.out.println(k);
		
		//在控制台上輸出普通的單引號字符
		//第一個單引號跟第二個單引號配對,最後單引號找不到配對
		//char a = ''';
		//System.out.println(a);
		
		//反斜槓具有轉義功能,將第二個單引號轉換成普通的單引號
		//第一個單引號跟最後單引號配對
		char a = '\'';
		System.out.println(a);
	
		char f = '"';
		System.out.println(f);
		
		System.out.println("HelloWorld!");
		//錯誤
		//System.out.println(""HelloWorld!"");
		//糾正
		System.out.println("\"HelloWorld!\"");
	
		char m = '中';
		System.out.println(m);
	
		//JDK中自帶的nativ2ascii.exe命令,可以將文字轉換成unicode編碼形式
		
		char n = '\u4e2d'; //'中'對應的unicode的編碼  4e2d
		System.out.println(n);
		
		//char g = '4e2d'; 錯誤 		
		//char g = 'u4e2d'; 錯誤
		//反斜槓u合起來後面的一串數字是某個文字的unicode編碼
		char g = '\u4e2d';
		System.out.println(g);
		
		//g = '\u456a';
		//g = '\u256a';
		//g = '\u256b';
		g = '\u456b';
		System.out.println(g);
		
		System.out.println("============================");
		//char類型的默認值
		char c10 = '\u0000';
		System.out.println(c10);
		
		
		
		/*
		*十進制: 0 1 2 3 4 5 6 7 8 9 10 11 12 13...
		*二進制: 0 1 10 11 100 101...
		 *十六進制: 0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20...
		 *八進制: 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....		
		 */
	
	}
}
