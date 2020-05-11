/*
 關係運算符
 	>	大於
 	>=	大於等於
 	<	小於
 	<=	小於等於
 	==	等於
 	!=	不等於
 	
 	= 是賦值運算符
 	== 是關係運算符
 	
 	關係運算符的運算結果一定是布林類型:  true/false
 	
	關係運算符的運算原理:
		int a = 10;
		int b = 10;
		a > b 比較的時候, 比較的是a中保存的10和b中保存的10這個值之間的大小比較
		a == b 也是.
 */
public class OperatorTest01 {
	public static void main (String[] args) {
		
		int a = 10;
		int b = 10;
		System.out.println(a > b); //fasle
		System.out.println(a >= b); //true
		System.out.println(a < b);	//fasle
		System.out.println(a <= b);	//true
		System.out.println(a == b); //true
		System.out.println(a != b); //fasle
		
	}

}
