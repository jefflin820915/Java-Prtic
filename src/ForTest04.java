import java.awt.Image;

/*
 * 在前一個基礎之上, 計算1~100所以奇數的和
 	1 + 3 + 5 + 7 + 9
 		
 	運算符 += 累加
 */
public class ForTest04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=100; i+=2) {
			//i是奇數
			//累加求和
			//System.out.println("i==> " + i);
			
			//定義一個變數[盒子], 初始值為0
			
			//sum存儲的最終求和的結果
			//不能每一次執行到這裡,都把求和結果歸零
			//定義sum變數不能放這裡, 這裡是循環體
			//int sum = 0;
			
			sum += i;
		
			//輸出語句放這裡表示每循環一次則輸出一個數據
			//System.out.println("sum = " + sum);
		}
			
			//以上for循環結束之後, 最終輸出求和的結果
			System.out.println("sum = " + sum);
		//================================================
		//歸零
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 != 0 ){ //是奇數
				sum += i; //則累加求和
			}
		}
		System.out.println(sum);
			
			
			
			
			
			
	}

}
