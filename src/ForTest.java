/*
 1. �`�����c:
 	�b�{�Ƿ��`���@�ǥN�X�ݭn���ư���, ���]�S���`�����c.
 	����ݭn���ư��檺�N�X�۵M�ݭn���ƽs�g, �N�X�L�k�o�쭫��
 	�ϥ�,�ҥH�h�ƽs���y�����O����`�����c.�N�ӧ���а��檺�N�X���q
 	���"�`����"�b�p�X"�p�ƾ�", �@�P����ݭn���ư��檺�N�X.
 
 2. �򥻤W�Ҧ��s���y��������`���]�A�T��:
 	for�`��
 	while�`��
 	do...while�`��
 
 3. ��e��ҥD�n����for�`��, for�`�����y�k���c�O�ƻ�
 	
 	�y�k���c:
 		
 		for(��l�ƪ�F��	; ���L��F��	; ��s��F��){
 			//�o�̬O�ݭn���ư��檺�N�X���q[�`����: java�y�y�զ�]
 		}
 4. for�`��������L�{/��z [*****]
 	4.1. ��l�ƪ�F��, ���L��F��, ��s��F�������O���ݪ� [��Ӥ����O������]
 	4.2. ��l�ƪ�F���̥�����, �åB�b���for�`�����u����@��.
 	4.3. ���L��F��������true/false, ����O��L��.
 	4.4 . for������L�{:
 		
 		�������l�ƪ�F��, �åB�Ӫ�F���u����@��
 		
 		�P�_���L��F�������G�Otrue�٬Ofalse
 			
 		-	���L��F��true
 				
 				����`����
 				
 				�����s��F��
 				
 				�P�_���L��F���Otrue�٬Ofalse
 				
 					���L��F��true
 						
 						����`����
 						
 						�����s��F��
 							
 							�P�_���L��F���Otrue�٬Ofalse
 								
 								���L��F��true
 								
 									����`����
 									
 									�����s��F��
 										
 										�P�_���L��F���Otrue�٬Ofalse
 											
 											.......
 								
 								���L��F��false
 									
 									�`������
 					
 					���L��F��false
 					
 						�`������
 			
 		-	���L��F��false
 		
 				�`������
 */
public class ForTest {
	public static void main(String[] args) {
		/*
		//��X�Ʀr1~10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		
		//�ϥδ`�����c�Ӵ��N�H�W�Ҧ����а��檺�N�X
		//�ϥδ`���y�y�i�H���N�X�q�ܤ�
		//�W���N�X��for�`��
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 10 ; i += 1) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 10 ; i = i + 1) {
			System.out.println(i);
		}
	
		
		//���`��
		for(; ;) {
			System.out.println("a");
		}
	
	
	
	}

}
