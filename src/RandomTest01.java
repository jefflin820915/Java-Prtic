import java.util.Random;

/*
	�ͦ��H����
 */
public class RandomTest01 {

	public static void main(String[] args) {
		
		//�Ыؤ@�ӷs���H���ƥͦ���
		Random r = new Random();
		
		//�ͦ��@��int�H����
		//int i = r.nextInt(101); //0~100�������H����
		//System.out.println(i);
		
		for(int i = 0; i<5; i++) {
			System.out.println(r.nextInt(101));
		}

	}
	
}