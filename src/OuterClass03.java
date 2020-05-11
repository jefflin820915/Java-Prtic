/*
 * Ы场ず场摸单Ы场跑计
 * 
 * Ы场ず场摸砐拜Ы场跑计,Ы场跑计ゲ斗ㄏノfinal耿
 */
public class OuterClass03 {
	
	//よ猭
	public void m1() {
		
		//Ы场跑计
		
		final int i = 10;
		
		//Ы场跑计摸
		//Ы场ず场摸ぃノ砐拜北舦耿才耿
		class InnerClass{
			
			
			//ず场摸ぃΤ繰篈羘
			//public static void m1() {}
			
			//Θよ猭
			public void m2() {
				System.out.println(i); //10
			}
		}
	
		//秸ノm2
		InnerClass ic = new InnerClass();
		ic.m2();
	
	}
		
		//
		public static void main(String[] args) {
			OuterClass03 oc = new OuterClass03();
			oc.m1();
			 
			
		}
}
