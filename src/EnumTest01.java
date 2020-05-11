/*
	需求: 定義一個方法, 該方法的作用是計算兩個int類型數據的商
	如果計算成功,則該方法返回1,如果計算失敗返回0
	
	程序執行成功, 但是有風險
	
	程序中問題能在編譯階段解決,就不會放到運行期解決,所以以下程序可以引入"枚舉類型" 
 */
public class EnumTest01 {

	//入口
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int retValue = divide(a, b);
		
		if(retValue==1) {
			System.out.println("成功");
		}else if(retValue==0) {
			System.out.println("失敗");
		}
		
	}
	
	//實現需求
	public static int divide(int a,int b) {
		
		try {
			
			int c = a / b;
			return 1; //成功
			
		} catch (Exception e) {
			return 0; //失敗
		}
		
		
	}


}
