/*
 	需求:
 		判斷當前的天氣:
 			當下雨時:
 			帶雨傘:
 				判斷性別:
 					當性別為男: 帶一把大黑傘
 					當性別為女: 帶一把小花傘
 			
 			當晴天時:
 			判斷天氣的溫度:
 				當天氣溫度在30度以上: 
 					當性別為男: 戴墨鏡
 					當性別為女: 擦防曬乳
 	
 	提示: 1. 一定會用到嵌套
 		  2. 天氣狀況,溫度,性別都需要從控制台輸入
 		  		天氣狀況: 1表示下雨, 0表示晴天
 		  		溫度直接使用數字即可
 				性別: 1表示男, 0表示女
 */	
public class IfTest02 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("歡迎使用本系統, 透過本系統可以完成一些簡單的判斷");
		System.out.println("說明訊息: 1表示下雨, 0表示晴天");
		System.out.println("說明訊息: 1表示男, 0表示女");
		System.out.println("說明訊息: 溫度為數字");
		
		//接受性別
		System.out.print("請輸入性別:");
		int sex = s.nextInt();
		
		//接收天氣的狀況
		System.out.print("請輸入當前天氣狀況: ");
		int weather = s.nextInt();
		
		//判斷天氣狀況
		if(weather == 1){
			//下雨天
		//System.out.println("下雨天");
			
			if(sex == 1) {
				System.out.println("帶一把大黑傘");
			}else if(sex == 0) {
				System.out.println("帶一把小花傘");
			}else {
				System.out.println("無法確認性別");
			}
		}else if(weather == 0) {
			//晴天
		//System.out.println("晴天");
		//接收溫度
		System.out.print("請輸入溫度:");
		int tem = s.nextInt();
		if(tem > 30) {
			if(sex == 1) {
				System.out.println("戴墨鏡");
			}else if(sex == 0) {
				System.out.println("擦防曬乳");
			}else {
				System.out.println("無法確認性別");
			}
		}
		
		}else {
			System.out.println("無法確認天氣");
		}
	}
}