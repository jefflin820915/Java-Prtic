
public class ShopingCarTest {

	public static void main(String[] args) {
		
		//創建購物車
		ShopingCar car = new ShopingCar();
		
		//貨物
		ShopingCarProduct p1 = new ShopingCarProduct(1000, "iphone", 10.0);
		ShopingCarProduct p2 = new ShopingCarProduct(2000, "samsung", 3.0);
		ShopingCarProduct p3 = new ShopingCarProduct(3000, "HTC", 6.0);
		ShopingCarProduct p4 = new ShopingCarProduct(4000, "ximei", 2.0);
		
		//開始購物
		car.add(p1);
		car.add(p1,3);
		
		car.add(p2,1);
		car.add(p3,2);
		car.add(p4,3);
		
		
		//打印詳單
		
		car.print();
		
		//清空
		car.clear();
		car.print();
		
	}
}
