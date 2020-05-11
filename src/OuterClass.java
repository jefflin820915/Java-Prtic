/*
 * 關於靜態內部類
 * 	1. 靜態內部類可以等同看做靜態變數
 * 
 * 	內部類重要的作用, 可以訪問外部類中私有的數據
 * 
 * 	2.靜態內部類可以直接訪問外部類的靜態數據, 無法直接訪問成員變數/方法
 */
public class OuterClass {
		
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
	
	//靜態內部類
	//可以用訪問控制權限的修飾符修飾
	//public ,protected,private,缺省
	static class InnerClass{
		
		//定義靜態方法
		public static void m3() {
			System.out.println(s1);
			m1();
			//m2();
			//System.out.println(s2);
			
		}
	
		//成員方法
		public void m4() {
			
			System.out.println(s1);
			m1();
			
			//m2();
			//System.out.println(s2);
		}
	}
	
	
	//入口
	public static void main(String[] args) {
		
		//執行m3
		OuterClass.InnerClass.m3();
		
		//執行m4
		InnerClass ic = new InnerClass();
		ic.m4();
	}
	
	
	
	
	
	
}
