/*
 * �G���Ʋժ��S�I:
 * 	1.�G���ƲլO�@�ӯS���@���Ʋ�
 * 	2.�S���@���Ʋ�, �S��b�o�Ӥ@���Ʋդ��C�@�Ӥ������O�@���Ʋ�
 */
public class ArrayTest09 {
	
	public static void main(String[] args) {
		
		//�R�A��l�ƤG���Ʋ�
		int[][] a = {
						{1,2,3},
						{33,43},
						{0},
						{12,455,24,99}
					};
	
		//�H�W�o�ӼƲզ��h�֭Ӥ@���Ʋ�
		System.out.println(a.length);
		
		//����Ĥ@�Ӥ@���Ʋ�
		int[] a0 =  a[0];
		int a00 = a0[0];
		System.out.println(a00);
		
		//����Ĥ@�Ӥ@���Ʋդ��Ĥ@�Ӥ���
		System.out.println(a[0][0]);
	
		//����̫�@�Ӥ@���Ʋդ��̫�@�Ӥ���
		System.out.println(a[3][3]);
		
		System.out.println(a[a.length-1][a[a.length-1].length-1]);
		
		//�M���G���Ʋ�
		//�a�V�`���b�~
		for(int i=0;i<a.length;i++) {
			//��@���Ʋ�a[i]�i��M��
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
	
}
