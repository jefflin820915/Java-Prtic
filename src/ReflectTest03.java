import java.text.SimpleDateFormat;
import java.util.Date;

/*
	���Class��������H����, �i�H�Ыظ�"��"����H
 */
public class ReflectTest03 {

	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("Employee");
		
		//�Ыئ�Class��H�Ҫ�ܪ������@�ӷs���
		 
		Object o = c.newInstance(); //�ե�Employee���L�Ѽƺc�y��k
		
		System.out.println(o); //Employee@15db9742
	
		Class c1 = Class.forName("java.util.Date");
		Object o1 = c1.newInstance();
		
		if(o1 instanceof java.util.Date) {
			Date t = (Date)o1;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:ss SSS").format(t));
		}
	
	}
}
