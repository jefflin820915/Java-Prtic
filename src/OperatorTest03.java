import javax.management.BadAttributeValueExpException;

/*
 關於java中的賦值類運算符:
 	賦值類運算符包括兩種:
 		基本的賦值運算符
 		=
 		
 		擴展的賦值運算符
 		+=
 		-=
 		*=
 		/=
 		%=
 	賦值類的運算符優先級: 先執行等號右邊的表達式,將執行結果賦值給左邊的變數
 	
 	注意以下代碼:
 		byte i = 10;
 		i += 5; 等同於: i = (byte)(i + 5);
 		
 		int k = 10;
 		k += 5; 等同於: k = (int)(k + 5);
 		
 		long x = 10L;
 		int y = 20;
 		y += x; 等同於: y = (int)(y + x);
 
 		結論: 擴展類的賦值運算符不改變運算結果類型,假設最初這個變數的類型是byte類型,
 			無論怎麼進行追加或追減,最終該變數的數據類型還是byte類型
 */
public class OperatorTest03 {
	public static void main(String[] args) {
		
		//基本的賦值運算符
		int i = 10;
		
		System.out.println(i); //10
		
		i = i + 5;
		
		System.out.println(i); //15
		
		//擴展的賦值運算符 [+= 運算符可以翻譯成"追加/累加"]
		i += 5; //等同於: i = i + 5; 
		
		System.out.println(i); //20
		
		i -= 5; //等同於: i = i - 5;
		
		System.out.println(i); //15
		
		i *= 2; //等同於: i = i * 2;
		
		System.out.println(i); //30
		
		i /= 4; //等同於: i = i / 4;
		
		System.out.println(i); //7
		
		i %= 2; //等同於: i = i % 2;
		
		System.out.println(i); //1
		
		//---------------------------------------
		//10沒有超出byte取值範圍可以直接賦值
		byte b = 10;
		
		//b = 15; 可以,15沒有超出byte取值範圍
		
		//編譯器只檢查語法,不運行程序,編譯器發現b+5的類型是int類型,而b變數的數據類型是byte
		//大容量向小容量轉換需要加強制類型轉換符,所以以下錯誤
		//b = b + 5;
		
		b = (byte)(b + 5);
		
		System.out.println(b);
		
		byte x = 10;
		x += 5; //等同於: x = (byte)(x + 5); 其實並不等同於: x = x + 5;
		System.out.println(x);
		
		byte z = 0;
		x += 128; // z = (byte)(z + 128);
		System.out.println(z); //-128 [損失精度]
		
		z += 10000; // 等同於: z = (byte)(z + 10000);
		System.out.println(z); //-112
		

}
}
