import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
	java.lang.reflect.Method; 
 */
public class ReflectTest06 {

	public static void main(String[] args) throws Exception{
		
		//�����
		Class c = Class.forName("CustomerService02");
		
		//����Ҧ���k
		Method[] ms = c.getDeclaredMethods();
		
		/*
		for(Method m:ms) {
			
			//�׹���
			System.out.println(Modifier.toString(m.getModifiers()));
			
			
			//��k����^������
			Class returnType = m.getReturnType();
			System.out.println(returnType.getSimpleName());
			
			//��k�W
			System.out.println(m.getName());
		
			//��k���Φ��Ѽ�
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType:parameterTypes) {
				System.out.println(parameterType.getSimpleName());
			}
		
		}
		*/
		
		//�ϽsĶ
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class ");
		sb.append(c.getSimpleName()+"{\n");
		for(Method m:ms) {
			sb.append("\t");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");
			sb.append(m.getName()+"(");
			
			//�ΰ�
			Class[]  parameterTypes = m.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				Class parameterType = parameterTypes[i];
				if(i==parameterTypes.length-1) {
				sb.append(parameterType.getSimpleName());
				}else {
				sb.append(parameterType.getSimpleName()+",");
			}
		}
			sb.append("){}\n");
		
		
	}
		
		
		
		sb.append("}");
		
		System.out.println(sb);
	} 
}