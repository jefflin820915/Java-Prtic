
public class switchTest02 {
	public static void main(String[] args) {
		
		//char c = 'A';
		char c = 'B';
		//char c = 'C';
		//char c = 44;
		//char c = 'D';
		
		switch(c) {
		case 'A' :
			System.out.println("高級");
			break;
		case 'B' :
			System.out.println("中級");
			break;
		case 'C' :
			System.out.println("初級");
			break;
		default :
			System.out.println("無法確認");
		}
	
		
		switch(c) {
		case 'A' :
			System.out.println("高級");
			break;
		case 66 :
			System.out.println("中級");
			break;
		case 'C' :
			System.out.println("初級");
			break;
		default :
			System.out.println("無法確認");
		}
		
		
	}

}
