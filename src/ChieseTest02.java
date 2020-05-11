
public class ChieseTest02 {

	public static void main(String[] args) {
 
		//創建中國人對象1
		Chiese02 chan = new Chiese02("1","張三");
		System.out.println(chan.id + "," + chan.name + "," + Chiese02.country);
		
		//創建中國人對象2
		Chiese02 lisi = new Chiese02("2","李四");
		System.out.println(lisi.id + "," + lisi.name + "," + Chiese02.country);
		
		//創建中國人對象3
		Chiese02 wangwu = new Chiese02("3","王五");
		System.out.println(wangwu.id + "," + wangwu.name + "," + Chiese02.country);
	}

}
