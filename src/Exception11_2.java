/*
 * 模擬註冊
 */
public class Exception11_2 {
	
	public static void main(String[] args) {
		
		//假如用戶的提供的用戶名如下
		String username = "asdsadadasda";
		
		//註冊
		Exception11_1 cs = new Exception11_1();
		
		try {
			cs.register(username);
		} catch (Exception11 e) {
			System.out.println(e.getMessage());
		}
	}
}
