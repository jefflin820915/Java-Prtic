/*
 * ����Object����toString��k:
 * 		SUN�bObject�����]�ptoString��k���ت�: ��^java��H���r�Ŧ��ܧΦ�.
 * 
 * 		//�b�{�ꪺ�}�o�L�{��,Object�̭���toString��k�w�g�����ΤF
 * 		�]��Object��toString��k��{�����G�����N
 * 
 * 		Object����toString��k�N�O�n�Q���g��
 * 
 * 		SUN�O�o�˹�{toString��k��:
 * 		public String toString(){
 * 
 * 			return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 		}
 * 
 * 		Object����toSrring��k��^:	���W@java��H�����s�a�}�g�L���ƺ�k�o�X��int�����ȦA�ഫ���Q���i��.
 * 		�o�ӿ�X���G�i�H���P��ݰ�java��H�b�襤�����s�a�}
 */
public class ToString {
	public static void main(String[] args) {
	
		//�Ыؤ@��Object��������H
		Object o1 = new Object();
	
		//�ե�toString��k
		String oStr = o1.toString();
		
		System.out.println(oStr);//java.lang.Object@15db9742
	
		
		//�Ыؤ@��Person��������H
		
		Person p1 = new Person("123", 45);
		
		//�ե�toString��k
		
		String pStr = p1.toString();
		System.out.println(pStr); //Person[name="+name+", age="+age+"]
		
		Person p2 = new Person("�d�W", 50);
		
		System.out.println(p2.toString()); //Person[name=�d�W, age=50]
		
		
		//print��k���᭱�A�����p�G�O�@�Ӥޥ�����,�|�q�{�եΤޥ�������toString��k
		System.out.println(p2); //Person[name=�d�W, age=50]
	
	
	}
}

class Person{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
}
	
	//���gtoString��k
	//�ھڶ��ت��ݨD�өw
	//�ݨD�W�w,��ܮ榡:Person[name=�B�w��, age=50]
	public String toString() {
		return "Person[name="+name+", age="+age+"]";
		
	}


}
