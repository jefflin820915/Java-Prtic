
public class OOTest04 {
	public static void main(String[] args) {
	
		//�Ыؤ@�ӤV�ҹ�H
		Husband husband = new Husband();
		husband.name = "husband";
		
		//�Ыؤ@�өd�l��H
		
		Wife wife = new Wife();
		wife.name = "wife";
		 
		//���B[��q�L�V�ҧ��d�l, �q�L�d�l�]�i�H���V��]
		husband.w = wife;
		wife.h = husband;
		
		//�o��H�W"husband"���d�l�W��
		System.out.println(husband.name + "�d�l���W�r�s: " + wife.name);
		System.out.println(husband.name + "�d�l���W�r�s: " + husband.w.name);
	}
}
