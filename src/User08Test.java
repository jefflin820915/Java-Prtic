/*
 * ��ҼҦ��O23�س]�p�Ҧ�����²�檺�@�س]�p�Ҧ�
 * 
 * ���F�`�٤��s�}�P
 */
public class User08Test {

	public static void main(String[] args) {
	
		User08 u1 = new User08();
		User08 u2 = new User08();
		User08 u3 = new User08();
		User08 u4 = new User08();
		
		//==����p�G�O�򥻼ƾ�����, �i�H�����Ӱ򥻼ƾ������O�_�۵�
		//==����p�G�O�ޥμƾ�����, �h������O���s�a�}
		System.out.println(u1==u2); //false
		System.out.println(u2==u3); //false 
		System.out.println(u3==u4); //false
		
	}

}
