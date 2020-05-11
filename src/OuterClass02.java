
/*
 * 關於成員內部類
 * 	
 * 	1. 成員內部類可以等同看做成員變數
 * 	
 * 	2.成員內部類中不能有靜態聲明
 * 
 * 	3.成員內部類可以訪問外部類所有數據
 *  
 * 	
 */
public class OuterClass02 {
		
	//靜態變數
	static String s1 = "A";
	
	//成員變數
	private String s2 = "B";
	
	//靜態方法
	private static void m1() {
		System.out.println("static's m1 method execute");
	}
	
	//成員方法
	private void m2() {
		System.out.println("static's m2 method execute");
	}
	
	//成員內部類
	//可以用訪問控制權限的修飾符修飾
	//public ,protected,private,缺省
	class InnerClass{
		
		//定義靜態方法
		//public static void m3() {}
	
		//成員方法
		public void m4() {
			
			System.out.println(s1);
			m1();
			
			m2();
			System.out.println(s2);
		}
	}
	
//入口	
public static void main(String[] args) {
	
	//創建外部類對象
	OuterClass02 oc = new OuterClass02();
	InnerClass ic = oc.new InnerClass();
	
	ic.m4();

}
	
	
	
	
	
}
