import java.math.BigDecimal;

/*
	java.math.BigDecimal
		該類型的數據精確度極高適合做財務軟體.
		
		財務軟體中double類型精確度太低
 */
public class NumberTest02 {

	public static void main(String[] args) {
		
		//創建大數據
		BigDecimal v1 = new BigDecimal(10);
		BigDecimal v2 = new BigDecimal(20);
		
		//做加法運算
		//v1,v2//錯誤:兩個引用類型不能做加法運算
		
		//必須調用方法執行加法運算
		BigDecimal v3 = v1.add(v2);		
		
		System.out.println(v3); //30
	
	}
}
