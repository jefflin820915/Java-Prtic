/*
 * �G���k�d��
 *  	1. �G���k�d��O�إߤw�g�ƧǪ���¦���W��
 *  	2. �w�U�{�Ǥ��R�q�p��j�Ƨ�
 *  	3. �o�ӼƲդ��S�����ƪ�����
 *  
 *  	1 3 5 9 11 13 56
 *  
 *   	�H�W�w�g�O�Ʀn�Ǫ�int�������Ʋ�, �n�D�ֳt��X13�o�Ӥ������U��.
 
 *		int begin = 0;
 *		int end = 6;
 *		int mid = 3;
 *		���������O9, 9<13
 *
 *		begin = mid + 1 ;  4
 *		end = 6;
 *		mid = 5;
 *		���������O13, 13==13
 *
 */
public class MyArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,4,5,7,8,9,10,23,25,29};
		
		int destElement = 10;
		  
		//�n�D�qa�Ʋդ��d��10�o�Ӥ������U��
		int index = binarySearch(a,destElement); //�p�G���h��^�������U��, �p�G�䤣��Τ@��^ -1
		
		System.out.println((index==-1)? destElement + "�������s�b" : destElement+"�b�Ʋդ����U�ЬO" + index);
	}
	
	//��b�d���k�֤ߺ�k
	private static int binarySearch(int[] a, int destElement) {
		
		int begin = 0;
		int end = a.length-1;
		
		
		
		while (begin <= end) {
			
			int mid =(begin + end)/2;
			
			if (a[mid]==destElement) {
				return mid;
			}else if(a[mid]>destElement) {
				end = mid - 1;
				
			}else if(a[mid] < destElement) {
				begin = mid + 1;
			}
		}
		return -1;
	}
}
