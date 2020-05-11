import java.util.Scanner;

public class HotelTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("歡迎使用酒店管理系統ㄝ,酒店房間列表如下所示: ");
		
		//初始化酒店
		Hotel h = new Hotel();
		
		//輸出房間列表
		h.print();
		
		while(true) {
			System.out.println("請輸入預訂房間的編號:");
			
			String no = s.next();
			
			//預訂房間編號
			h.order(no);
			
			//打印酒店列表
			h.print();
			
		}
		
	}
	
}
