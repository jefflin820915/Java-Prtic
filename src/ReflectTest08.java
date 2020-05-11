import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
	獲取構造方法
 */
public class ReflectTest08 {

	public static void main(String[] args) throws Exception{
		
		//1. 獲取類
		Class c = Class.forName("java.lang.String");
		
		//2.獲取所有的構造
		Constructor[] cs = c.getDeclaredConstructors();
		
		/*
		for(Constructor con:cs) {
			
			//獲取修飾符
			System.out.println(Modifier.toString(con.getModifiers()));
			
			//獲取構造方法名
			System.out.println(con.getName());
		
			//構造方法的形式參數
			Class[] parameterTypes = con.getParameterTypes();
			for(Class pameterType:parameterTypes) {
				System.out.println(pameterType.getSimpleName());
				
			}
		}
		*/
		
		//反編譯
		StringBuffer sb = new StringBuffer();
		
		//類的修飾符
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		//構造方法
		for(Constructor con:cs) {
			sb.append("\t");
			
			sb.append(Modifier.toString(con.getModifiers()) +" ");
			
			sb.append(c.getSimpleName()+"(");
			
			//形參
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
