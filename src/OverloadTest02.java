/*
  方法重載體驗
*/

public class OverloadTest02 {
	public static void main(String[] args) {
		
	//調用方法就像使用一個方法一樣
	//參數的類型不同, 對應調用的方法不同, 
	//此時區分方法不再依靠方法名, 依靠的是參數的數據類型
		System.out.println(sum(1, 2)); 
		System.out.println(sum(1.0, 2.0)); 
		System.out.println(sum(1L, 2L));
		
	
	}
	//以下三個方法構成方法重載機制
	public static int sum(int a, int b){
		System.out.println("sum(int, int)" );
		return a+b;	
	}
	public static long sum(long a, long b){
		System.out.println("sum(long, long)" );
		return a+b;
	}
	public static double sum(double a, double b){
		System.out.println("sum(double, double)" );
		return a+b;
	}


}
