

public class Test06 {
	public static void main(String[] args) {
		
		//父類型引用指向子類型對象
		//向上轉型
		Animal02 a = new Cat02();
		Animal02 a2 = new Bird02();
		
		
		//向下轉型[只有當訪問子類對象當中特有的方法]
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
