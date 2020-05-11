/*
 *  編寫for循環找出1~100中所有的質數
 	質數又被稱為素數, 能夠被1和自身整除, 不能被其他數字整除的數字稱為數字
 	
 	這題主要的知識點:
 		for循環的使用
 		for循環嵌套
 		標記
 		break;
 		統計
 */
public class ForTest08 {
	public static void main(String[] args) {
		
		//外部的for循環只負責取出每個數字i
		for(int i = 2; i<=100; i++) {
			
			boolean pn2 = true;
			for(int j = 2; j < i; j++) { //這裡的for循環只判斷i是否為質數
				if(i % j == 0) {
					pn2 = false;
					break;	
				}
			}	
			if(pn2) {
				System.out.println(i);
			}
		}
		
		//先編寫程序, 驗證7是否為質數
		/*實現思路:
			7 / 1  [不需要]
			7 / 2 [7 % 2 != 0]
			7 / 3 [7 % 3 != 0]
			7 / 4 [7 % 4 != 0]
			7 / 5 [7 % 5 != 0]
			7 / 6 [7 % 6 != 0]
			7 / 7  [不需要]
		結論: 7 是質數
		*/
		int i = 7;
		boolean pn = true; //默認i是一個質數 [標記在開發中比較常用]
		for(int j = 2; j<i; j++) {
			//j是甚麼:  2 3 4 5 6
			if(i % j ==0) {
				//非質數
				pn = false;
				//已經知道i是非質數,  跳出循環.
				break;
			}
		
		}
		System.out.println(pn ? i + "是質數" : i + "不是質數");
	
		

		//升級版 [加入統計機制]
		int count = 0;
		for(int i2 = 2; i2<=100; i2++) {
	
			boolean pn2 = true;
			for(int j = 2; j < i2; j++) { //這裡的for循環只判斷i是否為質數
				if(i2 % j == 0) {
					pn2 = false;
					break;	
				}
			}	
			if(pn2) {
				System.out.print(i2 + " ");
				count++;
				if(count % 8 ==0) {
			//	if(count == 8){
					System.out.println();
				//count = 0;
				}
			}
		}
	}
}
	/*
		編寫for循環找出1~10000中的質數
		要求每8個換一行輸出
	*/