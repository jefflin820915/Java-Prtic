/*
 * 關於java中的整數型
	byte
	short
	int
	long
	
 */
public class DataTypeTest03 {
	public static void main(String[] args) {
	
		//100L是long類型字面值
		//x是long類型變數
		//不存在的類型轉換, 直接賦值
		long x = 100L;
		
		//x變數是long類型, 8個位元組
		//y變數是int類型, 4個位元組
		//錯誤, 大容量不能直接賦值給小容量
		//int y = x;
	
		//大容量轉換成小容量, 需要進行強制類型轉換
		//強制類型轉換需要加"強制類型轉換符"
		//加上強制類型轉換符之後pass了, 但是運行階段可能損失精度
		//強轉原理:
		//原始數據: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 01100100
		//強轉之後的數據: 00000000 00000000 00000000 01100100
		//將左邊的二進制砍掉[所有的數據強轉的時候都是這樣完成]
		int y = (int)x;
		System.out.println(y);
		
		
		//原始數據: 00000000 00000000 00000000 00000000 10000000 00000000 00000000 00000000
		//強轉之後的數據: 10000000 00000000 00000000 00000000  //
		//10000000 00000000 00000000 00000000 目前存在計算機內部, 計算季存儲數據都採用補碼形式存儲
		//10000000 00000000 00000000 00000000 現在是個補碼形式
		//將以上的補碼轉換回去原碼
		long k = 2147483648L;
		int e = (int)k;
		System.out.println(e); //負數
		
		//分析一下程序是否可以通過
		//大容量轉小容量需添加強制類型轉換符
		//在實際的時候會通過, 在java當中當一個整數型字面值
		//沒有超出byte類型取值範圍. 該字面值可以直接賦值給byte類型的變數
		byte b = 50; //可以
		
		byte c= 127; //可以
		
		//錯誤, 128這個int類型的字面值已超出byte取值範圍, 不能直接賦值給byte類型的變數.
		//byte b1 = 128; //錯誤
		
		//需要使用強制類型轉換符
		//一定會損失精度
		//原始數據: 00000000 00000000 00000000 10000000
		//強轉後: 10000000
		byte b1 = (byte)128; //-128
		System.out.println(b1);
	
		//補碼: 10000000
		//減1
		//011111111
		//反碼: 10000000 128
		
		//原碼: -128
		
		/* 計算機二進制有三種表示形式:
			原碼
			補碼
			反碼
		計算機在任何情況下底層表示和存儲數據的時候採用補碼形式
		正數的補碼: 和原碼相同
		負數的補碼: 負數的絕對值對應的二進制碼, 所有二進制位取反, 再加1
		
		補碼: 10000000
		原碼計算過程: 
			10000000 -1  ---> 01111111
			10000000 --> 128
			-128
			*/
		
		//原始數據: 00000000 00000000 00000000 11000110
		//強制類型轉換之後: 11000110
		//11000110現在在計算機存儲, 是個補碼, 將補碼轉換原碼
		//11000110 -1 --> 11000101
		//00111010 [ 2 + 8 + 16 +32] --> 58
		byte m = (byte)198;
		System.out.println(m); //-58
		
		//short s = 32767;  通過
		//short s1 = 32768;  錯誤
	
		//65535是int類型, 4個位元組
		//cc是char類型, 2個位元組
		char cc = 65535;
		//cc = 65536;
	
	/*當一個整數字面值沒有超出byte, short, char的取值範圍, 這個字面值可以直接賦值給byte,short,char類型的變數
	*/

	}
}