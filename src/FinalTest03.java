
public class FinalTest03 {
	public static void main(String[] args) {
		
		//創建用戶對象
		User06 u = new User06(100); //User06 u = 0x1234;
		
		//又創建一個新User對象
		//程序執行到此處表示以上對象以變成垃圾數據,等待垃圾回收器回收
		u = new User06(200); // User06 u = 0x4557
		
		//創建用戶對象
		final User06 user = new User06(30);
			//user = new User06(50);//final修飾的引用,一旦指向某個對象之後,不能再指向其他對象,那麼被指向的對象無法被垃圾回收器會收.
			
			System.out.println(user.id);
			
			user.id = 50;// final修飾的引用雖然指向某個對象之後不能指向其他對象,但是所指向的對象內部的內存是可以修改的.
			
			System.out.println(user.id);
	
	
	
	} 
}
