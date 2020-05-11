 /*
 * 1.如何定義抽象類?
 * 		class關鍵字前加abstract
 * 
 * 2. 抽象類無法被實例化
 * 
 * 3. 雖然抽象類沒有辦法實例化, 但是抽象類也有構造方法
 * 
 * 4. 抽象類中可以定義抽象方法.
 * 		抽象方法的語法: 在方法的修飾符列表中添加abstract關鍵字,並且抽象方法應該以";"結束,不能帶有"{}"
 * 		例如: public abstract void m1();
 * 
 * 5. 抽象類中不一定有抽象方法,但抽象方法必須出現在抽象類中
 * 
 * 6. 一個非抽象的類繼承抽象類,必須將抽象類中的抽象方法實現/覆蓋/重寫
 */
public abstract class Abstract {
	
	//Construotor
	Abstract() {
		System.out.println("123");
	}
	
	//抽象方法
	public abstract void m1();
	
	//入口
	public static void main(String[] args) {
		
		//抽象類無法創建對象
		//Abstract a = new Abstract();
		
		//多態
		Abstract a = new K();
		
	}
}

class K extends Abstract{
	
	public void m1() {
		
	} 
	
	K(){
		super();//父類的構造方法雖然調用了,但是並沒有創建父類對象
		System.out.println("321");
	}
}