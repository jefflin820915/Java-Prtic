/*
 * 甚麼時候成員變數聲明為實例變數呢
 * 		-所有對象都有這個屬性,但是這個屬性的值會隨著對象變化而變化[不同對象的這個屬性具體的值不同]
 * 
 * 甚麼時候成員變數聲明為靜態變數呢
 		-鎖有對象都有這個屬性,並且鎖有對象的屬性這個值是一樣的,建議定義為靜態變數,節省內存開銷
 		
 	靜態變數在類加載的時候初始化,內存在方法區中開闢,訪問的時候不需要創建對象,直接使用"類名.變數名"的方式訪問

*	關於java中static關鍵字:
*		1. static翻譯為靜態的
*		2. static修飾的方法是靜態方法
*		3. static修飾的變數是靜態變數
*		4. 所有static修飾的元素都稱為靜態的,都可以使用"類名."的方式訪問,也可以用引用.的方式訪問[不建議]
		5. static修飾的所有元素都是類級別的特徵,與具體對象無關
*
*/	
public class Chiese02 {
	
	//身分證號[每個對象的身分證號不同]
	//實例變數
	 String id;
	
	//姓名[每個對象的姓名不同]
	//實例變數
	String name;
	
	//國籍[所有對象國籍一樣,這種特徵屬於類級別的特徵,可以提升為整個模板的特徵,可以在變數前添加static關鍵字修飾]
	//靜態變數,靜態變數在類加載的時候初始化,不需要創建對象,內存就開闢了
	//靜態變數存儲在方法區內存當中
	static String country = "中國";
	
	//構造函數
	public Chiese02() {
		 
	}
	
	
	public Chiese02(String id,String name) {
		this.id = id;
		this.name = name;
	}
}
