/*
 ����switch�y�y:
 	1. switch�y�y�]�ݩ��ܵ��c, �]�O����y�y
 	2. switch�y�y���y�k���c:
 		�@�Ӥ�����㪺switch�y�y���ӳo�˽s�g:
 			switch(int��String�������r���ȩ��ܼ�){
 				case int��String�������r���ȩ��ܼ� :
 					java�y�y;
 					.....
 					break;
 				case int��String�������r���ȩ��ܼ� :
 					java�y�y;
 					.....
 					break;
 				case int��String�������r���ȩ��ܼ� :
 					java�y�y;
 					.....
 					break;
 				case int��String�������r���ȩ��ܼ� :
 					java�y�y;
 					.....
 					break;
 				.....
 				default :
 					java�y�y;
 					......
 			}
 	3. switch�y�y�������z:
 		switch�᭱���p�A������"�ƾ�"�Mcase�᭱��"�ƾ�"�i��@�@�ǰt, �ǰt���\���������.
 		���ǰt?
 		���ӦۤW�ӤU�����Ǩ̦��ǰt.
 	
 	4. �ǰt���\���������, ������̫ᦳ"break"�y�y����, ���switch�y�y�פ�
    
    5. �ǰt���\���������, ������̫�S��"break"�y�y����, �����i��U�@�Ӥ������(���i��ǰt), 
    	�o�Ӳ{�H�٬�case��z�{�H.[����break;�y�y�i�H�קK��z]
    	
    6. �Ҧ����䳣�S���ǰt���\, ��default���y�y, �|����default��������{��.
    
    7. switch�᭱�Mcase�᭱�u��Oint�Ϊ�String�������ƾ�, ����O��L����.
    	��Mbyte, short, char,�]�i�H�����g��switch�Mcase�᭱, �]�����̥i�H�i��۰������ഫ.
    	
    	byte,short,char�i�H�۰������ഫ��int����.
    	
    	JDK6����, switch�Mcase�᭱�u�౴��int����.
    	
    	JDK7����]�A7�����b��, �ޤJ�s�S��, switch����r�Mcase����r�᭱�i�H����int��String�����ƾ�
    	
    8. case�i�H�X��:
    	int i = 10
    	switch(i){
    	case 1: case 2: case 3: case 10:
    	 	system.out.println("Test code");
    	}
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		/*
		 long a = 10L;
		 int b = a; //���~
		 */
		
		/*
		long x = 10L;
			switch (x) {} */ //���~
		
		//�ѨM���~
		long x = 100L;
		switch ((int)x) {}
	
		byte b = 10;
		switch(b) {}
		
		short t = 10;
		switch(t) {}
		
		char c ='A';
		switch(c) {}
		
		char n = 97;
		switch(n) {}
		
	  //switch(true) {} ���~
		
		String username = "tzuen";
		switch(username) {}
		
		/*
		switch�����㪺�y�y
		*/
		//�����Τ᪺��J:
		//1 ��ܬP���@
		//2 ��ܬP���G
		//....
		//7 ��ܬP����
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�п�J�Ʀr: ");
		int num = s.nextInt();
		switch(num) {
			case 1:
				System.out.println("�P���@");
			break;
			case 2:
				System.out.println("�P���G");
			break;
			case 3:
				System.out.println("�P���T");
			break;
			case 4:
				System.out.println("�P���|");
			break;
			case 5:
				System.out.println("�P����");
			break;
			case 6:
				System.out.println("�P����");
			break;
			case 7:
				System.out.println("�P����");
			break;
		
			default :
				System.out.println("�L�k�T�{");
		}
		
		System.out.println("-------------------------------------------------");
		
		//case��z�{�H
		switch(num) {
		case 1:
			System.out.println("�P���@");
		case 2:
			System.out.println("�P���G");
		case 3:
			System.out.println("�P���T");
		break;
		case 4:
			System.out.println("�P���|");
		break;
		case 5:
			System.out.println("�P����");
		break;
		case 6:
			System.out.println("�P����");
		break;
		case 7:
			System.out.println("�P����");
		break;
	
		default :
			System.out.println("�L�k�T�{");
	
		}
		
		System.out.println("-------------------------------------------------");
		
		//case��z�{�H
		switch(num) {
		case 1:
			System.out.println("�P���@");
		case 2:
			System.out.println("�P���G");
		case 3:
			System.out.println("�P���T");
		case 4:
			System.out.println("�P���|");
		case 5:
			System.out.println("�P����");
		case 6:
			System.out.println("�P����");
		case 7:
			System.out.println("�P����");
		default :
			System.out.println("�L�k�T�{");
		}
		System.out.println("-------------------------------------------------");
		
		//case�X��
		switch(num) {
		case 1: case 0:
			System.out.println("�P���@");
			break;
		case 2:
			System.out.println("�P���G");
			break;
		case 3:
			System.out.println("�P���T");
			break;
		case 4:
			System.out.println("�P���|");
			break;
		case 5:
			System.out.println("�P����");
			break;
		case 6:
			System.out.println("�P����");
			break;
		case 7:
			System.out.println("�P����");
			break;
		default :
			System.out.println("�L�k�T�{");
		}
		
	}
}
