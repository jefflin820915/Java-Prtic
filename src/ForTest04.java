import java.awt.Image;

/*
 * �b�e�@�Ӱ�¦���W, �p��1~100�ҥH�_�ƪ��M
 	1 + 3 + 5 + 7 + 9
 		
 	�B��� += �֥[
 */
public class ForTest04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=100; i+=2) {
			//i�O�_��
			//�֥[�D�M
			//System.out.println("i==> " + i);
			
			//�w�q�@���ܼ�[���l], ��l�Ȭ�0
			
			//sum�s�x���̲רD�M�����G
			//����C�@�������o��,����D�M���G�k�s
			//�w�qsum�ܼƤ����o��, �o�̬O�`����
			//int sum = 0;
			
			sum += i;
		
			//��X�y�y��o�̪�ܨC�`���@���h��X�@�Ӽƾ�
			//System.out.println("sum = " + sum);
		}
			
			//�H�Wfor�`����������, �̲׿�X�D�M�����G
			System.out.println("sum = " + sum);
		//================================================
		//�k�s
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 != 0 ){ //�O�_��
				sum += i; //�h�֥[�D�M
			}
		}
		System.out.println(sum);
			
			
			
			
			
			
	}

}
