
public class EngineTest {
	public static void main(String[] args) {
		
		//�Ͳ��T��
		YAMAHA e1 = new YAMAHA(); //�h�A
		
		
		//�Ͳ��T��
		Car01 c = new Car01(e1);
		
		//���դ���
		c.testEngine();
		
		//�ഫHONDA
		c.e = new HONDA();
		
		c.testEngine();
		
	}
}