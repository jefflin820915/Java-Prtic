// 我們定義的類MethodTest2_01, 字體顏色黑色, 是標幟符.
//其實JAVESE類庫中自帶的類, 例如: String.class, system.class, 這些類的類名也是標幟符
//只要是類名就一定是標幟符

//方法調用的時候, 在參數傳遞的時候, 實際上傳遞的是變數中保存的那個值
public class MethodTest2_01 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int retValue = sumInt(a,b);
		System.out.println(retValue);
	}

		public static int sumInt(int i, int j) {
			int result = i + j;
			int num = 3;
			int reValue = divide(result,num);
			return reValue;
		}

		
		public static int divide(int x, int y) {
			int z = x / y;
			return z;
}
}
/*
	劃圖依據
	1. 只要是涉及到參數傳遞的問題, 傳遞的是變數中保存的值
	2. 畫圖的時候, 必須遵循方法自上而下的順序依次執行這個原則 
*/