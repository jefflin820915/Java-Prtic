
public class Buffered_File_ReaderTest {

	public static void main(String[] args) {
		
		/*
		//1.�Ы� �Q�˹���
		
		FileReader fr = new FileReader();
		
		//2.�Ыظ˹��� 
		
		BufferedReader br = new BufferedReader(fr);
		*/
		
		BufferedReader br = new BufferedReader(new FileReader());
		//3.�q�L�˹��̤�����k�����h����Q�˹��̤�����k
		
		br.close();
	}
}
