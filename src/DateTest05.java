import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
	���
 */
public class DateTest05 {

	
	public static void main(String[] args) throws Exception{
		
		//����t�η�e�����
		
		Calendar c = Calendar.getInstance();
		
		//�d�ݷ�e��䪺�P���X
		int i = c.get(Calendar.DAY_OF_WEEK);
		//int i  =  c.get(7);
		
		System.out.println(i); // �P����ݰ��Ĥ@��
	
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //14
		
		//���2008 8 8�O�P���X
		
		//���2008 8 8�����
		String strTime = "2008,08,08";
		Date d = new SimpleDateFormat("yyyy,MM,dd").parse(strTime);
		
		//�Ӥ��N�O2008,08,08�����
		c.setTime(d);
		
		//����P���X
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); //6
	
	}
}
