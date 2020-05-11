/*
關於java中運算符之: 算數運算符
	+	求和
	-	相減
	*	乘積
	/	商
	%	求餘數 [取模]
	
	++	自加1
	--	自減1
	
	一個表達式當中有多個運算符, 運算符有優先級, 不確定的加小括號, 優先級得到提升
	沒有必要去專門記憶優先級.
 */
public class OperatorTest {
	public static void main (String[] args) {
		
		int i = 10;
		int j = 3;
		System.out.println(i + j); //13
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3
		System.out.println(i % j); //1
		
		
		//關於++運算符[自加1]
		int k = 10;
		
		//++運算符可以出現在變數後面[單目運算符]
		k ++;
		System.out.println(k); //11
		
		int y = 10;
		
		//++運算符可以出現在變數前面[單目運算符]
		++ y;
		System.out.println(y); //11
		
		//++運算符可以出現在變數前後,無論是前後
		//只要++運算結束,該變數中的值會自加1
		
		//++ 出現在變數後
		//先做賦值運算,再對變數中的保存的值加1
		int a = 100;
		int b = a ++;
		System.out.println(a); //101
		System.out.println(b); //100
		
		//++ 出現在變數之前
		//先進行自加1運算, 再進行賦值操作
		int m = 20;
		int n = ++ m;
		System.out.println(m); //21
		System.out.println(n); //21
		
		
		int xx = 500;
		System.out.println(xx);
		
		int e = 100;
		System.out.println(e ++); //100
		System.out.println(e); //101
		
		int s = 100;
		System.out.println(++ s); //101
		System.out.println(s); //101
		
		System.out.println(--s); //100
		System.out.println(s++); //100
		System.out.println(s--); //101
		System.out.println(s--); //100
		System.out.println(s--); //99
		System.out.println(s); //98
}

}


/*
class A {

	public void m(int x){

}

	main{
		int i = 10;
		m(i);
	}
}
*/