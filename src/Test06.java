

public class Test06 {
	public static void main(String[] args) {
		
		//�������ޥΫ��V�l������H
		//�V�W�૬
		Animal02 a = new Cat02();
		Animal02 a2 = new Bird02();
		
		
		//�V�U�૬[�u����X�ݤl����H���S������k]
		if(a instanceof Cat02) {
			Cat02 c = (Cat02)a;
		c.catchMouse();
		}
		if(a2 instanceof Bird02) {
			Bird02 b = (Bird02)a2;
			b.fly();
		}
		
	}
}
