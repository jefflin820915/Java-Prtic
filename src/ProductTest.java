/*
 	每個一類中都可以編寫主方法, 但一般情況下一個系統只有一個,所以主方法一般寫一個
 */

public class ProductTest { //商品測試類
	
	//程序入口
	public static void main(String[] args) {
		
		//創建對象, 商品對象
		//iphone7局部變數
		//iphone7引用
		//iphone7變數中保存內存地址指向堆內存當中的商品對象
		Product iphone7 = new Product();
		
		//訪問實例變數的語法: 引用.變數名 
		//讀取: 引用.變數名
		System.out.println("商品的編號: " + iphone7.productNo);
		System.out.println("商品的單價: " + iphone7.price);
		
		//修改: 引用.變數名 = 值;
		iphone7.price = 6899.0;
		iphone7.productNo = 111;
		System.out.println("商品的編號: " + iphone7.productNo);
		System.out.println("商品的單價: " + iphone7.price);
		
		/* 報錯, 實例變數必須先創建對象,通過引用.的方式訪問,不能直接使用類名.的方式訪問
		System.out.println(Product.productNo);
		System.out.println(Product.price);
		*/
	}
}
