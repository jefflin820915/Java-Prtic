/*
  1�ܼƧ@�ΰ�
 */

public class ForTest01 {
	public static void main(String[] args) {
		
		//�H�Ufor�`������"i"�ܼƪ��@�ΰ�ȭ���efor�`�������ϥ�
		for (int i = 0; i < 10; i++) {
			System.out.println("i ----> " + i);
		}
	
		//�H�Ufor�`������"i"�ܼƪ��@�ΰ�ȭ���efor�`�������ϥ�
		for (int i = 0; i <= 10; i++) {
			System.out.println("i ---->> " + i);
		}
		
		//���~, �L�k�X��
		//System.out.println("i = " + i);
	
		//main��k�@�ΰ쪺i�ܼ�, �u�nmain��k�S������, �o�̪�i�N���
		int i = 0;
		
		for (; i < 10; i++) {
			System.out.println("i = " + i); 
		}
		
		//�o�̥i�H�X��main��k�@�ΰ����i�ܼ�
		System.out.println("i ----------> " + i); //10
	
		int j;
		
		for(j= 1; j < 10 ; j++) {
			System.out.println("j = " +  j);
			
		}
	
		System.out.println(j);
	}

}
