/*
 * 變數:
	變數的作用域
		作用域:  變數的作用域, 描述的就是變數的有效範圍, 在甚麼範圍之內可以被訪問, 只要出了範圍該變數就無法訪問 
	作用域一句話:
		出了大括號就不認識了
*/
public class VariableTest02 {
	
	//static不要去掉
	static int k = 90;
			
	public static void main(String[] args) {
		
		//變數i的作用域是main方法
		//在整個main方法當中最有效的,可見的,可以訪問的
		int i = 100;
		
		System.out.println(i); //可以
		System.out.println(k); //可以
		
		//以下會編寫一個for循環語句
	
		for(int a=0;a<10;a++) { //a變數的作用域是整個for循環, for循環結束後, a變數就釋放了
			
		}
		
		//System.out.println(a);
		//這裡無法訪問a變數
		
		int j; //作用域是main方法
		for(j=0;j<10;j++) { 
	
	}
		
		System.out.println(j); //訪問main方法中的j變數
	
	}
	
	public static void dosome() {
		
		//這裡無法訪問main方法當中的變數i
		//已經出了i變數的作用域
		//System.out.println(i);
	
		//
		System.out.println(k);
	}
}
