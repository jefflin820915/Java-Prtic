/*
  以下直接使用方法這種機制, 分析程序的優點
  	代碼得到了重複使用.
  	
  	方法的本質?
  	
  		方法就是一段代碼片段, 並且這段代碼片段可以完成某個特定的功能, 並且可以被重複的使用
	
	方法, 對應的英文單詞: Method
	方法在C語言中叫做函數/Function
	
	方法定義在類體當中, 在一個類當中可以定義多個方法, 方法編寫的位置沒有先後順序, 可以隨意
	
	方法體當中不能再定義方法!!!!!!!
	
	方法體由java語句構成 方法體中的代碼遵守自上而下的順序依序依次執行
*/
public class MethodTest01 {
	
		//類體
	
	public static void main(String[] args) {
	
		MethodTest01.sumInt(10, 20);
		
		MethodTest01.sumInt(666, 888);
		
		MethodTest01.sumInt(111, 222);	
	}
	//方法
	//單獨定義一個方法
	//該方法玩成計算兩個int類型數據的和, 並且將結果輸出

	public static void sumInt(int a,int b) {
		int c = a+ b;
		System.out.println(a+"+"+b+"="+c);

}
}