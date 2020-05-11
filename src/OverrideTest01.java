/*
 * 回顧java語言當中的方法的重載:
 * 		1. 方法重載又稱為overload
 * 		2. 方法重載甚麼時候使用?
 * 			當在同一個類當中,方法完成的功能是相似的,建議方法名相同,這樣方便程序員的編程,
 * 			就像在調用一個方法似的,代碼美觀
 * 
 * 		3. 甚麼條件構成方法重載
 * 			在同一類當中
 * 			方法名相同
 * 			參數列表不同:類型,順序,個數
 * 
 * 		4. 方法重載和甚麼無關
 * 			和方法的返回值類型無關
 * 			和方法的修飾符列表無關
 * 
 * 關於java語言當中的方法的覆蓋:
 * 
 * 		1.方法覆蓋又被稱為方法重寫,英語單詞: override/overwrite
 * 		
 * 		2. 甚麼時候使用方法重寫
 * 			當父類中的方法無法滿足當前子類的業務需求,
 * 			子類有必須將父類所繼承過來的方法進行重新編寫,
 * 			這個重新編寫的過程稱為方法覆蓋
 * 
 * 		3. 甚麼條件滿足之後方法會發生重寫[代碼滿足甚麼條件後,就構成方法覆蓋]
 * 			方法重寫發生在具有繼承關係的父子類之間
 * 			返回值類型相同,方法名相同,形參列表相同
 * 			訪問權限不能更低,可以更高
 * 			拋出異常不能更多,可以更少
 * 		
 * 		4. 建議方法重寫的時候,盡量複製貼上,不要編寫,容易出錯
 * 
 * 		5. 注意:
 * 			私有方法不能繼承,所以不能覆蓋
 * 			構造方法不能繼承,所以不能覆蓋
 * 			靜態方法不存在覆蓋
 * 			覆蓋只針對方法,不談變數或屬性
 */
public class OverrideTest01 {
	public static void main(String[] args) {
		
		//創建動物對象
		Animal a = new Animal();
		a.move();
		
		//創建貓科動物對象
		Cat c = new Cat();
		c.move();
		
		//創建飛禽類動物對象
		Bird b = new Bird();
		b.move();
		
		YingWu y = new YingWu();
		y.move();
	}
}
