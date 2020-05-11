
public class EngineTest {
	public static void main(String[] args) {
		
		//生產汽車
		YAMAHA e1 = new YAMAHA(); //多態
		
		
		//生產汽車
		Car01 c = new Car01(e1);
		
		//測試引擎
		c.testEngine();
		
		//轉換HONDA
		c.e = new HONDA();
		
		c.testEngine();
		
	}
}