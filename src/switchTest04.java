/*
 * 假設系統給定考生成績, 請判斷該考生的成績等級:
 		1.有效成績範圍: [0-100]
 		2.考試成績可能帶有小數
 		3.考試成績和等級之間關係:
 			[90-100] A
 			[80-90]  B
 			[70-80]  C
 			[60-70]  D
 			[0-60]   E
 */
public class switchTest04 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("請輸入成績");
		double num = s.nextDouble();
		
		
		switch ((int)(num / 10)) {
		case 9 : case 10 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		case 0 : case 1: case 2: case 3: case 4: case 5:
			System.out.println("E");
			break;

		default:
			System.out.println("超出成績範圍");
		}
	}

}
