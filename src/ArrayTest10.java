/*
 * ����G���Ʋժ��ʺA��l��
 */
public class ArrayTest10 {
	
	public static void main(String[] args) {
		
		//3�Ӥ@���Ʋ�
		//�C�Ӥ@���Ʋդ���4�Ӥ���
		int[][] a = new int[3][4];
	
		//�M��
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
			
			//���
		a[1][2] = 100;
		for (int  i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}	
				System.out.println();
		} 
	}
}
