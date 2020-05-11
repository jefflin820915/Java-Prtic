/*
  1變數作用域
 */

public class ForTest01 {
	public static void main(String[] args) {
		
		//以下for循環當中的"i"變數的作用域僅限當前for循環內部使用
		for (int i = 0; i < 10; i++) {
			System.out.println("i ----> " + i);
		}
	
		//以下for循環當中的"i"變數的作用域僅限當前for循環內部使用
		for (int i = 0; i <= 10; i++) {
			System.out.println("i ---->> " + i);
		}
		
		//錯誤, 無法訪問
		//System.out.println("i = " + i);
	
		//main方法作用域的i變數, 只要main方法沒有結束, 這裡的i就能用
		int i = 0;
		
		for (; i < 10; i++) {
			System.out.println("i = " + i); 
		}
		
		//這裡可以訪問main方法作用域當中的i變數
		System.out.println("i ----------> " + i); //10
	
		int j;
		
		for(j= 1; j < 10 ; j++) {
			System.out.println("j = " +  j);
			
		}
	
		System.out.println(j);
	}

}
