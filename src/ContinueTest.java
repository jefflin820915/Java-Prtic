/*
  continue�y�y:
  	1. continue���: �~��/go on/�U�@��
  	
  	2. continue�]�O�@��continue����r�[�@�Ӥ���, �c���@�ӳ�W�����㪺java�y�y, 
  	�D�n�X�{�`���y�y���Ψӱ���`��������.
  	
  	3. break�Mcontimnue���ϧO?
  		break��ܴ`��������F,  ���X�`��, �פ�`��
  		continue��ܲפ��e�����`��,  �����i�J�U�@���`���~�����.
  	
  	4. continue�]���o�˪��y�k:
  		continue �`���W��; 
 */
public class ContinueTest {
	public static void main(String[] args) {
	
		for(int i = 0; i< 10; i++) {
			if(i ==5) {
				break;
			}
			System.out.println("i---> " + i); // 0 1 2 3 4
		} 
		System.out.println("Hello World");
	
	
		for(int i = 0; i< 10; i++) {
			if(i ==5) {
				continue; //�u�n�o�ӻy�y����, ��e�����`������, �����i�J�U�@��"�~��"����
			}
			System.out.println("i---> " + i); // 0 1 2 3 4 6 7 8 9
		} 
		System.out.println("Hello World");
	
	
		
		for1:for(int i = 0; i< 10; i++) {
			if(i ==5) {
				continue for1; //�u�n�o�ӻy�y����, ��e�����`������, �����i�J�U�@��"�~��"����
			}
			System.out.println("i---> " + i); // 0 1 2 3 4 6 7 8 9
		} 
		System.out.println("Hello World");
	
	
	}
}
