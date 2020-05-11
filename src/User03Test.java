
public class User03Test {
	public static void main(String[] args) {
		//創建User對象
		User03 user = new User03();
	
		
		//報錯, age屬性私有化,在外部程序中不能直接訪問
		//從此之後age屬性非常安全
		//對於目前程序來說,age屬性徹底在外部訪問不到
		//System.out.println(user.age);
		
		
		//修改
		user.setAge(-100);
		
		
		//讀取
		System.out.println(user.getAge());
	}
}
