/*
 關於基本數據類型之間的互相轉換:  轉換規則
 	1. 八種數據類型中除了布林類型之外剩下的7種類型之間都可以互相轉換
 	
 	2. 小容量向大容量轉換, 稱為自動類型轉換 , 容量從小到大排序:
 		byte < short < int < long < float < double < char < 
 		任何浮點類型不管佔用多少位元組, 都比整數型還要大.
 		char和short可表示的種類數量相同, 但char可以取更大的正整數
 	
 	3. 大容量轉換成小容量, 稱為強制類型轉換, 需加強制類型轉換符.
 	
 	4. 當整數字面值沒有超出byte,short,char的取值範圍, 可以直接賦值給byte,short,char類型的變數
 	
 	5. byte,short,char混合運算時,各自先轉換成int類型再計算.
 	
 	6. 多種數據類型混合運算, 先轉換成容量最大的類型再做運算
 	
 */
public class DataTypeTest06 {
	public static void main(String[] args) {
		
	//錯誤, 1000超出byte範圍
	//byte a = 1000;
	
	//正確,20沒有超出byte範圍
	//所以賦值
	byte a = 20;
	
	//變數不能重名
	//short a = 1000;
	
	//正確, 未超出short範圍
	//所以賦值
	short b = 1000;
	
	//正確, 因默認是int, 並且未超出int範圍
	int c = 1000;
	
	//正確, 可以自動轉換, 小容量轉換大容量
	long d = c;
	
	//錯誤, 大類型轉小類型會有問題
	//int e = d;
	
	//將long強制轉換int類型
	//因為值1000, 沒有超出int範圍, 所以轉換正確
	int e = (int)d;
	
	//因java中的運算會轉成最大類型
	//而10和3默認為int, 所以運算後的最大類型也是int
	//所以正確
	int f = 10/3; //3
	
	//聲明10為long類型
	long g = 10;
	
	//錯誤, 多個數值在運算過程中,會轉換最大類型
	//以下最大類型為double, 而h為int, 所以會出現最大類型(long)到小類型(int)
	//int h = g/3;
	
	//可以強制轉換, 因為結果沒有超出int範圍
	//int h = (int)g/3;
	
	//可以採用long類型來接收運算結果
	//long h = g/3;
	
	//將g轉成int, 然後將int類型的g轉換成byte, 最後byte類型的g和3運算
	//它的類型轉換成int, 所以int類型賦值給byte會有問題
	//byte h = (byte)(int)g/3;
	
	//正確
	//byte h = (byte)(int)(g/3);
	
	//不能轉換,有優先度的問題
	//byte h = (byte)g/3;
	
	//可以轉換, 因為結果沒有超出byte範圍
	//byte h = (byte)(g/3);
	
	//可以轉換, 沒有超出short範圍
	//short h = (short)(g/3);
	
	short i = 10;
	short j = 5;
	//錯誤, short和byte運算,首先會轉成int類型再運算
	//所以結果為int, int賦值給short會錯誤
	//short k = i + j;
	
	//可以將運算強制轉換為short
	//short k = (short)(i + j);
	
	//因為運算結果為int, 所以可以採用int類型接收
	int k = i + j;
	char l = 'a';
	System.out.println(l); //a
	//輸出為97, a的ascii值
	System.out.println((byte)l); //97
	int m = l + 100;
	//輸出為197, a的ascii值加上100
	System.out.println(m); //197
	}
}
