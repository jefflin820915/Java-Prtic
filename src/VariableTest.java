/*
 *  變數
 	變數本質上是內儲中的一塊空間, 這塊空間有數據類型, 有名字, 有字面值
 	變數包含三部分: 數據類型,名稱,字面值[數據]
 	變數是內存中存儲數據的最基本單元
*數據類型
	不同的數據由不同的類型,不同的數據類型底層會分配不同大小的空間
	數據類型是指導程序在運行階段應該分配多大的內存空間
*變數要求:變數中存儲的具體的"數據"必須和變數的數據類型一致,當不一致時,報錯
*聲明/定義變數的語法格式:
	數據類型 變數名;
		數據類型: 
			int
		變數名:
		 	只要是合法的標籤符,規範中要求: 首字母小寫, 後面幾個單字首字幕大寫
		 	ex: 
		 		int i;
		 		int age;
		 		int length;
		 		int size;
		 		int num;
		 		其中int是數據類型,  i,age,length,size,num,屬於變數名
*變數聲明如何賦值
	語法格式:
		變數名 = 字面值;
		要求:字面值的數據類型必須和變數的數據類型一致
		=  等號是一個運算符, 賦值運算符, 賦值運算符先運算等號右邊的表達式, 表達式執行結束後的結果賦值給左邊的變數
*聲明和賦值可以放到一起完成
	int i = 10;
*變數賦值之後, 可以重新賦值, 變數的值可變化;
	int i = 10;
	System.out.println(i); //10
	i = 20;
	System.out.println(i); //20
	i = 100;
	System.out.println(i); //100
*有了變數的概念之後,內存空間得到重複的使用:
	int i = 10
	System.out.println(i);
	...
	....
	System.out.println(i);
*通常訪問一個變數包括兩種訪問形式:
	讀取變數中保存的具體數據 get/獲取
	修改變數中保存的具體數據 set/設置
	i = 20; //set
	System.out.println(i); //get
*變數在一行上可以聲明多個
	int a,b,c;
*變數必須先聲明,再賦值,才能訪問	
*/
public class VariableTest {
	public static void main (String[] args) {
		
		int i; //聲明一個int類型變數, 起名i
		
		/*System.out.println(i); 報錯, 變數i尚未初始化*/
		
		i = 100; //給i變數賦值, 在這裡i初始化
		System.out.println(i);
		
		i = 200; //i再次賦值
		System.out.println(i);
		
		//一行上可以同時聲明多個變數
		
		
		int a,b,c = 300;  //報錯, a和b尚未初始化 , c賦值300
		/*System.out.println(a);
		System.out.println(b); 報錯  */
		System.out.println(c);
		
		a = 0;
		b = 1;
		System.out.println(a);
		System.out.println(b);
	}
}