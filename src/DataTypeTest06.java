/*
 ����򥻼ƾ����������������ഫ:  �ഫ�W�h
 	1. �K�ؼƾ����������F���L�������~�ѤU��7�������������i�H�����ഫ
 	
 	2. �p�e�q�V�j�e�q�ഫ, �٬��۰������ഫ , �e�q�q�p��j�Ƨ�:
 		byte < short < int < long < float < double < char < 
 		����B�I�������ަ��Φh�֦줸��, �����ƫ��٭n�j.
 		char�Mshort�i��ܪ������ƶq�ۦP, ��char�i�H����j�������
 	
 	3. �j�e�q�ഫ���p�e�q, �٬��j�������ഫ, �ݥ[�j�������ഫ��.
 	
 	4. ���Ʀr���ȨS���W�Xbyte,short,char�����Ƚd��, �i�H������ȵ�byte,short,char�������ܼ�
 	
 	5. byte,short,char�V�X�B���,�U�ۥ��ഫ��int�����A�p��.
 	
 	6. �h�ؼƾ������V�X�B��, ���ഫ���e�q�̤j�������A���B��
 	
 */
public class DataTypeTest06 {
	public static void main(String[] args) {
		
	//���~, 1000�W�Xbyte�d��
	//byte a = 1000;
	
	//���T,20�S���W�Xbyte�d��
	//�ҥH���
	byte a = 20;
	
	//�ܼƤ��୫�W
	//short a = 1000;
	
	//���T, ���W�Xshort�d��
	//�ҥH���
	short b = 1000;
	
	//���T, �]�q�{�Oint, �åB���W�Xint�d��
	int c = 1000;
	
	//���T, �i�H�۰��ഫ, �p�e�q�ഫ�j�e�q
	long d = c;
	
	//���~, �j������p�����|�����D
	//int e = d;
	
	//�Nlong�j���ഫint����
	//�]����1000, �S���W�Xint�d��, �ҥH�ഫ���T
	int e = (int)d;
	
	//�]java�����B��|�ন�̤j����
	//��10�M3�q�{��int, �ҥH�B��᪺�̤j�����]�Oint
	//�ҥH���T
	int f = 10/3; //3
	
	//�n��10��long����
	long g = 10;
	
	//���~, �h�ӼƭȦb�B��L�{��,�|�ഫ�̤j����
	//�H�U�̤j������double, ��h��int, �ҥH�|�X�{�̤j����(long)��p����(int)
	//int h = g/3;
	
	//�i�H�j���ഫ, �]�����G�S���W�Xint�d��
	//int h = (int)g/3;
	
	//�i�H�ĥ�long�����ӱ����B�⵲�G
	//long h = g/3;
	
	//�Ng�নint, �M��Nint������g�ഫ��byte, �̫�byte������g�M3�B��
	//���������ഫ��int, �ҥHint������ȵ�byte�|�����D
	//byte h = (byte)(int)g/3;
	
	//���T
	//byte h = (byte)(int)(g/3);
	
	//�����ഫ,���u���ת����D
	//byte h = (byte)g/3;
	
	//�i�H�ഫ, �]�����G�S���W�Xbyte�d��
	//byte h = (byte)(g/3);
	
	//�i�H�ഫ, �S���W�Xshort�d��
	//short h = (short)(g/3);
	
	short i = 10;
	short j = 5;
	//���~, short�Mbyte�B��,�����|�নint�����A�B��
	//�ҥH���G��int, int��ȵ�short�|���~
	//short k = i + j;
	
	//�i�H�N�B��j���ഫ��short
	//short k = (short)(i + j);
	
	//�]���B�⵲�G��int, �ҥH�i�H�ĥ�int��������
	int k = i + j;
	char l = 'a';
	System.out.println(l); //a
	//��X��97, a��ascii��
	System.out.println((byte)l); //97
	int m = l + 100;
	//��X��197, a��ascii�ȥ[�W100
	System.out.println(m); //197
	}
}
