/*
  	よ猭更:
  		
  		1. よ猭更嘿: Overload
  		
  		2. 或σ納ㄏノよ猭更
  			, 荷琵よ猭
  			琌: ぃ/ぃ, 荷琵よ猭ぃ,
  		
  		3. 或兵ン骸ìぇ篶Θよ猭更
  			摸讽い
  			よ猭
  			把计ぃ:
  				计秖ぃ
  				抖ぃ
  				摸ぃ
  				
  		4. よ猭更㎝或Τ闽玒, ㎝或⊿Τ闽玒
  			よ猭更㎝よ猭+把计Τ闽
  			よ猭更㎝摸礚闽
  			よ猭更㎝耿才礚闽
  			
  			
 */
public class OverloadTest03 {
	
	public static void main(String[] args) {
		m1();
		m1(10);
		
		m2(1, 2.0);
		m2(2.0, 1);
		
		m3(10);
		m3(3.0);
		
		/*
		m4(1,2);
		m4(2,1);
		*/
		
	}
	//ㄢ篶Θよ猭更
	public static void m1() {}
	public static void m1(int a) {}
	
	//ㄢ篶Θよ猭更
	public static void m2(int a,double b) {}
	public static void m2(double a,int b) {}
	
	//ㄢ篶Θよ猭更
	public static void m3(int x) {}
	public static void m3(double x) {}
	
	//岿粇:ぃ琌祇ネよ猭更,琌祇ネよ猭狡
	/*
	public static void m4(int a,int b) {}
	public static void m4(int b,int a) {}
	*/
	
	/*
	public static void x() {
	}
	
	public static int y) {
		return 1;
	}*/
	
	
	/*
	void y() {
		}
	public static void y() {
		
	}*/



}