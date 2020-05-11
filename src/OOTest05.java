//測試程序
public class OOTest05 {
	public static void main(String[] args) {
		
		Customer c = new Customer();
		System.out.println(c.id); //0
		
		c = null;
		
		//以下編譯可以通過, 符合語法
		//運行出現空指針異常
		//空引用訪問"實例"相關的數據,一定會出現空指針異常
		//java.lang.NullPointerException
		System.out.println(c.id);
	
	
	}
}

//實例相關的數據: 這個數據訪問的時候必須有對象的參與. 這種數據就是實例相關的數據