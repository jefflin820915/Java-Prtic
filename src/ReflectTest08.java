import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
	����c�y��k
 */
public class ReflectTest08 {

	public static void main(String[] args) throws Exception{
		
		//1. �����
		Class c = Class.forName("java.lang.String");
		
		//2.����Ҧ����c�y
		Constructor[] cs = c.getDeclaredConstructors();
		
		/*
		for(Constructor con:cs) {
			
			//����׹���
			System.out.println(Modifier.toString(con.getModifiers()));
			
			//����c�y��k�W
			System.out.println(con.getName());
		
			//�c�y��k���Φ��Ѽ�
			Class[] parameterTypes = con.getParameterTypes();
			for(Class pameterType:parameterTypes) {
				System.out.println(pameterType.getSimpleName());
				
			}
		}
		*/
		
		//�ϽsĶ
		StringBuffer sb = new StringBuffer();
		
		//�����׹���
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//�c�y��k
		for(Constructor con:cs) {
			sb.append("\t");
			
			sb.append(Modifier.toString(con.getModifiers()) +" ");
			
			sb.append(c.getSimpleName()+"(");
			
			//�ΰ�
			Class[] parameterTypes = con.getParameterTypes();
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
