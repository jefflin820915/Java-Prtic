
public class ChieseTest {

	public static void main(String[] args) {
 
		//創建中國人對象1
		Chiese chan = new Chiese("1","張三","中國");
		System.out.println(chan.id + "," + chan.name + "," + chan.country);
		
		//創建中國人對象2
		Chiese lisi = new Chiese("2","李四","中國");
		System.out.println(lisi.id + "," + lisi.name + "," + lisi.country);
		
		//創建中國人對象3
		Chiese wangwu = new Chiese("3","王五","中國");
		System.out.println(wangwu.id + "," + wangwu.name + "," + lisi.country);
	}

}
