
/*
 * 主人類
 */

//這種方式沒有使用java語言當中的多態機制,存在缺點:Owner擴展力很差,因為只要加一個新的寵物,Owner類就要添加新的方法

/*
public class Owner02 {
		
		
		 // 主人餵養寵物方法
		 
	
		public void feed(Cat03 c) {
			c.eat();
		}


		public  void feed(Dog d) {
			d.eat();
		}

}
//Owener和Cat,Dog這兩個類型的關聯程度很強,耦合度很高,擴展力差
*/

//降低程序的耦合度[解耦合],提高程序的擴展力[軟體開發的一個重要的目標]
public class Owner02 {
	 
	//Owner主人類面向一個抽象的Pet, 不再面向具體的寵物
	//提倡: 面向抽象邊程,不要面向具體編程
	//面向抽象編程好處是,耦合度低,擴展力強
	public void feed(Pet pet) { //Pet pet是一個父類型的引用
		pet.eat();
	}
	

}
