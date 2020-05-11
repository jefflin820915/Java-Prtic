
public class OOTest04 {
	public static void main(String[] args) {
	
		//創建一個丈夫對象
		Husband husband = new Husband();
		husband.name = "husband";
		
		//創建一個妻子對象
		
		Wife wife = new Wife();
		wife.name = "wife";
		 
		//結婚[能通過丈夫找到妻子, 通過妻子也可以找到丈夫]
		husband.w = wife;
		wife.h = husband;
		
		//得到以上"husband"的妻子名稱
		System.out.println(husband.name + "妻子的名字叫: " + wife.name);
		System.out.println(husband.name + "妻子的名字叫: " + husband.w.name);
	}
}
