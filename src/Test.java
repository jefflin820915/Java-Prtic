
public class Test {
	public static void main(String[] args) {
		//思路
		//先創造人對象
		Owner  owner = new Owner();
		//不採用系統默認值
		//手動賦值
		
		owner.id = "456789110";
		owner.name = "owner";
		owner.sex = true;
		owner.age = 100;
		
		//再創造別墅對象
		bigHouse bigHouse = new bigHouse();
		
		//不採用系統默認值
		//手動賦值
		bigHouse.area = 500.0;
		
		//讓別墅有主人
		bigHouse.owner = owner;
		
		//想知道房子主人的名字是甚麼?
		System.out.println(bigHouse.owner.name);
	
		//房子換主人了
		//先創建一個新的主人對象
		Owner owner2 = new Owner();
		owner2.name = "owner2";
		
		//換主人
		bigHouse.owner = owner2;
		
		//想知道房子主人的名字是甚麼?
		System.out.println(bigHouse.owner.name);
		
	
	}
}
