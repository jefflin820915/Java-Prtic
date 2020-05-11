/*
  if語句
 */
public class IfTest03 {
	public static void main(String[] args) {
		
		boolean sex = true;
		if(sex){
			System.out.println("男");
		}else {
			System.out.println("女");
		}
	
		sex = false;
		
		if(sex) System.out.println("男"); else System.out.println("女");
		
		//-----------------------------------------------------------------
		
		if(sex)
			System.out.println("男");
			System.out.println("呵呵");
		//else 
			//System.out.println("女");
	 
		//以上程序錯誤出現在else, else以上沒有錯誤
	}

}
 