
public class FinalTest02 {
	
	//成員變數之實例變數
	//實例變數有默認值 + final修飾的變數一旦賦值不能重新賦值
	//綜合考慮, java語言最終規定實例變數使用final修飾之後必須手動賦值,不能採用系統默認值
	//final int age; //錯誤
	
	//第一種解決方案
	final int age = 10;
	
	//第二種解決方案
	final int num;
	
	public FinalTest02() {
		this.num = 200;
	}
	
	//以上兩種解決方案: 其實本質上是一種, 都是在構造方法執行過程中給實例變數賦值
	public static void main(String[] args) {
		final int a ;
		a = 100;
		
		//不可二次賦值
		//a = 200;
}
}
