/*
 * 關於字面值
 	- 10, 100
 	- 3.14
 	- "abc"
 	- 'a'
 	- true, false
 *字面值就是數據
*字面值是java源程序的組成之一, 包括標籤符和關鍵字它們都是java源程序的組成部分
*數據在現實世界當中是分明別類的, 所以數據在計算技編程語言當中也是有類型的 
	- 10, 100 		屬於整數型字面值
	- 3.14  		屬於浮點型字面值
	-  true, false  屬於布林型字面值
	- "abc", "你好嗎"        屬於字符串型字面值
	- 'A', '人' 		屬於字符型字面值
*字符串型字面值需使用雙引號括起來, 半角雙引號
*字符型字面值需使用單引號括起來, 半角單引號
*/
public class CountTest01 {
	public static void main(String[] args) {
		System.out.println("abc");
		System.out.println("你在哪裡");
		System.out.println(10);
		System.out.println(100);
		System.out.println(true);
		System.out.println(false);
		System.out.println('A');
		System.out.println(3.14);
	}
}