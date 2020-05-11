/*
 * 關於java語言當中的多態語法機制:
 * 		1. Animal,Cat,Bird三個類之間的關係
 * 			Cat繼承Animal
 * 			Bird繼承Animal
 * 			Cat和Bird之間沒有繼承關係
 * 
 * 		2. 面向對象三大特徵: 封裝,繼承,多態
 * 
 * 		3. 關於多態中涉及到幾個概念:
 * 			向上轉型(upcasting)
 * 				子類型-->父類型
 * 				又被稱為:自動類型轉換
 * 
 * 			向下轉型(downcating)
 * 				父類型-->子類型
 * 				又被稱為:強制類型轉換[需要加強制類型轉換符]
 * 
 * 			無論是向上轉型還是向下轉型,兩種類型之間必須要有繼承關係
 * 			沒有繼承關係程序是無法編譯通過
 */
public class Test05 {
	
	public static void main(String[] args) {
		
		//以前編寫的程序
		Animal02 a = new Animal02();
		a.move();
		
		Cat02 c = new Cat02();
		c.move();
		c.catchMouse();
		
		Bird02 b = new Bird02();
		b.move();
	
	
		//使用多態語法機制
		
		/* 1. Animal和Cat之間存在繼承關係,Animal是父類,Cat是子類
		 *
		 * 2. Cat is a Animal[合理]
		 * 
		 * 3. new Cat()創建的對象類型是Cat,a2這個引用的數據類型是Animal,可見他們進行了類型轉換
		 * 子類型轉換成父類型,稱為向上轉型/upcasting,或者稱為自動類型轉換
		 * 
		 * 4. java中允許這種語法:父類型引用指向子類型對象 
		 */
		Animal02 a2 = new Cat02();
		//Bird b2 = new Cat02(); 編譯報錯,因為兩種類型之間不存在任何繼承關係,無法向上或著向下轉型
		/*
		 * 1. java程序永遠都分為編譯階段和運行階段
		 * 2. 先分析編譯階段,再分析運行階段,編譯無法通過,根本是無法運行
		 * 3. 編譯階段編譯器檢查a2這個引用的數據類型為Animal,由於Animal.class
		 * 字節碼當中有move()方法,所以編譯通過.這個過程我們稱為靜態綁定,編譯階段綁定.
		 * 只有靜態綁定成功之後才有後續的運行
		 * 
		 * 4. 在程序運行階段, JVM堆內存當中真實創建的對象是Cat對象,那麼以下程序在運行階段
		 * 一定會調用Cat對象的move()方法,此時發生程序的動態綁定,運行階段綁定
		 * 
		 * 5. 無論是Cat類有沒有重寫move()方法,運行階段一定是調用Cat對象的move()方法,因為底層
		 * 真實對象就是Cat對象
		 * 
		 * 6. 父類型引用指向子類型對象這種機制導致程序在編譯階段綁定和運行階段綁定兩種不同型態/狀態
		 * 這種機制可以稱為多態語法機制
		 */
		a2.move();
		
		/*分析以下程序為什麼不能調用?
		 * 		因為編譯階段編譯器檢查到a2的類型是Animal類型,
		 * 		從Animal.class字節碼文件中查找catchMouse()方法
		 * 		最終沒有找到該方法,導致靜態綁定失敗,沒有綁定成功
		 * 		也就是編譯失敗.
		 * 
		 */
		//a2.catchMouse();
		
		/*
		 * 需求: 
		 * 	假設想讓以上的對象執行catchMouse()方法,怎麼辦
		 * 			a2是無法直接調用的,因為a2的類型Animal,Animal中沒有catchMouse()這個方法
		 * 			我們可以將a2強制類型轉換為Cat類型
		 * 			a2的類型是Animal(父類),轉換成Cat類型(子類),被稱為向下轉型/downcasting/強制類型轉換
		 * 	
		 * 首先向下轉型也需要兩種類型之間必須有繼承關係,不然編譯報錯,強制類型轉換需要加強制類型轉換符
		 * 
		 *  甚麼時候需要使用向下轉型?
		 *  	當調用的方法或著訪問的屬性是子類型中特有的,在父類型當中不存在,必須進行向下轉型
		 */
		Cat02 c2 = (Cat02)a2;
		c2.catchMouse();
		
		
		//父類型引用指向子類型對象[多態]
		
		Animal02 a3 = new Bird02();
		
		/*
		 * 1. 以下程序編譯沒有問題,因為編譯器檢查到a3引用的數據類型是Animal
		 * Animal和Cat之間存在繼承關係,而且Animal是父類型,Cat是子類型
		 * 父類型轉換成子類型叫做向下轉型,語法合格
		 * 
		 * 2. 程序雖然通過,但在運行階段會顯示異常,因為JVA堆內存
		 * 當中真實存在的對象是Bird類型,Bird對象無法轉換成Cat對象,因為
		 * 兩種類型之間不存在任何繼承關係,此時出現著名的異常: 
		 * 					java.lang.ClassCastException
		 * 					類型轉換異常,這種異常總是在"向下轉型的時候"發生
		 */
		
		//Cat02 c3 = (Cat02)a3;
		
		/*
		 * 1. 以上異常只有在強制類型轉換的時候會發生,也就是說"向下轉型"存在隱患(編譯過了,運行錯了)
		 * 2. 向上轉型只要編譯通過,運行一定不會出問題. Animal a = new Cat()
		 * 3. 向下轉型編譯通過,運行可能錯誤: Animal02 a3 = new Bird02();  Cat02 c3 = (Cat02)a3;
		 * 4. 怎麼避免向下轉型出現的ClassCaseException
		 * 		使用instanceof運算符可以避免出現以上的異常
		 * 5. instanceof運算符怎麼用?
		 * 		5-1. 語法格式:
		 * 				(引用 instanceof 數據類型)
		 * 		5-2. 以上運算符的執行結果類型是: boolean類型,結果可能是true/false
		 * 		
		 * 		5-3. 關於運算結果true/fasle:
		 * 			假設:(a instanceof Animal)
		 * 			true表示:
		 * 				a這個引用指向的對象是一個Animal類型
		 * 			false表示:
		 * 				a這個引用指向的對象不是一個Animal類型
		 * 
		 * 6. java規範中要求: 在進行強制類型轉換之前,建議採用intanceof運算進行判斷,避免ClassCastException異常的發生
		 */
		if(a3 instanceof Cat02) { //a3是一個Cat02類型的對象
			
			Cat02 c3 = (Cat02)a3;
			//調用子類對象中特有的方法
			c3.catchMouse();
		}else if (a3 instanceof Bird02) { //a3是一個Bird02類型的對象
			Bird02 b2 = (Bird02)a3;
			//調用子類對象中特有的方法
			b2.fly();
		}
	}
}



/*
 * class 人{
 * 	public void 跑步(){
 * 		system.out.println("鍛鍊身體");
 * 		}
 * }
 * 
 * class 運動員 extends 人{
 * 	public void 跑步(){
 * 		system.out.println("比賽");
 * 		}
 * }
 * 
 * main{
 * 
 * 		人 李四 = new 人(); //不存在類型轉換
 * 		李四.跑步();
 * 
 * 
 * 		人 張三 = new 運動員();
 * 		張三.跑步();
 * }
 * 
 * 
 * 
 */






