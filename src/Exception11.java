/*
 * 自定義"無效名字異常"
 * 	1.編譯時異常,直接繼承Exception
 * 	2.運行時異常,直接繼承RunTimeException
 */
public class Exception11 extends Exception{//編譯時異常
	//public class Exception11 extends RunTimeException{	//運行時異常	
	
	
	
	//定義異常一般提供兩個構造方法
	
	
	public Exception11() {

	}

	public Exception11(String msg) {
		super(msg);
	}	

	 
	
	
	
}
