/*
 	�b��^�������Ovoid����k���ϥ�"return;"�y�y
 	"return"�y�y�X�{�b��^��void����k���D�n�O���F�פ��e��k.
 */
public class MethodTest09 {
	public static void main(String[] args) {
		m();
		
		for(int i =10; i>0; i--) {
			if(i == 2) {
				return;
			}
			System.out.println("date --> " + i);
		}
		System.out.println("Execute Here");
		}

	//���~, ����������Ū���k, �L�k��^��
	/*
	public static void m() {
		return 10;
	}
	*/
	
	/*public static void m() {
		return;
	}*/
	
	public static void m() {
		for(int i = 0; i<10; i++) {
			if(i ==5) {
				return; //���O�פ�for�`��, �פ�Om��k
				//break; //�פ�for�`��
			}
			System.out.println("i -->" + i);
		}
		System.out.println("Hello World");
	
	}


}
