
/*
 * 實現計算機當中的
 		+
 		-
 		*
 		/
 		%
 	實現思路
 		1. 選擇所有數據從鍵盤輸入
 		2. 使用switch語句進行判斷
 		3. 需要從控制台輸入三次:
 			第一個數字
 			運算符
 			第二個數字
 		
 		最終在控制台上是這樣場景:
 			歡迎使用簡單計算器系統:
 			請輸入第一個數字: 10
 			請輸入運算符: +,-,*,/,%
 			請輸入第二個數字: 20
 			運算結果: 10 + 20 = 30
 			
 */
public class switchTest03 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("請輸入第一個數字");
		int num1 = s.nextInt();
		System.out.println("請輸入運算符");
		String Opr = s.next();
		System.out.println("請輸入第二個數字");
		int num2 = s.nextInt();

		int result = 0;
		
		switch (Opr) {
		case "+" :
			result = num1 + num2;
			//System.out.println(num1 + num2 );
			break;
		
		case "-" :
			result = num1 - num2;
			//System.out.println(num1 - num2);
			break;
		
		case "*" :
			result = num1 * num2;
			//System.out.println(num1 * num2);
			break;
		
		case "/" :
			result = num1 / num2;
			//System.out.println(num1 / num2);
			break;
		
		case "%" :
			result = num1 % num2;
			//System.out.println(num1 % num2);
			break;
		
		default :
			System.err.println("無法確認");
		}
		System.out.println("運算結果為: " + num1 + Opr + num2 + " = " + result);
		
		
		
	}
}
