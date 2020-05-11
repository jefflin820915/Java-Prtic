import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.tools.JavaCompiler;

/*
	����S�w�����
 */
public class DateTest03 {

	public static void main(String[] args) throws Exception {
		
		 String strTime = "2008�~08��08�� 08:08:08 888";
		 
		 //�NString ����ഫ���������Date
		 //String -> Date
		 
		 //1. �Ыؤ���榡�ƹ�H
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy�~MM��dd�� HH:mm:ss SSS"); //�榡�����H�N, ���өM�W�����r�Ŧ�榡�ۦP
		 
		 //2. �N�r�Ŧ��ഫ���������
		 java.util.Date t = sdf.parse(strTime);
		 System.out.println(t); // Fri Aug 08 08:08:08 CST 2008
	
	}
}
