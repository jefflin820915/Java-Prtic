
public class ForTest02 {
	public static void main(String[] args) {
		
		//輸出1~10所有奇數
		for (int i = 1; i <= 10; i+=2) {
			System.out.println("i --->" + i); // 1 3 5 7 9
		}
		
		for(int i = 2; i <= 10; i+=2) {
			System.out.println("i ====>" + i); //2 4 6 8 10
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i --> " + i); //10 9 8 7 6 5 4 3 2 1 
		}
		
		for(int i = 100; i >= 50; i -= 10) {
			System.out.println("i==> " + i); //100 90 80 70 60 50
		}
		
		for(int i = 1; i<10;) {
			System.out.println("i======> " + i); // 1 2 3 4 5 6 7 8 9 
			i++;
		}
	
		for(int i = 1; i<10;) {
			i++;
			System.out.println("i======> " + i); //1 2 3 4 5 6 7 8 9 10
		}
	
	}

}
