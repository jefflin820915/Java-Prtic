/*
 *  �s�gfor�`����X1~100���Ҧ������
 	��ƤS�Q�٬�����, ����Q1�M�ۨ��㰣, ����Q��L�Ʀr�㰣���Ʀr�٬��Ʀr
 	
 	�o�D�D�n�������I:
 		for�`�����ϥ�
 		for�`���O�M
 		�аO
 		break;
 		�έp
 */
public class ForTest08 {
	public static void main(String[] args) {
		
		//�~����for�`���u�t�d���X�C�ӼƦri
		for(int i = 2; i<=100; i++) {
			
			boolean pn2 = true;
			for(int j = 2; j < i; j++) { //�o�̪�for�`���u�P�_i�O�_�����
				if(i % j == 0) {
					pn2 = false;
					break;	
				}
			}	
			if(pn2) {
				System.out.println(i);
			}
		}
		
		//���s�g�{��, ����7�O�_�����
		/*��{���:
			7 / 1  [���ݭn]
			7 / 2 [7 % 2 != 0]
			7 / 3 [7 % 3 != 0]
			7 / 4 [7 % 4 != 0]
			7 / 5 [7 % 5 != 0]
			7 / 6 [7 % 6 != 0]
			7 / 7  [���ݭn]
		����: 7 �O���
		*/
		int i = 7;
		boolean pn = true; //�q�{i�O�@�ӽ�� [�аO�b�}�o������`��]
		for(int j = 2; j<i; j++) {
			//j�O�ƻ�:  2 3 4 5 6
			if(i % j ==0) {
				//�D���
				pn = false;
				//�w�g���Di�O�D���,  ���X�`��.
				break;
			}
		
		}
		System.out.println(pn ? i + "�O���" : i + "���O���");
	
		

		//�ɯŪ� [�[�J�έp����]
		int count = 0;
		for(int i2 = 2; i2<=100; i2++) {
	
			boolean pn2 = true;
			for(int j = 2; j < i2; j++) { //�o�̪�for�`���u�P�_i�O�_�����
				if(i2 % j == 0) {
					pn2 = false;
					break;	
				}
			}	
			if(pn2) {
				System.out.print(i2 + " ");
				count++;
				if(count % 8 ==0) {
			//	if(count == 8){
					System.out.println();
				//count = 0;
				}
			}
		}
	}
}
	/*
		�s�gfor�`����X1~10000�������
		�n�D�C8�Ӵ��@���X
	*/