import java.util.Scanner;

public class HotelTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�w��ϥΰs���޲z�t�Σ�,�s���ж��C��p�U�ҥ�: ");
		
		//��l�ưs��
		Hotel h = new Hotel();
		
		//��X�ж��C��
		h.print();
		
		while(true) {
			System.out.println("�п�J�w�q�ж����s��:");
			
			String no = s.next();
			
			//�w�q�ж��s��
			h.order(no);
			
			//���L�s���C��
			h.print();
			
		}
		
	}
	
}
