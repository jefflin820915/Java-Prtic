/*
 * java�y�����p������Ӧr�Ŧ�O�_�@�P
 * 
 * �bjava�������Ӧr�Ŧ�@�P , ����ϥ�"==" 
 * �u��ե�String����equals��k
 */
public class equals02 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");

		System.out.println(s1 == s2); //false
		
		//Stinrg�w�g���g�FObject����equals��k, ������O���e
		System.out.println(s1.equals(s2));
		
	}

}
