public class Decorator_B extends Decorator_A{

	//重寫方法, 注意, 在原代碼的基礎之上擴展
	public void m1() {
		System.out.println("擴展代碼1");
		super.m1();
		System.out.println("擴展代碼2");
	};
}
