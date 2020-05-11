/*
 	封裝的步驟:
 	1.所有屬性私有化,使用private關鍵字修飾,private表示私有的,修飾所有數據只能在本類中訪問
 	2.對外提供簡單的操作入口,也就是以後外部程序想訪問age屬性必須通過這些簡單的入口進行訪問
 		對外提供兩個公開的方法,分別是set方法跟get方法
 		想修改age屬性,調用set方法
 		想讀取age屬性,調用get方法
 	
 	3.set方法的命名規範:
 		public void set+屬性名首字母大寫(形參){
 		}
 		
 		public void setAge(int a){
 			age = a;
 		}
 	4.get方法的命名規範:
 		public int getAge(){
 			return age;
 		} 
 		
 	一個屬性通常訪問的時候包括幾種形式?
 		第一種方式:想讀取這個屬性的值, get
 		第二種方式:想修改這個屬性的值, set
 		
 	setter and getter方法沒有static關鍵字
 	有static關鍵字修飾的方法:類名.方法名(實參);
 	沒有static關鍵字修飾的方法:引用.方法名(實參);
 */
public class User03 {
	
	
	//屬性私有化
	private int age;
	
	//set方法沒有返回值, 因為set只負責修改數據
	/*
	 	public void setAge(int age){
	 		age = age; //java有就進原則,在這裡其實沒有給age賦值,這裡的age都是局部變數
	 	}
	 */

	//setter
	public void setAge(int a) {
		//編寫判斷
		//age = a;
		if(a<0 || a>150) {
			System.out.println("超出範圍");
			return;
		}
		//如果程序可以執行到這裡的話, 說明a是在範圍內,則進行賦值運算
		age = a;
	}

	//getter
	public int getAge() {
		return age;
	}
}
