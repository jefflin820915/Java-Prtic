
public class MainTest {
	
	//public表示公開的,在任何位置都可以訪問
	//static表示靜態的,使用類名.的方式進行訪問,調用main方法
	//void表示main方法執行結束之後不返回任何值
	//main表示main方法的方法名
	//(String[] args)是main方法的形式參數列表 
	public static void main(String[] args) {
		main(10);
		main("Hello World");
	}

	
	
	public static void main(int i) {
		System.out.println(i);
	}

	public static void main(String args) {
		System.out.println(args);
	}
}
