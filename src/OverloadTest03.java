/*
  	��k����:
  		
  		1. ��k�����S�٬�: Overload
  		
  		2. �ƻ�ɭԦҼ{�ϥΤ�k����
  			�\��ۦ����ɭ�, �ɥi������k�W�ۦP
  			���O: �\�ण�P/���ۦ����ɭ�, �ɥi������k�W���P,
  		
  		3. �ƻ���󺡨�����c���F��k����
  			�b�P�@������
  			��k�W�ۦP
  			�ѼƦC���P:
  				�ƶq���P
  				���Ǥ��P
  				�������P
  				
  		4. ��k�����M�ƻ����Y, �M�ƻ�S�����Y
  			��k�����M��k�W+�ѼƦC����
  			��k�����M��^�������L��
  			��k�����M�׹��ŦC��L��
  			
  			
 */
public class OverloadTest03 {
	
	public static void main(String[] args) {
		m1();
		m1(10);
		
		m2(1, 2.0);
		m2(2.0, 1);
		
		m3(10);
		m3(3.0);
		
		/*
		m4(1,2);
		m4(2,1);
		*/
		
	}
	//�H�U��Ӻc����k����
	public static void m1() {}
	public static void m1(int a) {}
	
	//�H�U��Ӻc����k����
	public static void m2(int a,double b) {}
	public static void m2(double a,int b) {}
	
	//�H�U��Ӻc����k����
	public static void m3(int x) {}
	public static void m3(double x) {}
	
	//���~:�H�U���O�o�ͤ�k����,�O�o�ͤ�k����
	/*
	public static void m4(int a,int b) {}
	public static void m4(int b,int a) {}
	*/
	
	/*
	public static void x() {
	}
	
	public static int y) {
		return 1;
	}*/
	
	
	/*
	void y() {
		}
	public static void y() {
		
	}*/



}