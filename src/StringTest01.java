/*
 * java.lang.String是字符串類型
 * 	1. 字符串一旦創建,不可在改變. "abc"字符串一旦創建, 不可在改變成"abcd"
 * 	
 * 	2. 提升字符串的訪問效率,在程序中使用了"緩存"技術. 所以在java中所有"雙引號"括起來
 * 	的字符串都會在"字符串常數池"中創建一份, 字符串常數池在方法區中被存儲
 * 	
 * 	3. 在程序執行過程中, 如果程序用到某個字符串, 例如"abc", 那麼程序會在字符串常數池
 * 	中去搜索該字符串, 如果沒有找到則在字符串常數池中新建一個"abc"字符串, 如果找到就直接
 * 	拿來用 .(字符串常數池是一個緩存區, 為了提高訪問字符串的效率)
 */
public class StringTest01 {
	
	public static void main(StringTest01[] args) {
		
		//創建一個"abc"字符串對象, 該對象的內存地址, 讓s1變數保存
		//s1是一個引用, s1指向"abc"對象
		String s1 = "abc";
		
		//可以讓s1重新指向  s1是局部變數,s1前邊沒有final, 所以可以重新指向.
		//但是"def"字符串不可變
		s1 = "def";
		
		String s2 = "HELLO"; //在字符串常數池中新建一個"HELLO"字符串對象, 該對象不可變
		String s3 = "HELLO"; //從字符串常數池中直接拿來用
	
		System.out.println(s2==s3); //true
		
		//比較兩個字符是否相等, 不能用"=="
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		System.out.println(s4==s5); //false
		
		//比較兩個字符串是否一致, 必須使用String類提供的equals方法.
		System.out.println(s4.equals(s5)); //true
		
		//已下程序結束之後會在字符串常數池中創建3個字符串對象 
		//"aaa" "bbb" "aaabbb"
		String s6 = "aaa";
		String s7 = "bbb";
		String s8 = s6 + s7;
	
	
	
	}
}
