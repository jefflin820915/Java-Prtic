/*
 ����java����y�y��break�y�y:
 	
 	1. break�Ojava�y����������r, �Q½Ķ��"���_/���_"
 	
 	2. break + ";"�i�H�����@�ӳ�W������ajava�y�y: break;
 	
 	3. break�y�y�ϥΦbswitch�y�y��, �ΨӲפ�switch�y�y����.
 	
 	4. break�y�y�P�˥i�H�ϥΦb�`���y�y��, �ΨӲפ�`��������.
 	
 	5. break�פ���Ӵ`��?
 	
 	6. break; �y�y�ϥΦbfor,while,do...while�`���y�y���ΨӸ��X�`��, �פ�`��.
 	�]����{�Ǵ`����Y�ӱ��󪺮ɭ�, ���򪺴`���S���n����F, �A����]�O�ӶO�귽, �ҥH
 	 �i�H�פ�`��, �o�˥i�H�����{�Ǫ�����Ĳv
 	 
 	7.  �H�U�Hfor�`�����Ҩϥ�break;�y�y.
 	
 	8. �b�q�{���p�U, break;�y�y�פ�O�P���̪񪺴`���y�y, ��M�]�i�H���w�פ�Y�Ӵ`��.
 	�ݭn���`���_�W. �ĥγo�ػy�k:	break �`���W��;
 */
public class BreakTest {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i ==5) {
				break; //�פ�O��e��for�`��
			}
			System.out.println("i--->" + i); // 0 1 2 3 4
		}
		
		//�o�̪��{�ǩM�H�W��for�`���L��
		System.out.println("Hello Wolrd");
		
		for(int j = 0; j<3; j++) {
			for(int i=0; i<10; i++) {
				if(i ==5) {
					break; //��e��break�y�y�פ�O���h��for�`��, �]�������̪�
						   //�o�̪�break�y�y���|�v�T��~�h��for�`��
				}
					System.out.println("i--> " + i);
			
			}
		}		
		
			System.out.println("------------------------------------------------------------");
		//��for�`���_�Wfor1
		for1:for(int j = 0; j<3; j++) {
			//��for�`���_�Wfor2
			for2:for(int i=0; i<10; i++) {
				if(i ==5) {
					break for1; //�פ�for1�`��
			}
				System.out.println("i--> " + i);	
		}
		}
		System.out.println("Hello World");	
			
			
			

		
		
	}

}