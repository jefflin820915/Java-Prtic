import java.io.StringBufferInputStream;

/*
	關於增強for的缺點: 沒有下標
 */
public class ForeachTest02 {

	public static void main(String[] args) {
		
		String[] ins = {"運動","音樂","旅遊","美食"};
		
		StringBuffer sb = new StringBuffer();
		
		
		/*
		for(int i = 0; i<ins.length;i++) {
			
			if(i==ins.length-1) { 
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		*/
		//以上的循環就不適合用增強for
		for(String s:ins) {
			sb.append(s);
			sb.append(",");
		}
		
		//擷取掉
		System.out.println(sb.substring(0,sb.length()-1));
	}
}
