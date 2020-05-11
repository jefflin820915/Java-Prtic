/*
 	*關於java當中整數型
 		數據類型		 佔用空間大小		默認值			取值範圍
 	-------------------------------------------------------------	
 		byte			1			 0			[-128 ~ 127]
 		short			2			 0			[-32768 ~ 32767]
 		int				4			 0			[-2147483648 ~ 2147483647]
 		long			8			 0L		

 		
java當中的"整數型字面值"被默認當作int類型來處理, 要讓這個"整數型字面值"被當做
long類型來處裡的話, 需要在"整數型字面值"後面添加l/L, 建義大寫L
java語言中的整數型字面值有三種表示方式:
	十進制: [是一種缺省默認的方式]
	八進制: [在編寫八進制字面值的時候需要以0開始]
	十六進制: [在編寫十六進制字面值的時候需要以0x開始]
 */
public class DataTypeTest02 {
	
	public static void main (String[] args) {
	
		int a = 10;
		int b = 010;
		int c = 0x10;
		
		System.out.println(a); //10
		System.out.println(b); //8
		System.out.println(c); //16
		System.out.println(a + b + c); //34
	
		//這個整數型字面值是int類型
		//i變數聲明的時候也是int類型
		//int類型的123賦值給int類型的變數i, 不存在類型轉換
		int i = 123;
		System.out.println(i);
		
		//456整數型字面值被當作int類型, 占用4個位元組
		//x變數在聲明的時候是long類型, 占用8個位元組
		//int類型的字面值456賦值給long類型的變數x , 存在類型轉換
		//int類型轉換成long類型
		//int類型是小容量
		//long類型是大容量
		//小容量可以自動轉換成大容量, 稱為自動類型轉換機制
		long x = 456;
		System.out.println(x);
		
		//2147483647是int類型, 占用4個位元組
		//y是long類型, 占用8個位元組, 自動類型轉換
		long y = 2147483647;
		System.out.println(y);
		
		//錯誤, 過大的整數
		//2147483648被當作int類型,4個位元組處裡, 但這個字面值超出int類型範圍
		//long z = 2147483648;
		
		//2147483648字面值一上來就當成long處理, 在字面值後面添加L
		//2147483648L是8個位元組的long類型
		//z是long類型的變數, 以下不存在類型轉換
		long z = 2147483648L;
		System.out.println(z);
	}
}
