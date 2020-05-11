import java.util.Random;

/*
	生成隨機數
 */
public class RandomTest01 {

	public static void main(String[] args) {
		
		//創建一個新的隨機數生成器
		Random r = new Random();
		
		//生成一個int隨機數
		//int i = r.nextInt(101); //0~100之間的隨機數
		//System.out.println(i);
		
		for(int i = 0; i<5; i++) {
			System.out.println(r.nextInt(101));
		}

	}
	
}