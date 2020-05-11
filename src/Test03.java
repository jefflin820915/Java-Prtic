/*
 * 甚麼時候在運行的時候出現空指針異常呢
 * 		空引用訪問實例相關的數據,因為實例相關的數據就是對象相關的數據,
 * 		訪問這些實例數據一定會出現空指針異常
 *
 * 實例相關的數據包括:
 * 		實例數量[對象需要存在]
 * 		實例方法[對象需要存在]
 */
public class Test03 {
	public static void main(String[] args) {
		Test03.doSome();
		doSome();
		
		Test03 t = new Test03();
		t.doSome();
		
		//引用為空
		t = null;
		
		//帶有static的方法,其實既可以採用類名的方式訪問,也可以採用引用的方式訪問
		//但是即使採用引用的方式去訪問,實際上執行的時候和引用指向的對象無關.
		//在eclipese中開發的時候,使用引用的方式訪問帶有static的方法,程序會出現警告
		//所以帶有static的方法還是建議使用"類名."的方式訪問
		t.doSome();//這裡不會出現空指針異常
	}
	
	//帶有static的方法,需要使用"類名."的方式來訪問
	public static void doSome() {
		System.out.println("do Some");
	}
}
