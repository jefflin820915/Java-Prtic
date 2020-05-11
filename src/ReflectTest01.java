import java.util.Date;

/*
	���Class������H���T�ؤ覡
 */
public class ReflectTest01 {

	public static void main(String[] args) throws Exception{
		
		//�Ĥ@�ؤ覡:
		Class c1 = Class.forName("Employee"); //c1�ޥΫO�s���s�a�}���V�襤����H, �ӹ�H�N���OEmployee,class�����
		
		//�ĤG�ؤ覡:
		//java���C���������� class �ݩ�.
		Class c2 = Employee.class;
		
		//�ĤT�ؤ覡:
		//java�y��������@��java��H���� getClass ��k
		Employee e = new Employee();
		Class c3 = e.getClass(); //c3�O�B����� (e���B������OEmployee)
		
		//�]��Employee�o�����bJVM���u���@��, �ҥHc1,c2,c3�����s�a�}�O�ۦP��, ���V�襤�ߤ@���@�ӹ�H
		System.out.println(c1==c2); //true
		System.out.println(c2==c3); //true
		
		//c4 c5 c6���N��Date�o����	
		Class c4 = Date.class; //c4�N�� Date�o����
		
		Class c5 = Class.forName("java.util.Date"); //�����g�����W, �����W�a���]�W
		
		Date d = new Date();
		Class c6 = d.getClass();
		
		System.out.println(c4==c5); //true
		System.out.println(c5==c6); //true
		
		//c7�N�� int����
		Class c7 = int.class;
	}
}