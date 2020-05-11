/*
	關於java中的可變長參數
 */
public class VarArgsTest01 {

	//m1方法有一個可變長參數
	public static void m1(int... a) { //m1方法在調用的時候, 傳遞的實參可以是0-N個
		
		System.out.println("Test");
	}
	
	//如果可以精確匹配的方法, 則調用該方法, 不會再去執行可變長參數的方法
	public static void m1(int i ) {
		
		System.out.println(i);
	}
	
	//可變長參數可以等同看做數組
	public static void m2(String... args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void m3(Class... args) {
		
		for (int i = 0; i < args.length; i++){
			Class c = args[i];
			try {
			System.out.println(c.newInstance());
			}catch(Exception e) {
				
			}
		}
	}
	
	//可變長參數只能出現一次, 並且只能出現在所有參數的最後一位
	//public static void m4(String... a,int i) {}
	
	public static void m4(int i,String... a) {}
	
	
	public static void main(String[] args) {
		
		m1();
		m1(1);
		m1(1,2);
		m1(3,4,5,6,7);
		
		m2("體育","音樂","旅遊","美食");
	
		String[] s = {"體育","音樂","旅遊","美食"};
		m2(s);
		
		m3(Date.class,Employee.class);
	}
}
