/*
 * ���]�t�ε��w�ҥͦ��Z, �ЧP�_�Ӧҥͪ����Z����:
 		1.���Ħ��Z�d��: [0-100]
 		2.�Ҹզ��Z�i��a���p��
 		3.�Ҹզ��Z�M���Ť������Y:
 			[90-100] A
 			[80-90]  B
 			[70-80]  C
 			[60-70]  D
 			[0-60]   E
 */
public class switchTest04 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("�п�J���Z");
		double num = s.nextDouble();
		
		
		switch ((int)(num / 10)) {
		case 9 : case 10 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		case 0 : case 1: case 2: case 3: case 4: case 5:
			System.out.println("E");
			break;

		default:
			System.out.println("�W�X���Z�d��");
		}
	}

}
