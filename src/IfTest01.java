/*
   �ݨD: 
   	 ���]�t�ε��w�@�ӤH���~��(�o�Ӧ~�ֻݭn�q��L��J),�ھڦ~�֨ӧP�_�o�ӤH�ݩ�ͩR�����Ӷ��q, �~�֥����b[0-150]
   	 
   	 [0-5] ����
   	 [6-10] �֨�
   	 [11-18] �֦~
   	 [19-35] �C�~
   	 [36-55] ���~
   	 [56-150] �Ѧ~

*/
public class IfTest01 {
	public static void main(String[] args) {
		
		//1.������L��J: �~��[��J���ɭԥ�����J�Ʀr]
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�п�J�~��:"); //��X���ܰT��, �n���M�Τᤣ���D�o�̭n�F��.
		int age = s.nextInt(); //���U�ӵ��ݥΤ��J, ��J����۰ʱ���, ��ȵ�age�ܼ�.
		System.out.println("age = " + age);
	
		//2. �ھڻݨD�i��~���޿�P�_
		String str = "�A�B��ͩR�g�����Ѧ~���q";
		if(age < 0 || age > 150) {
			str = "�A��J���~�ֶW�X�d��";
		}else if(age <= 5){
			str = "�A�B��ͩR�g�������ඥ�q";
		}else if(age <= 10) {
			str = "�A�B��ͩR�g�����֨ඥ�q";
		}else if(age <= 18) {
			str = "�A�B��ͩR�g�����֦~���q";
		}else if(age <= 35) {
			str = "�A�B��ͩR�g�����C�~���q";
		}else if(age <= 55) {
			str = "�A�B��ͩR�g�������~���q";
		}
		System.out.println(str);
	}
}
