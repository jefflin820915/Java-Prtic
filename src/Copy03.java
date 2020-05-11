import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
	使用BufferedReader和BufferedWriter完成複製
 */
public class Copy03 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/TEST/eclipse-workspace/123/src/Copy03.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/Copy03.java"));
		
		String temp = null;
		
		while((temp=br.readLine())!=null) {
			bw.newLine();
			bw.write(temp);
			
		}
		 
		bw.flush();
		br.close();
		bw.close();
	}
}