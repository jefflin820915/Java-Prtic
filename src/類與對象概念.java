
//�w�q�@����, ���W:���P��H����
//���P��H�����O�@����, �N��Ҧ����ǥ͹�H, �O�@�ӾǥͼҪO
public class ���P��H���� { //�w�q�@�Ӥ��}����,�@�_�W,���P��H����
	//�ݩ�
	//�ݩʳq�`�ĥ��ܼƪ��覡�өw�q
	//�b�����, ��k�餧�~�w�q���ܼƳQ�٬�"�����ܼ�"
	//�����ܼƨS�����, �t���q�{���: �@���V0�ݻ�
	
	//�Ǹ�
	int no;
	
	//�m�W
	String name;
	
	//�ʧO
	boolean sex;
	
	//�~��
	int age;
	
	//��}
	String address;
	
	//��k
	//��k�y�z���O��H���ʧ@�T��
	//��e�Ҥl�N�u�y�z�ݩ�, ���y�z��k
/*
 	*���V��H���T�j�S�x
 		�ʸ�
 		�~��
 		�h�A
 	
 	�Ҧ����V��H���y�������o�T�j�S�x.
 	
 	�ĥέ��V��H���覡�}�o�@�ӳn��, �ͩR�g����: [��ӥͩR�g�����e��ϥ�OO���V��H�覡
 	
 		���V��H�����R: OOA
 		���V��H���]�p: OOD
 		���V��H���s�{: OOP
 	
 	*���M��H������
 		
 		�ƻ�O��
 			���b�{��@�ɷ��O���s�b��, �O�@�ӼҪO, �O�@�ӷ���,�H���j����ҩ�H�����G
 			���N��F�@���ƪ�
 			�b�{��@�ɷ�, ��HA��HB�������@�P�S�x, �i���H�`���X�@�ӼҪO,�o�ӼҪO
 			�Q�٬���
 		
 		�ƻ�O��H
 			��H�O��ڦs�b������, �{��@�ɷ���ڦs�b
 			
 		�y�z�@�U��ӳn��}�o���L�{
 			���[��{��@��, �q�{��@�ɷ��M���H
 			�M��FN�h�ӹ�H��, �o�{�Ҧ�����H�����@�P�S�x
 			�b�j�����Φ��F�@�ӼҪO[��]
 			�i�H�q�Ljava�N�X�Ӫ�z�@����
 			java�����F�����w�q
 			�M��q�L���i�H�Ыع�H
 			���F��H��,�i�H����H������@�_�ӧΦ��@�Өt��
 			
 		��--[��Ҥ�]-->��H
 		
 		��H�S�Q�ٹ��
 		
 		��H--[��H]-->��
 		
 		���I:
 			���y�z���O��H���@�P�S�x
 			�@�P�S�x�Ҧp: �����S�x
 			�o�Ө����S�x�b�X�ݪ��ɭ�, �������Ыع�H, �q�L��H�h�X�ݯS�x
 			�]���o�ӯS�x���骺�Y�ӹ�H�W����, �Ȥ��P ��������1.8m, ����
 			��H����2.8m
 			
 		�@�����D�n�y�z���O ���A + �ʧ@
 		���A�T��: �W�r, ����, �ʧO, �~��
 		�ʧ@�T��: �Y, �ۺq, ���R, �ǲ�
 		
 		���A--> �@�������ݩ�
 		�ʧ@--> �@��������k
 		
 		��{
 			�ݩ�; //�y�z��H�����A�T��
 			��k; //�y�z��H���ʧ@�T��
 		  }
 	
 		���A�M�ʧ@������Y�ӹ�H�W����,�o�{�̲ת����G�i�ण�@��.
 		��H�M��H�������@�P�S�x, ���O������H���ᦳ�ƾڪ��t��
 		
 	*�����w�q
 		�y�k���c:
 			[�׹��ŦC��] class ���W {
 				�ݩ�;
 				��k;
 			}
 		
 		�ǥ���, �y�z�Ҧ��ǥ͹�H���@�P�S�x:
 			�ǥ͹�H�����Ǫ��A�T��:
 				�Ǹ� [int]
 				�W�r [String]
 				�ʧO [boolean]
 				�~��	 [int][�~�֬O�@���ݩ�, �~�֬O�@�Ӽƾ�, �O�ƾڴN���Ӧ��ƾ�����]
 				��}  [String]
 				....
 				
 			�ǥ͹�H�����ǰʧ@�T��
 				�Y�� 
 				��ı
 				�ǲ�
 				��
 				�ۺq
 				���R
 				....
 			
 			�ݩʳq�`�O�ĥΤ@���ܼƪ��Φ��ӧ����w�q��
 			int age;
 			String name;
 			String address;
 			boolean sex;
 			int no;
 		
 		java�y�����]�A��ؼƾ�����:
 			�򥻼ƾ�����
 			byte
 			short
 			int
 			long
 			float
 			double
 			boolean
 			char
 			
 			�ޥμƾ�����
 			String.class SUN����
 			System.class SUN����
 			
 			Student.class �۩w�q
 			User.class	     �۩w�q
 			Product.class �۩w�q
 			Customer.class�۩w�q
 			....
 			
 			int age = 10;
 			String username = "TzuEn";
 			student s = ???;
 			
 		java�y�����Ҧ���class���ݩ�ޥμƾ�����
 */
}
