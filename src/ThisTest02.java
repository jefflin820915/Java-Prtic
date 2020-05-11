/*
 * 在帶有static的方法當中不能直接調用實例變數的方法
 * 因為實例變數和實例方法都需要對象的存在
 * 而static方法當中是沒有this的,也就是說當前對象是不存在的,
 * 自然也無法訪問當前對象的實例變數和實例方法
 */
public class ThisTest02 {
	
	//帶有static
	//主方法
	public static void main(String[] args) {

		//調用doSome方法
		ThisTest02.doSome();
		
		//調用doSome方法
		doSome();
		
		//調用doOther方法
		//[編譯錯誤]
		//實例方法必須先創建對象,通過引用.的訪問
		//ThisTest02.doOther();
		
		//doOther是實例方法
		//實例方法調用必須有對象的存在
		//以下代碼表示的含意:調用當前對象的doOther方法
		//但是main方法中沒有this,所以以下方法不能調用
		//doOther();
		//this.doOther();
		
		ThisTest02 tt = new ThisTest02();
		tt.doOther();
		
		tt.run();
	}
	
	//帶有static
	public static void doSome() {
		System.out.println("do Some");
	}

	//實例方法
	public void doOther() {
		//this表示當前對象
		System.out.println("do Other");
	
	}
	
	
	//實例方法
	public void run() {
		//run是實例方法,調用run方法的一定是有對象存在的
		//一定是先創建了一個對象才能調用run方法
		//在大括號中的代碼執行過程當中一定是存在當前對象的
		//也就是說這裡一定有"this"的
		System.out.println("run execute");
		
		//doOther方法是一個實例方法,實例方法調用必須有對象的存在
		//以下代碼的含意就是:調用當前對象的doOther方法
		doOther();
		//this.doOther(); 較完整寫法
	}









}
