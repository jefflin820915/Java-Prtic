
/*
 	關於java類中的構造方法:
 		1. 構造方法又被稱為構造函數/構造器/Constructor
 		2. 構造方法的語法結構:
 			[修飾符列表] 構造方法名(形式參數列表){
 				構造方法體;
 			}
 		
 		3. 普通方法的語法結構:
 			[修飾符列表] 返回值類型 方法名(形式參數列表){
 				方法體;
 			}
 		
 		4. 對於構造方法來說, "返回值類型"不需要指定,並且也不能寫void
 		只要寫上void,這個方法就成為普通方法
 		
 		5. 對於構造方法來說,構造方法的方法名必須和類名保持一致
 		
 		6. 構造方法的作用?
 			構造方法存在的意識,通過構造方法的調用,可以創建對象.
 		
 		7. 構造方法應該怎麼調用?
 			普通方法是這樣調用: 方法修飾符中有static的時候: 類型.方法名(實參列表) 或者 
 							       方法修飾符中沒有static的時候: 引用.方法名(實參列表)
 			new 構造方法名(實參列表)
 			
 		8. 構造方法調用值行之後, 有返回值嗎?\
 			每一個構造方法執行結束後都有返回值,但是這個"return"不需要寫,構造方法結束後java程序自動返回值
 			並且返回值類型是構造方法所在類的類型,由於構造方法返回值類型就是類本身,所以返回值類型不需要編寫.
 			
 		9. 當一個類中沒有定義任何構造方法,系統默認給該類提共一個無參數的構造方法,這個構造方法被稱為缺省構造器
 		
 		10.當一個類顯示地將構造方法定義出來了,那麼系統不在默認認為這個類提供缺省構造器,建議開發中手動的為當前類提供無參數構造方法
 			因為無參數構造方法太常用了
 			
 		11.構造方法支持重載機制,在一個類當中編寫多個構造方法, 這個多個構造方法已經構成方法重載機制
 */
public class ConstructorTest01 {
	public static void main(String[] args) {
		
		
		//創建User對象
		//調用User類的構造方法來完成對象的創建
		//以下程序創建4個對象, 只要構造函數調用就會創建對象, 並且一定是在"堆內存"中開闢內存空間
		User04 u1 = new User04();
		User04 u2 = new User04(10);
		User04 u3 = new User04("1234");
		User04 u4 = new User04(10,"1234");
	
		//帶有static的方法: 類名.
		ConstructorTest01.doSome();
		doSome();

		//調用沒有static的方法: 引用.
		//doOther方法在ConstructorTest01類當中, 所以需要創建ConstructorTest01對象
		//創建ConstructorTest01對象, 調用無參數構造方法
		ConstructorTest01 c = new ConstructorTest01(); // 一個類中沒有任何構造方法的話,系統默認一個無參數構造器
		c.doOther();
	
	}

	public static void doSome() {
		System.out.println("do Some");
	}

	public void doOther() {
		System.out.println("do Other");
	}




}
