/*
 	�ݨD:
 		�P�_��e���Ѯ�:
 			��U�B��:
 			�a�B��:
 				�P�_�ʧO:
 					��ʧO���k: �a�@��j�³�
 					��ʧO���k: �a�@��p���
 			
 			���Ѯ�:
 			�P�_�Ѯ𪺷ū�:
 				��Ѯ�ūצb30�ץH�W: 
 					��ʧO���k: ������
 					��ʧO���k: �����Ψ�
 	
 	����: 1. �@�w�|�Ψ�O�M
 		  2. �Ѯ𪬪p,�ū�,�ʧO���ݭn�q����x��J
 		  		�Ѯ𪬪p: 1��ܤU�B, 0��ܴ���
 		  		�ūת����ϥμƦr�Y�i
 				�ʧO: 1��ܨk, 0��ܤk
 */	
public class IfTest02 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("�w��ϥΥ��t��, �z�L���t�Υi�H�����@��²�檺�P�_");
		System.out.println("�����T��: 1��ܤU�B, 0��ܴ���");
		System.out.println("�����T��: 1��ܨk, 0��ܤk");
		System.out.println("�����T��: �ū׬��Ʀr");
		
		//�����ʧO
		System.out.print("�п�J�ʧO:");
		int sex = s.nextInt();
		
		//�����Ѯ𪺪��p
		System.out.print("�п�J��e�Ѯ𪬪p: ");
		int weather = s.nextInt();
		
		//�P�_�Ѯ𪬪p
		if(weather == 1){
			//�U�B��
		//System.out.println("�U�B��");
			
			if(sex == 1) {
				System.out.println("�a�@��j�³�");
			}else if(sex == 0) {
				System.out.println("�a�@��p���");
			}else {
				System.out.println("�L�k�T�{�ʧO");
			}
		}else if(weather == 0) {
			//����
		//System.out.println("����");
		//�����ū�
		System.out.print("�п�J�ū�:");
		int tem = s.nextInt();
		if(tem > 30) {
			if(sex == 1) {
				System.out.println("������");
			}else if(sex == 0) {
				System.out.println("�����Ψ�");
			}else {
				System.out.println("�L�k�T�{�ʧO");
			}
		}
		
		}else {
			System.out.println("�L�k�T�{�Ѯ�");
		}
	}
}