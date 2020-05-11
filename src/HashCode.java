
public class HashCode {
	
	public static void main(String[] args) {
		
		//hashcode方法返回的是該對象的哈希碼值
		//java對象的內部地址經過哈希算法得出的int類型的數值
		HashCode hc = new HashCode();
		
		System.out.println(hc.hashCode()); //366712642
	}
}
