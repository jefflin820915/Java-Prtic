/*
 * java語言中如何比較兩個字符串是否一致
 * 
 * 在java中比較兩個字符串一致 , 不能使用"==" 
 * 只能調用String類的equals方法
 */
public class equals02 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");

		System.out.println(s1 == s2); //false
		
		//Stinrg已經重寫了Object中的equals方法, 比較的是內容
		System.out.println(s1.equals(s2));
		
	}

}
