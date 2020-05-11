
public class StringTest06 {

	public static void main(String[] args) {
		
		//1.char charAt(int index);
		String s1 = "�ڬO����,�O�a�H";
		char c1 = s1.charAt(2);
		System.out.println(c1); //��
		
		//2.boolean endsWith(String endStr);
		System.out.println("HelloWorld.java".endsWith("java")); //true
		System.out.println("HelloWorld.java".endsWith(".java")); //true
		System.out.println("HelloWorld.java".endsWith("HelloWorld.java")); //true
		
		System.out.println("HelloWorld.java".endsWith("txt")); //false
		System.out.println("HelloWorld.java".endsWith("java ")); //false
	
		//3. boolean equalsIgnoreCase(String anotherString);
		System.out.println("abc".equalsIgnoreCase("ABc")); //true
		
		//4. byte[] getBytes();
		byte[] bytes = "abc".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		//5.int indexOf(String str);
		System.out.println("http://192.168.1.100:8080/oa/login.action?username=jack&pwd=123".indexOf("/oa"));//25
	
		//6.int indexOf(String str, int fromIndex);
		System.out.println("javaoraclec++javavb".indexOf("java", 1)); //13
		
		//7. int lastIndexOf(String str);
		System.out.println("javaoraclec++javavb".lastIndexOf("java")); //13
		
		//8. int lastIndexOf(String str, int fromIndex)
		System.out.println("javaoraclec++javavb".lastIndexOf("java",14)); //13
		
		//9. int length();
		System.out.println("abc".length());//�ƲլOlength�ݩ�, String�Olength��k
	
		//10. String replaceAll(String s1,String s2);
		System.out.println("javaoraclec++javavb".replaceAll("java", "mysql"));//�o�ӵ{�ǥ|�Ӧr�Ŧ�
	
		//11. String[] split(String s);
		String myTime = "2008,08,08";
		String[] ymd = myTime.split(",");
		
		for (int i = 0; i < ymd.length; i++) {
			System.out.println(ymd[i]);
		}
	
		//12. boolean startsWith(String s);
		System.out.println("/system/login.action".startsWith("/")); //true
		
		//13.String substring(int begin);
		System.out.println("/oa/login.action".substring(3)); //login.action
		
		//14.String substring(int beginIndex, int endIndex);
		System.out.println("/oa/login.action".substring(4, 9)); //login
		
		//15.char[] toCharArray();
		char[] c2 = "�ڬOXXX".toCharArray();
		for (int i = 0; i < c2.length; i++) {
			System.out.println(c2[i]);
		}
	
		//16.�ഫ���j�g
		System.out.println("Abcdef".toUpperCase());
		
		//17.�ন�p�g
		System.out.println("ABCDEf".toLowerCase());
		
		//18.String trim();
		System.out.println("        a b  cd e     ".trim());
		System.out.println("TEST");
		
		//19.String valueOf(Object obj)
		Object o = new Object();
		System.out.println(o); //���|, �]���ä��O�����ե�toString��k,String.valueOf(Object)�o�Ӥ�k��ŭȶi��B��
		System.out.println(String.valueOf(o));
		//System.out.println(o.toString()); //�|�X�{�ū��w
	}
		
}
