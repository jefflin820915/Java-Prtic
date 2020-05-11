/*
 * 客戶業務接口
 *  
 *  接口作用:
 * 	
 * 	1. 可以使項目分層, 所有層都面向接口開發, 開發效率提高
 * 	
 * 	2. 接口使代碼和代碼之間的耦合度降低	, 就像記憶體和主板的關係,變得"可插拔"
 * 	    可以隨意切換
 * 
 * 接口和抽象類都能玩程某個功能, 優先選擇接口, 因為接口可以多實現多繼承
 * 一個類除了實現接口之外,還可以去繼承其它類(保留了類的繼承)
 */
public interface CustomerService {
	
	//定義一個退出系統的方法
	void logout();

}
