
/*
 * 實現單例模式
 * 
 * 單例模式要領
 * 	1. 構造方法私有化
 *  2. 對外提供一個公開的靜態的獲取當前類型對象的方法
 *  3. 提供一個當前一個靜態變數
 *  
 *  單例模式分為兩種:
 *  	餓漢式單例 : 在類加載階段就創建了對象
 *  	懶漢式單例 : 用到對象的時候才會創建對象
 */
public class Singletom {	//懶漢式單例

	private static Singletom s;
	
	
	//將構造方法私有化
	private Singletom() {
		
	}
	
	//對外提供一個公開提取Singletom對象的方法
	public static Singletom getSingletom() {
		
		if(s==null) {
			s = new Singletom();
		}
		
		return s;
		
	}

}
