/*
 	三元運算符/三目運算符/條件運算符
 		1. 語法規則:
 			布林表達式 ? 表達式1 : 表達式2
 		
 		2. 三元運算符的執行原理
 			當布林表達式的結果是true的時候, 選擇表達式1作為整個表達式的執行結果
 			當布林表達式的結果是false的時候, 選擇表達式2作為整個表達式的執行結果
 */
public class OperatorTest05 {
	public static void main(String[] args) {
		
		//錯誤, 不是一個完整的語句
		//10;
		
		//錯誤, 不是一個完整的語句
		//'男';
		
		//布林類型的變數
		boolean sex = false;
		
		//錯誤, 不是一個完整的語句
		//sex ? '男' : '女';
		
		char c = sex ? '男' : '女';
		System.out.println(c);
		
		sex = true;
		c = sex ? '男' : '女';
		System.out.println(c);
		
		//語法錯誤, 錯誤, 結果可能是String, 也可能是char, 但是前邊不能用char來接收數據.
		//char c1 = sex ? "男" : '女;
		
		//語法錯誤, 錯誤, 類型不兼容
		//sex = false;
		//char c1 = sex ? "男" : '女;
		
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');
		
		System.out.println(sex ? '男' : "女");
		
		String s = sex ? "男的" : "女的";
		System.out.println(s);
	}

}
