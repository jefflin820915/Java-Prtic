/*
  ��ܱƧ�:
  	3 1 6 2 5
  	
  	��k: ��X�̤p��, �M��o�ӳ̤p�ȩM�̫e�����ƾڥ洫��m.
 */
public class SelectSort {
	
	public static void main(String[] args) {
		
		int[] a = {3,1,6,2,5};
		
		//��ܱƧ�
		for (int i = 0; i < a.length-1; i++) {
			
			//���]�Ĥ@�Ӽƾڬ��̤p��
			//�����̤p�Ȥ������U��
			int min = i;
			
			for(int j=i+1; j<a.length;j++ ) {
				
				if(a[min]>a[j]) {
					//��min���s���
					min = j;
				}
			}
			//�Ҽ{�洫��m.
			if(min != i) {
				int temp;
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	
		//��X
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}
}

/*

 3 1 6 2 5
 
 �Ĥ@���`��:
1 3 6 2 5

3 6 2 5 
�ĤG���`��:
2 6 3 5

6 3 5
�ĤT���`��:
3 6 5

6 5
�ĥ|���`��:
5 6

*/