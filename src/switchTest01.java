
public class switchTest01 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�п�J�P���X: ");
		String day = s.next();
		switch (day) {
		case "�P���@":
			System.out.println(1);
			break;
		case "�P���G":
			System.out.println(2);
			break;
		default :
			System.out.println("�L�k�T�{");
			
		}
	}
}
