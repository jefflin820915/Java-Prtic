/*
	�ݨD: �w�q�@�Ӥ�k, �Ӥ�k���@�άO�p����int�����ƾڪ���
	�p�G�p�⦨�\,�h�Ӥ�k��^1,�p�G�p�⥢�Ѫ�^0
	
	�{�ǰ��榨�\, ���O�����I
	
	�{�Ǥ����D��b�sĶ���q�ѨM,�N���|���B����ѨM,�ҥH�H�U�{�ǥi�H�ޤJ"�T�|����" 
 */
public class EnumTest01 {

	//�J�f
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int retValue = divide(a, b);
		
		if(retValue==1) {
			System.out.println("���\");
		}else if(retValue==0) {
			System.out.println("����");
		}
		
	}
	
	//��{�ݨD
	public static int divide(int a,int b) {
		
		try {
			
			int c = a / b;
			return 1; //���\
			
		} catch (Exception e) {
			return 0; //����
		}
		
		
	}


}
