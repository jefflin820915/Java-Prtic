/*
	�ϥ�String���ɭԧڭ����Ӫ`�N�����D, �ɶq���n���r�Ŧꥭ�Z�������ާ@
	�]���r�Ŧ�@���Ыؤ��i����, �u�n�W�c�����N�|�b�r�Ŧ�`�Ʀ����Ы�,
	�j�q���r�Ŧ��H, ���U���^�����a�Ӱ��D
 */
public class StringTest04 {

	
	public static void main(StringTest04[] args) {
		
		String[] ins = {"sport","music","food","sleep"};
		
		//�n�D�N�W��������R�n�������@�Ӧr�Ŧ�"sport,music,food,sleep"
		
		String temp = "";
		
		for (int i = 0; i < ins.length; i++) {
			if (i==ins.length-1) {
				
				temp += ins[i];
				
			}else {
				temp += ins[i] + ".";
			}
			
		}
		
			System.out.println(temp);
	}
}
