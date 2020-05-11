/*
	java中八種基本數據類型的包裝種類
		
		基本數據類型			包裝類型
		byte				java.lang.Byte;
		short				java.lang.Short;
		int					java.lang.Integer;
		long				java.lang.Long;
		
		float				java.lang.Float;
		double				java.lang.Double;
		
		boolean				java.lang.Boolean;
		
		char				java.lang.Character;
		
		思考:	java堤共的八種數據類型不夠用嗎?為什麼java中還要提供對應的包裝類
					方便
 */
public class IntegerTest01 {
	
	
	//需求: 規定m1方法可以接收java中任何一種數據類型
	//m1方法如果想接收byte類型的數據, 可以將byte類型先包裝成java.lang.Byte;再傳遞參數
	public static void m1(Object o) {
		System.out.println(o);
	}
	
	
	//入口
	public static void main(String[] args) {
		
		//基本數據類型
		byte b = 10;
		
		//引用數據類型
		Byte b1 = new Byte(b);
		
		m1(b1); //10 Byte已經將Object中的Sring方法重寫 
	}
}	
