/*
   需求: 
   	 假設系統給定一個人的年齡(這個年齡需要從鍵盤輸入),根據年齡來判斷這個人屬於生命的哪個階段, 年齡必須在[0-150]
   	 
   	 [0-5] 幼兒
   	 [6-10] 少兒
   	 [11-18] 少年
   	 [19-35] 青年
   	 [36-55] 中年
   	 [56-150] 老年

*/
public class IfTest01 {
	public static void main(String[] args) {
		
		//1.接收鍵盤輸入: 年齡[輸入的時候必須輸入數字]
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("請輸入年齡:"); //輸出提示訊息, 要不然用戶不知道這裡要幹嘛.
		int age = s.nextInt(); //停下來等待用戶輸入, 輸入之後自動接收, 賦值給age變數.
		System.out.println("age = " + age);
	
		//2. 根據需求進行業務邏輯判斷
		String str = "你處於生命週期的老年階段";
		if(age < 0 || age > 150) {
			str = "你輸入之年齡超出範圍";
		}else if(age <= 5){
			str = "你處於生命週期的幼兒階段";
		}else if(age <= 10) {
			str = "你處於生命週期的少兒階段";
		}else if(age <= 18) {
			str = "你處於生命週期的少年階段";
		}else if(age <= 35) {
			str = "你處於生命週期的青年階段";
		}else if(age <= 55) {
			str = "你處於生命週期的中年階段";
		}
		System.out.println(str);
	}
}
