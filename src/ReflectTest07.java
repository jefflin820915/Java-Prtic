
import java.lang.reflect.Method;

/*
	����Y�ӯS�w����k, �q�L�Ϯg�������
	
	�H�e:
		CustmerService cs = new CustmerService();
		boolean isSuccess = cs.login("admin",123);
		
	�q�L�Ϯg����
	
	
 */
public class ReflectTest07 {

	public static void main(String[] args) throws Exception{
		
		//1. �����
		Class c = Class.forName("CustomerService02");
		
		//2. ����Y�ӯS�w����k
		//�q�L: ��k�W+�ΰѦC��
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//�q�L�Ϯg�������login��k
		Object o = c.newInstance();
		
		//�ե�o��H��m��k, �ǻ�"admin""123"�Ѽ�, ��k�����浲�G�OretValue
		Object retValue = m.invoke(o, "admin","123");
		
		System.out.println(retValue); //true
	}
}
