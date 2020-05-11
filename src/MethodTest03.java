/*
 	方法的調用不一定在main方法當中,可以在其他方法當中.
	只要是程序可以執行的位置, 都可以去調用其他方法
 */
public class MethodTest03 {
	
	public static void sum(int a,int b) {
		
		System.out.println(a + "+" + b + "=" + (a + b));
		
		//調用doSome方法
		MethodTest03.doSome();
	}
	
	//主方法
	public static void main(String[] args) {
		
		//調用sum方法
		MethodTest03.sum(1, 2);
	
		System.out.println("Hello World");
	
	}

	public static void doSome() {
		System.out.println("do some");
	}

}
