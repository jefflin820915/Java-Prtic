/*
	��������������M�����f
 */
public class ReflectTest10 {

	//�q�L�Ϯg�������String���������M�����f
	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("java.lang.String");
		
		//�������
		Class superClass = c.getSuperclass();
		
		System.out.println(superClass.getName());
		
		//��������f
		Class[] ins = c.getInterfaces();
		
		for(Class in:ins) {
			System.out.println(in.getName());
		}
	}
}
