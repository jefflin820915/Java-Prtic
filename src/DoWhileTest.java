/*
 	do...while�`��
 		1. do..while�`�����y�k���c
 			
 			do{
 				�`����;
 			}while(���L��F��);
 			
 		2. do..while�`���������z
 			������`����:
 				�P�_���L��F�����G:
 					true
 						����`����
 							�P�_���L��F�����G:
 								true
 									����`����
 										�P�_���L��F�����G:
 											true
 												����`����
 													�P�_���L��F�����G:
 														.......
 											false
 												�`������
 								false
 									�`������
 					false
 						�`������
 		
 		3. do..while�`�������榸��
 			do..while���`����N�X���q���ƬO: 1~N�� [�ܤ֤@��]
 		
 		4. �ϥ�do..while�`�����`�N�ƶ�
 			do..while�`���y�y�̲צ���"����"
 */
public class DoWhileTest {
	public static void main(String[] args) {
	
		int i = 10;
		
		do {
			System.out.println(i);
		}while(i > 100);
		
		System.out.println("-------------------------------");
		
		while(i > 100) {
			System.out.println("i --> " + i);
		}
		
		System.out.println("--------------------------------");
		
		int a = 1;
		do {
			System.out.println(a); // 1 2 3 4 5 6 7 8 9 10
			a++;
		}while(a<=10);
		
		
	}

}
