/*
 * 方法甚麼時候定義為靜態方法
 * 		方法描述的是動作,當所有的對象執行這個動作的時候,最終產生的影響是一樣的,那麼
 * 		這個動作已經不再屬於某個一個對象的動作,可以將這個動作提升為類級別的動作,模板
 * 		級別的動作.
 * 
 * 靜態方法中無法直接訪問實例變數,實例方法
 * 
 * 大多方法都定義為實例方法,一般一個行為或者一個動作發生的時候,都需要對象的參與
 * 但是也有例外, 例如:大多數"工具類"中的方法都是靜態方法,因為工具類就是方法編成,為了
 * 方便調用,自然不需要new對象是最好的.
 */
public class StaticTest {
	
	//實例變數
	int i = 100;
	
	//實例方法
	public void doSome() {
		
	}
	
	//靜態方法
	public static void main(String[] args) {
	//System.out.println(i);
	//doSome();
		
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.doSome();
		
		//使用數學工具類
		System.out.println(MathUtil.sumInt(10, 20));
		System.out.println(MathUtil.divide(40, 20));
	}

}
/*
 * class 類{
 * 		靜態代碼塊;
 * 		實例代碼塊;
 * 
 * 		靜態變數
 * 		實例變數
 * 		
 * 		構造方法
 * 
 * 		靜態方法
 * 		實例方法
 * }
	this
	static

*/