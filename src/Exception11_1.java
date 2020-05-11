//顧客相關的業務
public class Exception11_1 {
	
	//對外提供一個註冊的方法
	public void register(String name) throws Exception11{
		
		//完成註冊
		if(name.length()<6) {
			//異常
			//創建異常對象
			Exception11 e = new Exception11("用戶名長度不能少於6位");
		
			//手動拋出異常
			//throw e;
			
			throw new Exception11("用戶名長度不能少於6位");
			}
		
		//如果代碼能執行到此處,證明用戶名是合法的
		System.out.println("註冊成功");
	}
}
