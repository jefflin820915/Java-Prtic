/*
 *  �ܼ�
 	�ܼƥ���W�O���x�����@���Ŷ�, �o���Ŷ����ƾ�����, ���W�r, ���r����
 	�ܼƥ]�t�T����: �ƾ�����,�W��,�r����[�ƾ�]
 	�ܼƬO���s���s�x�ƾڪ��̰򥻳椸
*�ƾ�����
	���P���ƾڥѤ��P������,���P���ƾ��������h�|���t���P�j�p���Ŷ�
	�ƾ������O���ɵ{�Ǧb�B�涥�q���Ӥ��t�h�j�����s�Ŷ�
*�ܼƭn�D:�ܼƤ��s�x�����骺"�ƾ�"�����M�ܼƪ��ƾ������@�P,���@�P��,����
*�n��/�w�q�ܼƪ��y�k�榡:
	�ƾ����� �ܼƦW;
		�ƾ�����: 
			int
		�ܼƦW:
		 	�u�n�O�X�k�����Ҳ�,�W�d���n�D: ���r���p�g, �᭱�X�ӳ�r���r���j�g
		 	ex: 
		 		int i;
		 		int age;
		 		int length;
		 		int size;
		 		int num;
		 		�䤤int�O�ƾ�����,  i,age,length,size,num,�ݩ��ܼƦW
*�ܼ��n���p����
	�y�k�榡:
		�ܼƦW = �r����;
		�n�D:�r���Ȫ��ƾ����������M�ܼƪ��ƾ������@�P
		=  �����O�@�ӹB���, ��ȹB���, ��ȹB��ť��B�ⵥ���k�䪺��F��, ��F�����浲���᪺���G��ȵ����䪺�ܼ�
*�n���M��ȥi�H���@�_����
	int i = 10;
*�ܼƽ�Ȥ���, �i�H���s���, �ܼƪ��ȥi�ܤ�;
	int i = 10;
	System.out.println(i); //10
	i = 20;
	System.out.println(i); //20
	i = 100;
	System.out.println(i); //100
*���F�ܼƪ���������,���s�Ŷ��o�쭫�ƪ��ϥ�:
	int i = 10
	System.out.println(i);
	...
	....
	System.out.println(i);
*�q�`�X�ݤ@���ܼƥ]�A��سX�ݧΦ�:
	Ū���ܼƤ��O�s������ƾ� get/���
	�ק��ܼƤ��O�s������ƾ� set/�]�m
	i = 20; //set
	System.out.println(i); //get
*�ܼƦb�@��W�i�H�n���h��
	int a,b,c;
*�ܼƥ������n��,�A���,�~��X��	
*/
public class VariableTest {
	public static void main (String[] args) {
		
		int i; //�n���@��int�����ܼ�, �_�Wi
		
		/*System.out.println(i); ����, �ܼ�i�|����l��*/
		
		i = 100; //��i�ܼƽ��, �b�o��i��l��
		System.out.println(i);
		
		i = 200; //i�A�����
		System.out.println(i);
		
		//�@��W�i�H�P���n���h���ܼ�
		
		
		int a,b,c = 300;  //����, a�Mb�|����l�� , c���300
		/*System.out.println(a);
		System.out.println(b); ����  */
		System.out.println(c);
		
		a = 0;
		b = 1;
		System.out.println(a);
		System.out.println(b);
	}
}