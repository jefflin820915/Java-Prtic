/*
 * 單例模式是23種設計模式中最簡單的一種設計模式
 * 
 * 為了節省內存開銷
 */
public class User08Test {

	public static void main(String[] args) {
	
		User08 u1 = new User08();
		User08 u2 = new User08();
		User08 u3 = new User08();
		User08 u4 = new User08();
		
		//==兩邊如果是基本數據類型, 可以比較兩個基本數據類型是否相等
		//==兩邊如果是引用數據類型, 則比較的是內存地址
		System.out.println(u1==u2); //false
		System.out.println(u2==u3); //false 
		System.out.println(u3==u4); //false
		
	}

}
