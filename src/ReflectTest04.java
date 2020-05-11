import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
	java.lang.reflect.Field; �������ݩ�
	
 */
public class ReflectTest04 {

	public static void main(String[] args) throws Exception{
		
		//��������
		Class c = Class.forName("ReflectTest04_User");
		
		//����ݩ�Field
		/*
		//����Ҧ�public�׹����ݩ�
		Field[] fs = c.getFields();
		System.out.println(fs.length);
		System.out.println(fs[0].getName());
		*/
		
		//����Ҧ����ݩ�
		
		Field[] fs = c.getDeclaredFields();
		/*
		for(Field field:fs) {
			
			int i  = field.getModifiers();
			//System.out.println(i);
			String strModifier =  Modifier.toString(i);
			System.out.println(strModifier);
			
			Class type = field.getType();
			//System.out.println(type.getName());
			System.out.println(type.getSimpleName());
			
			System.out.println(field.getName());
		}
		*/
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+"Class"+c.getSimpleName()+"{\n");
		
		for(Field field:fs) {
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers())+" ");
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+"\n");
		}
		sb.append("}");
		System.out.println(sb);
	
	}
}
