/*
	分析以下程序有幾個線程
 		以下程序只有一個線程, 就是主線程
		main,m1,m2,m3這四個方法在同一個棧空間中
		沒有啟動其他任何線程
 */
public class ThreadTest01 {

	public static void main(String[] args) {
		
		m1();
		
	}


	public static void  m1() {
		
		m2();
	}

	public static void m2() {
		
		m3();
	}
	
	public static void m3() {
		
		System.out.println("m3....");
	}


}
