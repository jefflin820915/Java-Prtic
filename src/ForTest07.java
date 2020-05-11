/*
 * 使用for循環輸出九九乘法表
 */
public class ForTest07 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++) { //外層循環9次
			
			// i是行號
			
			//循環體當中的程序主要的任務
			//處理當前行, 將當前行中所有的項目全部輸出
			for(int j = 1; j<=i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " " );
			}

				System.out.println();
			}
	}

}
