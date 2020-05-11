import java.util.jar.Attributes.Name;

/*
 * 關於Java語言當中的this關鍵字
 		1.this是一個關鍵字,翻譯為:這個
 		2.this是一個引用,this是一個變數,this變數中保存了內存地址指向了自身.this存儲在JVM堆內存java對象內部
 		3.創建100個java對象,每個對象都有this,也就是說有100個不同的this.
 		4.this可以出現在"實例方法"當中,代表當前正在執行這個動作的對象,(this代表當前對象)
 		5.多數情況下"this"是可以省略的
 		6.this不能使用帶有static的方法當中
 */
public class Customer03 {

	//姓名[堆內存的對象內部中存儲,所以訪問該數據的時候,必須先創建對象,通過引用的方式]
	String name; //實例變數:必須採用"引用."的方式訪問 
	
	//構造方法
	public Customer03() {
		}


	//不帶有Static關鍵字的一個方法
	//顧客購物的行為
	//每個顧客購物最終的結果都是不同的
	//購物這個行為是屬於對象級別的行為
	//由於每個對象在執行購物這個動作的時候最終結果不同,所以購物這個動作必須有對象的參與
	//重點: 沒有static關鍵字的方法被稱為"實例方法"
	//重點: 沒有static關鍵字的變數被稱為"實例變數"
	//注意: 當一個行為/動作執行的過程當中是需要對象參與的,那麼這個方法一定要定義為"實例方法",不要帶static關鍵字
	
	//以下方法定義為"實例方法",因為每個顧客在真正購物的時候,最終結果都不同的,所以這個動作在完成時必須有對象參與
	
	public void shopping() {
		//當張三在購物的時候,輸出:張三在購物
		//當李四在購物的時候,輸出:李四在購物
		//System.out.println("XXXX在購物!");
		
		//由於name是一個"實例變數",所以這個name訪問的時候一定訪問當前對象的name
		//多數情況下"this"是可以省略的
		System.out.println(name + "在購物!");
	
		//完整寫法:
		//System.out.println( this.name + "在購物!");
	}


		//帶有static
	public static void doSome() {
		//這個執行過程中沒有"當前對象",因為帶有static方法是通過類名的方式訪問的
		//或著說"上下文"當中沒有當前對象,自然也不存在this(this代表當前正在執行這個動作的對象)
		
		//以下報錯
		//doSome方法調用不是對象去調用,是一個類名去調用,執行過程中沒有"當前對象"
		//name是一個實例變數,以下代碼的涵義是:訪問當前對象的name,沒有當前對象,自然也不能訪問當前對象的name
		//System.out.println(name);
	
		//static的方法調用不需要對象,直接使用類名,所以執行過程中沒有當前對象,所以不能使用this
		//System.out.println(this);
	}

	public static void doOther() {
		//假設想訪問name這個實例變數的話應該怎麼做
		//可以採用以下方案,但是以下方案絕對不是訪問當前對象的內容name
		
		//System.out.println(name);
		//創建對象
		Customer03 c = new Customer03();
		System.out.println(c.name); //這裡訪問的name是c引用指向對象的name
		
	}



}
