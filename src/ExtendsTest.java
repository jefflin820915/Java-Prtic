	/*
 * ����java�y�������~��
 * 		1. �~�ӬO���V��H�T�j�S�x���@, �T�j�S�x���O�O: �ʸ�,�~��,�h�A
 * 		2. �~�Ӱ򥻪��@�άO: �N�X�_��.���O�~�ӳ̭��n���@�άO:���F�~�Ӥ~���F�H���k���л\�M�h�A����.
 * 		3. �~�ӻy�k�榡:
 * 			[�׹��ŦC��] class ���W extends �����W{
 * 				���� = �ݩ�  + ��k
 * 			}
 * 		4. java�y�������~�ӥu������~��,�@��������P���~�ӫܦh��.�u���~�Ӥ@����.�bC++������h�~��
 * 		5. �����~�Ӥ����N�y:
 * 			B���~��A��,�䤤:
 * 				A���٬�����,����,�W��,superclass
 * 				B���٬��l��,������,subclass
 * 		6. �bjava�y�����l���~�Ӥ������ǼƾکO
 * 			- �p����������~��
 * 			- �c�y��k������~��
 * 			- ��L�ƾڳ��i�H�Q�~��
 * 		7. ���Mjava�y�����u������~��,���@�����]�i�H�����ޯ��L��,�Ҧp:
 * 			C extends B{
 * 			}
 			B extends A{
 			}
 			A extends T{
 			}
 			C�����~��B��,��C�������~��T,A��.
 		8. java�~�Ӥ����]�@�����S����ܪ��~�ӥ�����,�����q�{�~��JavaSE�w�����Ѫ�java.lang.Object��
 		java�y��������@����������Object�����S�x
 */	
public class ExtendsTest {

	public static void main(String[] args) {
		/*Exception et = new Exception();
		String s = et.toString();//�o�̽sĶ�q�L,�o�����i�H�ե�toString��k,ExtendsTest������toString��k,�qObject�����~�ӹL�Ӫ�.
		System.out.println(s);*/
		
		CreditAccount act = new CreditAccount();
		act.setAotno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getAotno() + "," + act.getBalance() + "," + act.getCredit());
	}

}
