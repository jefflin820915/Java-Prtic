	/*
 * 關於java語言當中的繼承
 * 		1. 繼承是面向對象三大特徵之一, 三大特徵分別是: 封裝,繼承,多態
 * 		2. 繼承基本的作用是: 代碼復用.但是繼承最重要的作用是:有了繼承才有了以後方法的覆蓋和多態機制.
 * 		3. 繼承語法格式:
 * 			[修飾符列表] class 類名 extends 父類名{
 * 				類體 = 屬性  + 方法
 * 			}
 * 		4. java語言當中的繼承只支持單繼承,一個類不能同時繼承很多類.只能繼承一個類.在C++中支持多繼承
 * 		5. 關於繼承中的術語:
 * 			B類繼承A類,其中:
 * 				A類稱為父類,基類,超類,superclass
 * 				B類稱為子類,派生類,subclass
 * 		6. 在java語言當中子類繼承父類哪些數據呢
 * 			- 私有的不支持繼承
 * 			- 構造方法不支持繼承
 * 			- 其他數據都可以被繼承
 * 		7. 雖然java語言當中只支持當繼承,但一個類也可以間接技能其他類,例如:
 * 			C extends B{
 * 			}
 			B extends A{
 			}
 			A extends T{
 			}
 			C直接繼承B類,但C類間接繼承T,A類.
 		8. java繼承中假設一個類沒有顯示的繼承任何類,該類默認繼承JavaSE庫當中提供的java.lang.Object類
 		java語言中任何一個類中都有Object類的特徵
 */	
public class ExtendsTest {

	public static void main(String[] args) {
		/*Exception et = new Exception();
		String s = et.toString();//這裡編譯通過,這說明可以調用toString方法,ExtendsTest類中有toString方法,從Object類中繼承過來的.
		System.out.println(s);*/
		
		CreditAccount act = new CreditAccount();
		act.setAotno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getAotno() + "," + act.getBalance() + "," + act.getCredit());
	}

}
