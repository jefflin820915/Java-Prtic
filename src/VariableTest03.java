/*
*變數的分類
	根據變數聲明的位置來分類:
		局部變數
			在方法體當中聲明的變數
		成員變數
			在方法體外[類體之內]聲明的變數
	在不同作用域當中, 變數名可以相同
	在同一個作用域當中. 變數名不能重名
 */
public class VariableTest03 {
	
	//成員變數
	int k = 200;
	
	//主方法: 入口
	public static void main (String[] arg) {
		
		//i變數是局部變數
		int i = 3;
	
		//java遵循"就近原則"
		System.out.println(i);
	}

	//成員變數
	int i = 100; //聲明變數
	
	//類體中不能直接編寫java語句[除聲明變數之外]
	//System.out.println(i);
	public static void dosome() {
		
		//局部變數
		int i = 90;
		
	}
}
