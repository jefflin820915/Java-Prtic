/*
 * �_�w�ƧǺ�k:
 * int�������Ʋ� :	3 1 6 2 5
 * 
 * 		�_�w�Ƨ�:
 * 	
 */
public class BobbleSort {

		public static void main(String[] args) {
			
			int[] a = {3,1,6,2,5};
			
			//�}�l�Ƨ�
			
			for (int i = 4; i > 0 ; i--) {
				for (int j = 0; j < i; j++) {
					if(a[j] > a[j+1]) {
						//�洫��m
						int temp;
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
				
			}
	
				//�M��
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
}

/*
	1. ��ƾڬO
	3 1 6 2 5
 	
 	�Ĥ@���`��:
	1 3 6 2 5
	1 3 6 2 5
	1 3 2 6 5
	1 3 2 5 6
	
	1 3 2 5
	�ĤG���`��:
	1 3 2 5
	1 2 3 5
	1 2 3 5
	
	1 2 3
	�ĤT���`��:
	1 2 3
	1 2 3
	
	1 2
	�ĥ|���`��:
	1 2
 */