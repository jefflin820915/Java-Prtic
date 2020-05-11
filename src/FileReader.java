
//思考: 對FileReader這個類的close方法進行擴展
	//1.繼承(不推薦, 代碼耦合度太高, 不利於項目的擴展)
	//2.裝飾者模式
public class FileReader extends Reader{

	public void close() {
		System.out.println("FileReader close");
	}
}
