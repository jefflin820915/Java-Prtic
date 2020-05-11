
//鳥類
public class Bird02 extends Animal02{
	
	//重寫從父類中繼承過來的方法
	public void move() {
		System.out.println("鳥在飛翔");
	}
	
	//子類對象特有的行為/動作
	public void fly() {
		System.out.println("Bird fly");
	}

}
