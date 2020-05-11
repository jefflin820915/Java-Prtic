import java.text.SimpleDateFormat;

/*
	����t�η�e�ɶ�
 */
public class DateTest02 {

	public static void main(String[] args) {
		
		//����t�η�e�ɶ�
		java.util.Date nowTime = new java.util.Date();
		
		System.out.println(nowTime); //Mon Jan 13 16:32:09 CST 2020
		
		//�H�W�{�ǻ����Fjava.util.Date;�w�g���g�FObject����toString��k
		//�u���L���g�����G�O�^��
		
		//�ҥH�ޤJ"�榡��"���
		//java.util.Date; -> String
		
		/*
			����榡:
				Y	�~
				M	��
				d	��
				H	�p��
				m	��
		 		s	��
		 		S	�@��
		 		
		*/
		//1. �Ыؤ���榡�ƹ�H
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�~MM��dd�� HH:mm:ss SSS");
		
		//2. �}�l�榡��(Date -> String)
		String strTime = sdf.format(nowTime);
		
		System.out.println(strTime); //2020�~01��13�� 17:11:12 520

		
	}
}
