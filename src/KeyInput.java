import java.util.Scanner;

//如何接收用戶鍵盤輸入

public class KeyInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		//程序執行到此處,停下來,等待用戶的輸入
		String userInput = s.next();
		
		System.out.println("你輸入了"+userInput);
	}
}
