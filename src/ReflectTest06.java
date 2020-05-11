import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
	java.lang.reflect.Method; 
 */
public class ReflectTest06 {

	public static void main(String[] args) throws Exception{
		
		//獲取類
		Class c = Class.forName("CustomerService02");
		
		//獲取所有方法
		Method[] ms = c.getDeclaredMethods();
		
		/*
		for(Method m:ms) {
			
			//修飾符
			System.out.println(Modifier.toString(m.getModifiers()));
			
			
			//方法的返回值類型
			Class returnType = m.getReturnType();
			System.out.println(returnType.getSimpleName());
			
			//方法名
			System.out.println(m.getName());
		
			//方法的形式參數
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType:parameterTypes) {
				System.out.println(parameterType.getSimpleName());
			}
		
		}
		*/
		
		//反編譯
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class ");
		sb.append(c.getSimpleName()+"{\n");
		for(Method m:ms) {
			sb.append("\t");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");
			sb.append(m.getName()+"(");
			
			//形參
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