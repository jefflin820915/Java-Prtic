/*
	關於字符串常用構造方法
	
 */
public class StringTest05 {
	
	public static void main(String[] args) {
		
		//1.
		String s1 = "abc";
		
		
		//2.
		String s2 = new String("abc");
		
		//3.
		byte[] bytes = {97,98,99,100};
		String s3 = new String(bytes);
	
		System.out.println(s3); //abcd Stinrg已經重寫了Object中的toString
		
		//4.
		String s4 = new String(bytes,1,2);
		System.out.println(s4);
		
		//5. 
		char[] c1 = {'是','你','他','我','們'};
		String s5 = new String(c1);
		System.out.println(s5);
		
		//6.
		String s6 = new String(c1,2,2);
		System.out.println(s6);
	
	}
}
