/*
 	for�`���O�M
 */
public class ForTest06 {
	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++) { //�`��10��
			
			System.out.println("begin");
			
			//�o�̥N�X���q����10�M
			for(int j =0; j<1; j++) { //�`��1�� ��X0
				System.out.println("j ---> " + j);
			}
		
			System.out.println("over");
		
		
		}
		/*���G:
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 		begin
		 		0
		 		over
		 */
		
		for(int i = 1; i<=5; i++) {
			System.out.println("�}�l");
			
			for(int j =1; j<=5; j++) {
				//System.out.println(j);
				System.out.println(i * j);
			}
			
			System.out.println("����");
		}
		/*
		  ���G:
		  	�}�l
		  	1	1*1
		  	2	1*2
		  	3	1*3
		  	4	1*4
		  	5	1*5
		  	����
		  	�}�l
		  	1	2*1
		  	2	2*2
		  	3	2*3
		  	4	2*4
		  	5	2*5
		  	����
		  	�}�l
		  	1	3*1
		  	2	3*2
		  	3	3*3
		  	4	3*4
		  	5	3*5
		  	����
		  	�}�l
		  	1	4*1
		  	2	4*2
		  	3	4*3
		  	4	4*4
		  	5	4*5
		  	����
		  	�}�l
		  	1	5*1
		  	2	5*2
		  	3	5*3
		  	4	5*4
		  	5	5*5
		  	����
		 */
		
		
		
	}
}
