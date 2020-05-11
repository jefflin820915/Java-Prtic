import java.util.Random;

/*
	生成5個不重複的隨機數
 */
public class RandomTest02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] a = new int[5];
		
		int index = 0;
		
		while(index<5) {
			
			int temp = r.nextInt(6); 
			
			//偽代碼
			if(temp!=0 && !contains(a,temp)) {
				
				a[index++] = temp;
			
			}
		}	 
	
		//遍歷
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	//該方法完成判斷temp元素在a數組中是否包含
	//包含返回true
	public static boolean contains(int[] a,int temp) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==temp) {
				return true;
			}
		}
				return false;
	
	}
}
