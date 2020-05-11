import java.text.DecimalFormat;

/*
	����Ʀr�榡��: java.text.DecimalFormat
	
		�Ʀr���榡����:
			#	���N�Ʀr
			,	�d����
			.	�p���I
			0	������0
 */
public class NumberTest01 {

	public static void main(String[] args) {
		
		//1. �ЫؼƦr�榡�ƹ�H
		//�ݨD:	�[�J�d����
		DecimalFormat df = new DecimalFormat("###,###");
		
		//�}�l�榡��
		//Number -> String
		System.out.println(df.format(1234567)); //"1,234,567"
		
		//�ݨD: �[�J�d����,�O�d2��p��
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		
		System.out.println(df1.format(1234567.123)); //1,234,567.12		
		
		
		//�ݨD: �[�J�d����,�O�d4��p��,�åB������0
		
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		
		System.out.println(df2.format(1234567.123)); //1,234,567.1230
	}
	
}
