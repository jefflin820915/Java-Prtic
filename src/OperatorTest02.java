/*
 邏輯運算符 (布林運算符)
 	&	邏輯與	[並且] 		(兩邊的算式都是true, 結果才是true)
 	|	邏輯或	[或者]		(兩邊的算式只要有一個是true, 結果就是true)
 	!	邏輯非				(取反, !false就是true, !true就是false, 單目運算符)
 	^	邏輯異或				(兩邊的算式只要不一樣, 結果就是true)
 	
 	&&	短路與
 	||	短路或
 
  1. 邏輯運算符要求兩邊的算式都是布林類型, 並且邏輯運算符最終的運算結果也是個布林類型.
  2. 短路與跟邏輯與最終的運算結果是相同, 只不過短路與存在短路現象.
  3. 短路或跟邏輯或最終的運算結果是相同, 只不過短路或存在短路現象.
  4. 甚麼情況下發生短路
  5. 甚麼時候選擇使用邏輯運算符, 甚麼時候使用短路與運算符
 */
public class OperatorTest02 {
	public static void main(String[] args) {
		
		//運算符優先級不確定, 加小括號
		System.out.println(5 > 3 & 5 > 2); //true
		System.out.println(5 > 3 & 5 > 6); 	//false
		System.out.println(5 > 3 | 5 > 6); //true
		
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		System.out.println(true | false); //true
		System.out.println(false | false); //false
		
		System.out.println(!false); //true
 		System.out.println(!true); //false
 		
 		System.out.println(true ^ false); //true
 		System.out.println(false ^ false); //false
 		System.out.println(true ^ true); //false
		
 		//邏輯與跟短路與
 		int x = 10;
 		int y = 8;
 		
 		/*//邏輯與
 		System.out.println(x < y & ++x < y);
 		System.out.println(x); //11 */
 		
 		//短路與
 		//x < y結果是false, 整個表達式結果已確定是false
 		//所以後面的表達式沒有再執行, 這種現象被稱為短路現象
 		//短路與才會有短路現象, 邏輯與是不會存在短路現象的
 		System.out.println(x < y && ++x < y); 
 		System.out.println(x); //10
 		
 		/*從某角度來看短路與較智能. 由於後面的表達式可能不執行.
 		     所以執行效率較高這種方式開發中使用較多,短路與更常用
 		      但是特殊業務邏輯當中, 要求兩邊運算式需全部執行, 
 		      此時必須使用邏輯與,不能使用短路與, 使用短路與可能導致右邊表達式不執行 
 		*/
 		
 		/*
 		  甚麼情況發生短路或
 		  		第一個表達式執行結果是true, 會發生短路或
 		 
 		  甚麼情況發生短路與
 		  		第一個表達式執行結果是false, 會發生短路與
 		*/
	}

}
