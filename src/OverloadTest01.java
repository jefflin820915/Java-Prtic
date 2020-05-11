/*	
	以下方法不使用方法重載機制, 不使用overload, 分析缺點在哪?
 		1. sumInt, sumDouble, sumLong功能不同但是功能相似, 都是求和
 		在以下程序當中功能相似的方法,分別起了三個不同的名字, 這對於程序員來說, 
 		調用方法不相變, 程序員需要記憶更多的方法, 才能完成調用.
 		
 		2. 代碼不美觀.
 		
 */
public class OverloadTest01 {
	
	//入口
	public static void main(String[] args) {
		
		//調用方法
		int result = sumInt(1, 2);
		System.out.println(result);
		double result2 = sumDouble(1.0, 2.0);
		System.out.println(result2);
		long result3 = sumLong(1L, 2L);
		System.out.println(result3);

	
}



//定義一個方法,可以計算兩個int類型的和
	public static int sumInt(int a, int b) {
		return a + b;
	}
//定義一個方法,可以計算兩個double類型的和
	public static double sumDouble(double a, double b) {
		return a + b;
	}
//定義一個方法,可以計算兩個long類型的和
	public static long sumLong(long a, long b) {
		return a + b;
	}
//得到效果:程序員在使用上面三個相似的方法的時候, 就像在使用一個方法一樣
//java支持, 有些語言不支持: javascrpit
}
