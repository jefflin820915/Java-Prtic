/*
 * 關於八種基本數據類型的默認值
	數據類型						默認值 
	-----------------------------------------
	byte,short,int,long			0
	float,double				0.0
	boolean						false	[true是1 , false是0]
	char						\u0000
 	八種基本數據類型的默認值是一切向0看齊.
 */
public class VariableTest04 {

	//static必須加
	static int k = 1000;
	
	//變數還是遵守這個語法, 必須先聲明, 再賦值才能訪問
	//成員變數沒有手動賦值系統會默認賦值[ 局部變數不會 ]
	static int f; //成員變數
	
	public static void main(String[] args) {
		/*int i; //局部變數
		System.out.println(i); */
		
		System.out.println(k);
		
		System.out.println(f); // 0
	}
}