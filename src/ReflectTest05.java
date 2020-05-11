import java.lang.reflect.Field;

/*
	java.lang.reflect.Field; ����Y�ӫ��w���ݩ�
	
 */
public class ReflectTest05 {

	public static void main(String[] args) throws Exception{
		
		/*
		//�H�e���覡
		ReflectTest04_User u = new ReflectTest04_User();
		u.age = 12; //set
		System.out.println(u.age); //get
		*/
		
		
		//�����
		Class c = Class.forName("ReflectTest04_User");
		
		//����Y�ӯS�w��
		Field idF = c.getDeclaredField("id"); 
		
		
		//�����Y�ӯS�w���ݩʥi�H�Ψ� set, get
		Object o = c.newInstance();
		
		//���}�ʸ�
		idF.setAccessible(true); //�ϥΤϮg����i�H���}�ʸ˩�, �ɭPjava��H���ݩʤ��w��
		
		
		//��o��H��id�ݩʽ��"110"
		idF.set(o, "110"); //set
		
		//get
		System.out.println(idF.get(o));
	}
}
