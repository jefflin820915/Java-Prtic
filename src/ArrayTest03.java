/*
 * �ʺA��l�Ƥ@���Ʋ�
 * 	1.�ʺA��l�Ƥ@���Ʋ�, �|���b�鷺�s�����t�o�ӼƲ�, �åB�b�Ʋդ��C�@�Ӥ������ĥ��q�{��
 * 	byte,short,int,long	0
 * 	float,double	0.0	
 * 	boolean		false
 * 	char	\u0000
 * 	�ޥ�		null
 */
public class ArrayTest03 {
	
	public static void main(String[] args) {
		
		//�ʺA�n���@��int�������Ʋ�, �̦h�i�H�s�x4�Ӥ���
		int[] a1 = new int[4];
		
		//�M��
		for (int i = 0; i < a1.length; i++) {
			
			System.out.println(a1[i]);
		}
		
		//���
		a1[0] = 21;
		a1[1] = 22;
		a1[2] = 23;
		a1[3] = 24;
		
		//�M��
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	
		//�ޥ��������Ʋ�
		Object[] objs = new Object[3];	
	
		for (int index = 0; index < objs.length; index++) {
			Object o = objs[index];
			//o.toString(); //�`�N�ū��w���`, �]���ޥ��������Ʋ��q�{�ȬOnull
			System.out.println(o); // null null null
		}
	
	}
}
