/*
 * �h�A�b��ڶ}�o���@��,�H�U�H�D�H���i�d�����һ����h�A���@��
 * 1. ���R:�D�H���i�d���o�ӳ����n��{�ݭn�i����������H:
 * 		-�D�H[��]
 * 		-�D�H�i�H���i�d��,�ҥH�D�H�����i���ʧ@
 * 		-�d��[��]
 * 		-�d���i�H�Y�F��,�ҥH�d�����Y�F�誺�ʧ@
 * 2. ���V��H�s�{���֤�: �w�q�n��,�M��N����ҤƬ���H,���@�������X�Ϥ@�U,���U�ӹ�H������@�_�ӧΦ��@�Өt��
 
 * 3. �h�A���@�άO�ƻ�?
 * 		���C�{�Ǫ����X��,�����{�Ǫ��X�i�O
 * 		��ϥΦh�A�ɶq�ϥΦh�A
 * 		�������ޥΫ��V�l������H
 * 
 * 
 * �֤�: ���V��H�s�{,�ɶq���n���V����s�{
 *
 */
public class Test08 {
	public static void main(String[] args) {
		//�ЫإD�H��H
		Owner02 ow = new Owner02();
		
		//�Ыؿ߹�H
		//Cat03 c = new Cat03();
		
		//�D�H���i��
		//ow.feed(c);
		ow.feed(new Cat03());
	
		//�Ыت���H
		//Dog d = new Dog();
		
		//�D�H���p��
		//ow.feed(d);
		ow.feed(new Dog());
		
		//�ЫسD��H
		Snack snack = new Snack();
		//�D�H���i
			ow.feed(snack);
	}
}
