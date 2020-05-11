/*
  循環語句和條件判斷語句嵌套使用[for與if嵌套]\
 */
public class ForTest03 {
	public static void main(String[] args) {
		
		//找出1~100所有奇數
		//第一種方案: 從1開始每個遞增2, 每個都是奇數
		for(int i = 1; i <= 100; i+=2) {
			System.out.println("i ===> " + i);
		}
		
		//第二種方案: 從1開始, 以1遞增, 每個數據都進行判斷, 判斷標準是該數字對2求餘數
	
		for(int i = 1; i <= 100; i++) {
			//System.out.println("i ===> " + i);
			//判斷i是否為奇數, 是奇數的時候輸出
			//i % 2 == 0 //偶數
			//i % 2 == 1 //奇數
			//i % 2 != 0 //奇數
				
			if(i % 2 != 0) {
				System.out.println(i);
		}
		}
		
		
		//以上兩種方案, 優先選擇第一種方案: 代碼少, 效率高, 循環次數少
	
	}
	

}
