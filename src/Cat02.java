
//貓類
public class Cat02 extends Animal02 {
	
	
	//重寫父類中繼承過來的方法
	public void move() {
		System.out.println("貓在移動");
	}
	
	//不是從父類繼承過來的方法
	//這個方法是子類對象特有的行為[不是說所有的動物都能抓老鼠]
	public void catchMouse() {
		System.out.println("貓抓老鼠");
	}

}
