/*
 	方法調用:
 		1. 方法的修飾符列表當中有static關鍵字, 完整的調用方式是: 類名.方法名(實參列表);
 		
 		2. 但是, 有的時候"類名."可以省略, 甚麼情況下可以省略:
 			m1(){
 				m2();
 			}
 			m1方法和m2方法在同一個類體當中的時候, "類名."可以省略不寫
 		
 		3. 建議在一個java原文件當中只定義一個class, 比較清晰, 這裡只是為了講課方便才在
 		一個java原文件當中編寫了多個class, 不要模仿.
 */
public class MethodTest05 {
	
	
	
	public static void main(String[] args) {
		
		//調用方法
		MethodTest05.m();
		
		//對於方法的修飾符列表當中有static關鍵字的: "類名."可以省略不寫嗎
		m();
	
		//調用其他類[不是本類]中的方法
		A.doOther();
	
		//省略"類名."試試
		//報錯, "類名."省略之後, 默認從當前類中找"doOther"方法, 在當前類中該方法不存在.
		//doOther();
		
	}

	public static void m() {
		System.out.println("m method execute");
	
		//完整的方式
		MethodTest05.m2();
		
		//省略的方式
		m2();
		
		//不想調用當前本類當中的m2方法, 這個時候就必須添加"類名."了
		A.m2();
	}

	public static void m2() {
		System.out.println("m2 execute");
	}
}

class A{	
	public static void doOther() {
		System.out.println("A's doOther method invoke");
	}

	public static void m2() {
		System.out.println("A's method m2 invoke");
	}


}