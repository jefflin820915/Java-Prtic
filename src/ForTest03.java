/*
  �`���y�y�M����P�_�y�y�O�M�ϥ�[for�Pif�O�M]\
 */
public class ForTest03 {
	public static void main(String[] args) {
		
		//��X1~100�Ҧ��_��
		//�Ĥ@�ؤ��: �q1�}�l�C�ӻ��W2, �C�ӳ��O�_��
		for(int i = 1; i <= 100; i+=2) {
			System.out.println("i ===> " + i);
		}
		
		//�ĤG�ؤ��: �q1�}�l, �H1���W, �C�Ӽƾڳ��i��P�_, �P�_�зǬO�ӼƦr��2�D�l��
	
		for(int i = 1; i <= 100; i++) {
			//System.out.println("i ===> " + i);
			//�P�_i�O�_���_��, �O�_�ƪ��ɭԿ�X
			//i % 2 == 0 //����
			//i % 2 == 1 //�_��
			//i % 2 != 0 //�_��
				
			if(i % 2 != 0) {
				System.out.println(i);
		}
		}
		
		
		//�H�W��ؤ��, �u����ܲĤ@�ؤ��: �N�X��, �Ĳv��, �`�����Ƥ�
	
	}
	

}
