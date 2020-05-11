
public class Hotel {
	
	//規定酒店: 5層,每層10間房間
	//1,2層是標準間
	//3,4層是雙人間
	//5是豪華間
	
	
	//房間
	Room[][] rooms;
	
	//無參數
	Hotel() {
		
		//五層 每層10個房間 
		rooms = new Room[5][10];
	
		//賦值
		//1,2層標準間
		//3,4層雙人間
		//5是豪華間
		for (int i = 0; i < rooms.length; i++) {
			
			for (int j = 0; j < rooms[i].length; j++) {
				
				if(i==0 || i==1) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","標準間",false);
				
				}
			
				if(i==2 || i==3) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","雙人間",false);
				
				}
			
				if(i==4) {
				rooms[i][j] = new Room(((i+1)*100)+j+1+"","豪華間",false);
				
				}
			}
		}
	}

	//對外提供一個打印酒店房間列表
	public void print() {
		
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
			
				System.out.print(rooms[i][j]+"  ");
			}
				System.out.println();
				
		}
	}	

	//對外提供一個預定酒店的方法
	public void order(String no) {
		
		for (int i = 0; i < rooms.length; i++) {
			
			for (int j = 0; j < rooms[i].length; j++) {
				
				if(rooms[i][j].getNo().equals(no)) {
					
					//將該房間的狀態改成占用
					rooms[i][j].setUse(true);
					return;
				}
			
			}
		}
	}



}
	
	
