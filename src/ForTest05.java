
/*
 *  for循環嵌套for循環
 */
public class ForTest05 {
	public static void main(String[] args) {
	
		for(int i = 1; i<=10; i++) { //共循環10次
			
			//循環體中可以編寫其它的控制語句
			//控制語句可以嵌套使用
			//控制語句可以是: if, if...else, switch, for, while, do...while
			/*
			if(){
				for(){
					while(){
						if(){
							for(){
							}
						}
					}
				}
			} 
			 */
			
			//不要想太多, 即使循環體當中是一個for循環, 不要將這個for特殊化, 也只是一個普通的for循環
			//只不過是一個符合java語法的代碼
			
			//內層循環, 內層循環中的變數名和外層循環中的變數名不能重名
			/*
			for(int i =100; ;) {
			}*/
			
			//System.out.println("i ---> " + i );
			
			//這裡是循環體, 無論這個循環體當中編寫甚麼樣的代碼, 這堆代碼也需要執行10遍.
			
			for(int j =0; j<3; j++) {
				System.out.println("j--->" + j);
			}
		
		}
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		
		//0
		//1
		//2
		for(int i = 1; i<10; i++) {
			
			//0
			//1
			//2
			
			//0
			//1
			//2
			
			//0
			//1
			//2
			for(int j = 0; j<3; j++) {
				
				//0
				//1
				//2
				for(int k = 0; k<3; k++) {
					System.out.println("k ---> " + k);
				}
			}
		}
	}

}
