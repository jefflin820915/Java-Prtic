/*
	�۩w�q�x��
 */
public class GenericTest05 {

	public static void main(String[] args) {
		
		GenericMyClass<String> mc = new GenericMyClass<String>();
		
		//�x���N�O�sĶ���ˬd����
		//Error
		//mc.m1(100);
		
		mc.m1("JACK");
	}
}
//�۩w�q�x��
class GenericMyClass<T>{
	
	public void m1(T t) {
		System.out.println(t);
	}
}