
public class EnumTest02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		Result retValue = divide(a, b);
		
		if(retValue==Result.SUCCESS) {
			System.out.println("成功");
		}else if(retValue==Result.FAIL) {
			System.out.println("失敗");
		}
		
	}
	
	//實現需求
	public static Result divide(int a,int b) {
		
		try {
			
			int c = a / b;
			return Result.SUCCESS; //成功
			
		} catch (Exception e) {
			return Result.FAIL; //失敗
		}
			
	}
}
	//定義一個枚舉類型
enum Result{
		
		//成功和失敗
		//規範要求: 大寫
		SUCCESS,FAIL	//有限的
}

//四季
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}

//顏色
enum Color{
	BLUE,RED,GREEN
}