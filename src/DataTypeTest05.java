/*
 關於布林數據類型:
 	boolean
 在java中boolean類型只有兩個值: true, false, 沒有其它值
 	不像C語言中, 0和1可以表示假和真.
 	
在底層存儲的時候boolean類型占用一個位元組, 因為實際存儲的時候false底層是0, true底層是1
 
 布林類型在實際開發中非常重要, 經常使用在邏輯運算和條件控制語句當中.
 */
public class DataTypeTest05 {
	public static void main(String[] args) {
	
		//錯誤, 不兼容的類型
		//boolean flag = 1;
		
		//boolean loginSuccess = false;
		boolean loginSuccess = true;
		
		//if語句 [條件控制語句]
		if(loginSuccess) {
			System.out.println("登入成功");
		}
		else {
			System.out.println("登入失敗");
		}
}
}