/*
 * 當前以下程序不使用"方法", 分析存在哪些缺點
	以下代碼都是完成兩個int類型數據的和, 相同的代碼寫三遍.(只不過每次參與求和的數據不同)
	代碼都沒有得到重複使用.
	
	應該在java語言當中有種機制:
		某個功能代碼只需要寫一遍
		要使用這個功能, 只需要給這個功能傳遞具體的數據
		這個功能完成之後返回一個最終的結果
		這樣代碼就能重複利用,提高代碼復用性. [方法]
		
	使用這個方法我們稱為"調用/invoke"
*/
public class MethodTest {
	public static void main(String[] args) {
		
		//需求1 : 請編寫程序計算10和20的和 並將結果輸出 [功能: 計算兩個int類型數據的和]
		
		int a = 10;
		int b = 20;
		int c = a + b ;
		System.out.println(a + "+" + b + "=" + c);
		
		//需求2: 請計算666和888的和, 並將結果輸出 [功能: 計算兩個int類型數據的和]
		
		int x = 666;
		int y = 888;
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
		
		//需求3: 請計算111和222的和, 並將結果輸出 [功能: 計算兩個int類型數據的和]
		
		int m = 111;
		int n = 222;
		int e = m + n;
		System.out.println(m + "+" + n + "=" + e);
		
		//以上的三個需求其實就是一個需求 
		//需求是計算兩個int類型的和, 功能相同,
		//只不過每一次參與計算的具體數據不同.
		
	}
}
