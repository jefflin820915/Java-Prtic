/*
 	�Hjava.lang.Integer:��������,���ѤK�ؼƾ�����
 */
public class IntegerTest02 {
	
	public static void main(String[] args) {
		
		//���int�����̤j�ȸ�̤p��
		System.out.println("int�̤p��: " + Integer.MIN_VALUE);
		System.out.println("int�̤j��: " + Integer.MAX_VALUE);
		
		//�Hint��byte
		System.out.println("byte�̤p��: " + Byte.MIN_VALUE);
		System.out.println("byte�̤j��: " + Byte.MAX_VALUE);
	
	
		//�Ы�Integer��������H
		Integer i1 = new Integer(10); //int -> Integer
		Integer i2 = new Integer("123"); // String -> Integer
	
		System.out.println(i1); //10
		System.out.println(i2); //123
		
		//�H�U�{�ǥi�H�q�L, ������
		//���M�i�H�N�r�Ŧ��ഫ��Integer����,���O�Ӧr�Ŧ�]�����O"�Ʀr�r�Ŧ�"
		//Integer i3 = new Integer("abcdr"); //java.lang.NumberFormatException
	}
}
