import java.math.BigDecimal;

/*
	java.math.BigDecimal
		���������ƾں�T�׷����A�X���]�ȳn��.
		
		�]�ȳn�餤double������T�פӧC
 */
public class NumberTest02 {

	public static void main(String[] args) {
		
		//�Ыؤj�ƾ�
		BigDecimal v1 = new BigDecimal(10);
		BigDecimal v2 = new BigDecimal(20);
		
		//���[�k�B��
		//v1,v2//���~:��Ӥޥ��������వ�[�k�B��
		
		//�����եΤ�k����[�k�B��
		BigDecimal v3 = v1.add(v2);		
		
		System.out.println(v3); //30
	
	}
}
