
public class FinalTest03 {
	public static void main(String[] args) {
		
		//�ЫإΤ��H
		User06 u = new User06(100); //User06 u = 0x1234;
		
		//�S�Ыؤ@�ӷsUser��H
		//�{�ǰ���즹�B��ܥH�W��H�H�ܦ��U���ƾ�,���ݩU���^�����^��
		u = new User06(200); // User06 u = 0x4557
		
		//�ЫإΤ��H
		final User06 user = new User06(30);
			//user = new User06(50);//final�׹����ޥ�,�@�����V�Y�ӹ�H����,����A���V��L��H,����Q���V����H�L�k�Q�U���^�����|��.
			
			System.out.println(user.id);
			
			user.id = 50;// final�׹����ޥ����M���V�Y�ӹ�H���ᤣ����V��L��H,���O�ҫ��V����H���������s�O�i�H�ק諸.
			
			System.out.println(user.id);
	
	
	
	} 
}
