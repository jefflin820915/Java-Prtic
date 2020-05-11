/*
 * 異常處理機制時程序更加健壯
 */
public class ExcaptionTest02 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		if(b!=0) {
			int c = a/b;
			System.out.println(a+"/"+b+"="+c);
			
		}else {
		System.out.println("除數不能為0");	
		
	}
}
}