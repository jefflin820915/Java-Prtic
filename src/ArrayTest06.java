/*
 * 方法調用的時候, 也可以這樣傳遞一個數組.
 */
public class ArrayTest06 {
	
	public static void main(String[] args) {
		
		//第一種方式
		int[] a = {12,3,4,5,6}; 
		m1(a);
		
		//第二種方式
		m1(new int[] {32,5,6,7,8,9,10});
	}
	public static void m1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}



}
