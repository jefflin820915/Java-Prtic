/*
 * 變數:
 	在方法體當中的代碼, 是遵守自由上而下的順序依次執行, 逐行執行
 		第一行;
 		第二行;
 		第三行;
 		特點: 第二行的代碼必須完整結束後,第三行才會執行
 	在同一個"作用域"當中, 變數名不能同名, 但變數可以重新賦值
 */
public class VariableTest01 {
public static void main (String[] args) {

	int i = 100;
	System.out.println(i); //100
	
	i = 200;

	System.out.println(i); //200

/*	以下代碼報錯, 順序錯誤, 先聲明然後賦值再訪問
	 System.out.println(k); 
	 
	 int k = 100;  */
	
/*	int i = 90;
	System.out.println(i); */
}
}
