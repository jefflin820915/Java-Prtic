/*
	獲取自 1970年1月1日	00時00分00秒		000毫秒	到當前的毫秒數
	
	1000毫秒 = 1秒
 */
public class DateTest01 {

	public static void main(String[] args) {
		
		long now = System.currentTimeMillis();
		
		System.out.println(now); //1578903463803
		
	}
}
