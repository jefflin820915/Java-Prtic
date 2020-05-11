/*
	關於浮點型數據類型:
		float 單精度 [ 4個位元組]
		double 雙精度 [ 8個位元組, 精度較高]
double精度太低[相對起來], 不適合做財務軟體, 財務涉及到錢, 要求精度高, 所以在SE類庫中準備了精度更高的類型
 只不過它是引用數據類型, 不屬於基本數據類型, :   java.math.BigDecimal

 SE類庫字節碼:  C:\JDK\jre\lib\rt.jar 
 SE類庫源碼:  C:\JDK\src.zip

 	ex: String.java和String.class
 	(String[] args)中的String使用的是String.class字節碼文件
 在java中所有浮點型字面值[3.0] , 默認被當做double類型來處理,
 要想該字面值當做float類型來處理, 需要在字面值後面添加F/f 
 
 double和float在計算機內部二進制存儲的時候都是近似值
 在現實當中有些數字是無限循環的, ex: 3.33333333333333333333...
 計算機的資源有限, 用有限的資源存儲無限的數據只能存儲近似值
 */
public class DataTypeTest04 {
	public static void main(String[] args) {
		
		//3.0是double類型的字面值
		//d是double類型的變數
		//不存在類型轉換
		double d = 3.0;
		System.out.println(d);
		
		
		//5.1是double類型的字面值
		//f是float類型的變數
		//大容量轉小容量需要加強制類型轉換符
		//float f = 5.1;
		
		//解決:
		//強制類型轉換
		//float f = (float)5.1;
		
		//沒有類型轉換
		//float f = 5.1f;
				
	}
}
