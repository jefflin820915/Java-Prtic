/*
	
 */
public class ReflectTest02 {

	public static void main(String[] args) throws Exception{
		
		//�NA.class���˸���JVM�����L�{
		Class.forName("A01");
	
		//���|�����R�A�y�y��
		//Class c = A01.class;
	
		A01 a = new A01();
		
		Class c = a.getClass();
		
	}
}

class A01{
	
	static {
		System.out.println("A01....") ;
	}
	
}

