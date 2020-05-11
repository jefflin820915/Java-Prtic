
//使用BufferedReader對FileReader中的close方法進行擴展

//1.裝飾者模式中要求: 被裝飾者中含有裝飾者的引用
//2.裝飾者模式中要求: 裝飾者和被裝飾者應該實現同一個接口/類型 

public class BufferedReader extends Reader{ //BufferedReader 裝飾者

	//關聯關係
	Reader reader; //FileReader 就是被裝飾者
	
	
	//Constructor
	public BufferedReader(Reader reader) {
			this.reader = reader;
	 }

		//對FileReader中的close方法進行擴展
	public void close() {
		
		//擴展
		System.out.println("擴展代碼1");
		reader.close();
		System.out.println("擴展代碼2");
	}

}
