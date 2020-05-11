
public class Customer02Test {
	public static void main(String[] args) {
		
		Customer02 c = new Customer02();
		
		//私有的屬性不能在外部進行訪問,這就是封裝
		//c.id =444;
		
		//操作入口變成了只能通過set和get方法進行訪問
		//在set方法和get方法進行過程中可以安全過濾
		c.setAddr("新北");
		c.setAge(50);
		c.setId(100);
		c.setName("zhisyu");
		
		System.out.println(c.getId());
		System.out.println(c.getAddr());
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
}
