
public class Hotel {
	
	//�W�w�s��: 5�h,�C�h10���ж�
	//1,2�h�O�зǶ�
	//3,4�h�O���H��
	//5�O���ض�
	
	
	//�ж�
	Room[][] rooms;
	
	//�L�Ѽ�
	Hotel() {
		
		//���h �C�h10�өж� 
		rooms = new Room[5][10];
	
		//���
		//1,2�h�зǶ�
		//3,4�h���H��
		//5�O���ض�
		for (int i = 0; i < rooms.length; i++) {
			
			for (int j = 0; j < rooms[i].length; j++) {
				
				if(i==0 || i==1) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","�зǶ�",false);
				
				}
			
				if(i==2 || i==3) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","���H��",false);
				
				}
			
				if(i==4) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","���ض�",false);
				
				}
			}
		}
	}

	//��~���Ѥ@�ӥ��L�s���ж��C��
	public void print() {
		
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
			
				System.out.print(rooms[i][j]+"  ");
			}
				System.out.println();
				
		}
	}	

	//��~���Ѥ@�ӹw�w�s������k
	public void order(String no) {
		
		for (int i = 0; i < rooms.length; i++) {
			
			for (int j = 0; j < rooms[i].length; j++) {
				
				if(rooms[i][j].getNo().equals(no)) {
					
					//�N�өж������A�令�e��
					rooms[i][j].setUse(true);
					return;
				}
			
			}
		}
	}



}
	
	
