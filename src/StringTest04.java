/*
	使用String的時候我們應該注意的問題, 盡量不要做字符串平凡的拼接操作
	因為字符串一旦創建不可改變, 只要頻繁拼接就會在字符串常數池中創建,
	大量的字符串對象, 給垃圾回收器帶來問題
 */
public class StringTest04 {

	
	public static void main(StringTest04[] args) {
		
		String[] ins = {"sport","music","food","sleep"};
		
		//要求將上面的興趣愛好拼接成一個字符串"sport,music,food,sleep"
		
		String temp = "";
		
		for (int i = 0; i < ins.length; i++) {
			if (i==ins.length-1) {
				
				temp += ins[i];
				
			}else {
				temp += ins[i] + ".";
			}
			
		}
		
			System.out.println(temp);
	}
}
