
public class switchTest01 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("請輸入星期幾: ");
		String day = s.next();
		switch (day) {
		case "星期一":
			System.out.println(1);
			break;
		case "星期二":
			System.out.println(2);
			break;
		default :
			System.out.println("無法確認");
			
		}
	}
}
