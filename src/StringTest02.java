/*
	分析以下程序創建字符串對象的區別
 		1. String s1 = "abc"; 只會在字符串常數池中創建一個"abc"字符串對象
 		
 		2. String s2 = new Strinf("abc"); 會在字符串常數池中創建一個"hello"字符串對象, 並且會在堆中再創建一個對象
 		
 		第二種方式比較浪費內存, 常用的是第一種方式
 */
public class StringTest02 {

	public static void main(StringTest02[] args) {
		
		String s1 = "abc";
		String s2 = new String("abc");
	}
}
