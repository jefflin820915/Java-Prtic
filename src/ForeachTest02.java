import java.io.StringBufferInputStream;

/*
	����W�jfor�����I: �S���U��
 */
public class ForeachTest02 {

	public static void main(String[] args) {
		
		String[] ins = {"�B��","����","�ȹC","����"};
		
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
		//�H�W���`���N���A�X�μW�jfor
		for(String s:ins) {
			sb.append(s);
			sb.append(",");
		}
		
		//�^����
		System.out.println(sb.substring(0,sb.length()-1));
	}
}
