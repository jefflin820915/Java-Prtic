/*
 	for循環嵌套
 */
public class ForTest06 {
	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++) { //循環10次
			
			System.out.println("begin");
			
			//這裡代碼片段執行10遍
			for(int j =0; j<1; j++) { //循環1次 輸出0
				System.out.println("j ---> " + j);
			}
		
			System.out.println("over");
		
		
		}
		/*結果:
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 */
		
		for(int i = 1; i<=5; i++) {
			System.out.println("開始");
			
			for(int j =1; j<=5; j++) {
				//System.out.println(j);
				System.out.println(i * j);
			}
			
			System.out.println("結束");
		}
		/*
		  結果:
		  	開始
		  	1	1*1
		  	2	1*2
		  	3	1*3
		  	4	1*4
		  	5	1*5
		  	結束
		  	開始
		  	1	2*1
		  	2	2*2
		  	3	2*3
		  	4	2*4
		  	5	2*5
		  	結束
		  	開始
		  	1	3*1
		  	2	3*2
		  	3	3*3
		  	4	3*4
		  	5	3*5
		  	結束
		  	開始
		  	1	4*1
		  	2	4*2
		  	3	4*3
		  	4	4*4
		  	5	4*5
		  	結束
		  	開始
		  	1	5*1
		  	2	5*2
		  	3	5*3
		  	4	5*4
		  	5	5*5
		  	結束
		 */
		
		
		
	}
}
