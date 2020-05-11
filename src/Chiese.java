/*
 * "中國人"類
 */
public class Chiese {
	
	//身分證號[每個對象的身分證號不同]
	//實例變數
	 String id;
	
	//姓名[每個對象的姓名不同]
	//實例變數
	String name;
	
	//國籍[每個對象由於都是"chiese"類實例化的,所以每個中國人的國籍都是"中國"]
	//無論通過chiese這個類實例化多少個java對象,這些java對象的國籍都是"中國"
	//實例變數[實例變數是一個java對象就有一個,100個java對象,就有100個country],分析這種設計方式有甚麼缺點
	//實例變數存儲java對象內部,在堆內存當中,在構造方法執行的時候初始化
	//所有人的中國人的國籍都是"中國",這裡聲明為實例變數顯然不合適,太浪費空間,沒必要讓每個對象都保留"國籍"內存
	String country;
	
	//構造函數
	public Chiese() {
		 
	}
	
	
	public Chiese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
}
