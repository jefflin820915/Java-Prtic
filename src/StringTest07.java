/*
	���h��F��
		1. ���h��F���O�@���W�ߪ��Ǭ�
		2. ���h��F���O�@�ئr�żҫ�, �M�����r�Ŧ�榡�ǰt��
		3.���h��F���O�q�Ϊ�
		
		�Ҧp:	���h��F��"^a(2)$" ��ܨ��a�r��,���P�� "aa"
		
		\d	�Ʀr
		\D	�D�Ʀr
		\w	�^��r��
		\W	�D�^��r��
		
		10000
 */
public class StringTest07 {
	
	public static void main(String[] args) {
		
		System.out.println("aa".matches("^a(2)$"));
		
		String s1 = "asdd33dfsdaf33ddsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
		
		//�Ndd������"��"
		System.out.println(s1.replaceAll("dd" , "��" ));
		
		//�Ndd������"��"
		System.out.println(s1.replace("d(2)" , "��"));
		
		//�N�Ʀr������"��"
		System.out.println(s1.replace("\\d", "��"));
		
		//�N�D�Ʀr������"��"
		System.out.println(s1.replaceAll("\\D", "��"));
	}
}
