/*
 ����java�y��������k
 	
 	1. ��k���w�q, �y�k���c:
 		
 		[�׹��ŦC��]	��^������	��k�W (�Φ��ѼƦC��){
 			��k��;
 		}
 	
 	2. ��H�W���y�k���c�i���������:
 	
 		2.1. ����׹��ŦC��
 			�i�ﶵ,  ���O������
 			
 			�ثe�Τ@�g��: public static
 			��k���׹��ŦC�����static����r����, ��򱼥γo�Ӥ�k?
 				���W.��k�W(��ڰѼƦC��) ;
 		
 		2.2. ��^������
 			
 			�ƻ�O��^��
 				�@�Ӥ�k�i�H�����Y�ӯS�w�\�઺, �o�ӥ\�൲���j�h�Ƴ��O�ݭn
 				��^�̲װ��浲�G, ���浲�G�i��O�@�Ө���s�b���ƾ�. �ӳo�Ө���
 				�s�b���ƾڴN�O��^��,
 			
 			 ��^������
 			 	��^�ȬO�@�Ө���s�b���ƾ�, �ƾڳ��O��������, ���B�ݭn���w���O��^��
 			 	����������.
 			 
 			 ��^���������i�H���w��������
 			 	java���@���������i�H, �]�A�򥻼ƾ������M�Ҧ����ޥμƾ�����
 			
 			 �]�i��o�Ӥ�k���浲���ᤣ��^����ƾ�, java���W�w, ��@�Ӥ�k���浲��
 			 ����^����ƾڪ���, ��^��������m�����s�gvoid����r
 			 
 			 ��^�������i�H�O:
 			 	byte,short,int,long,float,double,boolean,char,String,void....
 			 	
 			 ��^�������Y���Ovoid, ��ܳo�Ӥ�k���浲�����ᥲ����^�@�Ө���ƭ�.
 			 ���k���浲����S����^����ƾڪ���, ����. ����^��
 			 "return ��; ", �åB�n�D"��"���ƾڥ����M"��k����^�������@�P, ���M����.
 			 
 			 ��^�������Ovoid���ɭ�, �b��k�������s�g"return ��; "�o�˪��y�y, �i�H�s�g
 			 "return;"�o�˪��y�y
 			 
 			 �u�n�a��return����r���y�y����, return�y�y�Ҧb����k����. [���OJVM����, �O�Ҧb����k����]
 				
 		2.3 ��k�W:
 			�u�n�O�X�k���лx��
 			��k�W�̦n���W���N
 			��k�W�̦n�O�ʵ�
 			��k�W���r���n�D�p�g, �᭱�C�ӳ�r���r���j�g
 			
 		2.4  �Φ��ѼƦC��, ²�٧ΰ�
 				�ΰѬO�����ܼ�: int a; double b; float c; String s; .....
 				�ΰѪ��Ӽƥi�H�O: 0~N��
 				�h�ӧΰѤ�����"�r��" �j�}
 				�ΰѤ��_�M�w�ʧ@�Ϊ��O�ΰѪ��ƾ�����, �ΰѪ��W�r�N�O�����ܼƪ��W�r.
 				��k�b�եΪ��ɭ�, ��ڵ��o�Ӥ�k�ǻ����u��ƾڳQ�٬�: ��ڰѼ�, ²�ٹ��
 				��ѦC��M�ΰѦC��������:
 					�ƶq�ۦP
 					���������ۦP
 			  �Ҧp:
 			  	public static int sum(int a,int b){ //(int a,int b)�O�ΰѦC��
 			  	}
 			  	��k�ե�
 			  	sum("abc","def"); ����
 			  	sum(10,20); �q�L //(10,20)�O��ѦC��
 		
 		2.5 ��k�饲���Ѥj�A���A�_��, ��k������N�X������, ��`�ۤW�ӤU�����Ǩ̦�����,
 		�åB��k���java�y�y�c��, �C��java�y�y�H��������
 
 	3. ��k���ե�
 		��k�u�w�q���h�եήɤ��|���檺, �u���b�եΪ��ɭԤ~�|����
 		�y�k�W�h:	 <��k���׹��ŦC�����static>
 			���W.��k�W(��ѦC��);  <�o�O�@��java�y�y, ��ܽեάY�������Y�Ӥ�k�ǻ��o�˪��Ѽ�>
 
 
 */
//public ���}��
//class ��ܩw�q��
//MethodTest02�O�@�����W
public class MethodTest02 {	//��ܩw�q�@�Ӥ��}����, �_�WMethodTest02, �ѩ�O���}����, �ҥH����W�����O: MethodTest02.java
	
	//����
	//���餤���ઽ���s�gjava�y�y, ���n���ܼƤ��~
	//�����k�X�{�b�����
	
	//��k
	//public ���}��
	//static �R�A��
	//void��ܤ�k���浲���ᤣ��^����ƾ�
	//main �O��k�W: �D��k
	//(String[] args): �Φ��ѼƦC��, �䤤String[]�O�@�ؤޥ�����, args�O�@�ӧ����ܼƪ��ܼƦW
	//�ҥH�H�U�u��args�o�ӧ����ܼƪ��ܼƦW�O�H�N��
	//main�D��k�N�ݭn�o�˩T�w�s�g, �o�O�{�Ǫ��J�f
	public static void main(String[] args) {
		
		//�o�̪��{�ǬO�@�w�|���檺
		//main��k�OJVM�t�d�ե�, �O�@�ӤJ�f��m
		//�q�o�̰����@�Ӱ_�I�}�l����{��
		//�J�M�O�o��, �ڭ̥i�H�b�o�̽s�gjava�y�y�ӽեΨ�L��k
		//�եΤ�k�M�y�k
		//�ե�MethodTest02��sum��k,  �ǻ���ӹ��
		
		
		MethodTest02.sum(10, 20); //(10, 20) ��ѦC�� [��ڤW�����o��main��k�Ȱ��F, �i�Jsum��k����, sum��k���浲��������main��k����107�浲��]
		
		//�`�N: ��k�餤���N�X�O������, ��`�ۤW�ӤU�����Ǩ̦�����
		//��107�檺�{�ǰ��椣����, �L�k������108�檺�{��.
		
		//�@�Ӥ�k�i�H�Q���ƽե�
		int a =100;
		MethodTest02.sum(a,500); //(a,500) ��ѦC��
		
		//�A���եΤ�k
		int k = 90;
		int f = 10;
		MethodTest02.sum(k, f); //(k,f) ��ѦC��
	}
	
	//�۩w�q��k, �D�{�ǤJ�f
	//��k�@��: �p����int�����ƾڪ��M, ���n�D��^���G, ���O�n�D�N���G������X�챱��x
	//�׹��ŦC��: public static
	//��^������: void
	//��k�W: sum
	//�Φ��ѼƦC��: (int x,int y)
	//��k��: �D�n���ȬO�D�M�����X�p�⵲�G
	public static void sum(int x,int y) { //(int x, int y)�ΰѦC��
		System.out.println(x + "+" + y + "=" + (x + y));
		
	}

}