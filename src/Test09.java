/*
 * 訪問控制權限修飾符:
 * 		
 * 		1. 訪問控制權限修飾符來控制控制元素訪問範圍
 * 		
 * 		2. 訪問控制權限修飾符包括:
 * 			public		表示公開的,在任何位置都能訪問
 * 			protected	同package,子類
 * 			缺省			同package
 * 			private		表示私有的,只能在本類訪問
 * 		
 * 		3. 訪問控制權限修飾符可以修飾類, 變數, 方法...
 * 
 * 		4. 當某個數據只希望子類使用,使用protected進行修飾
 * 
 * 		5. 修飾符的範圍:
 * 				private < 缺省 < protected < public
 */
public class Test09 {
	
	public static void main(String[] args) {
		
		User07 u = new User07();
		
		System.out.println(u.i);
		System.out.println(u.j);
	}
}
