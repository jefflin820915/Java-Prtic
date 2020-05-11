/*
	
 */
public class CustomerService02{
	
	public boolean login(String name,String pwd) {
		
		if("admin".equals(name) && "123".equals(pwd)) {
			return true;
		}
		return false;
	}

	public void logout() {
		System.out.println("系統安全退出");
	}

}
