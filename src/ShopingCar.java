import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//購物車

public class ShopingCar {
	
	//使用Map存儲商品條目
	Map<ShopingCarProduct,Integer> productMap;
	
	//總價
	double totalPrice;

	//構造方法
	public ShopingCar() {
		productMap = new HashMap<ShopingCarProduct, Integer>();
	}
	
	
	//對外提供方法
	//1.添加一個商品到購物車
	
	public void add(ShopingCarProduct p) {
		add(p,1);
	}
	
	//2.添加N個商品到購物車
	
	public void add(ShopingCarProduct p,int n) {
		//判斷該購物車中是否含有該商品
		if(!productMap.containsKey(p)) {	
			productMap.put(p, n);//自動裝箱
		}else {
			//車中有該商品
			int before = productMap.get(p).intValue(); //添加商品之前的該商品數量
			int after = before+n;
			productMap.put(p, after); //key重複Value覆蓋
		}
	
		//修改總價
		totalPrice += p.getPrice()*n;
	}

	//3.刪除N個商品
	public void remove(ShopingCarProduct p,int n) {
		
		int before = productMap.get(p).intValue(); 
		
		//如果購物車某商品的數量和n是相等的, 必須刪除整個條目
		if(before==n) {
			productMap.remove(p);
		}else {
			int after = before-n;
			productMap.put(p, after); 
		}

	
		//修改總價
		totalPrice -= p.getPrice()*n;
		
	}
	
	//4.刪除一個商品
	public void remove(ShopingCarProduct p) {
		remove(p, 1);
	}


	//5.清空購物車
	public void clear() {
		productMap.clear();
		totalPrice = 0.0;
	}

	//6.輸出購物車詳單
	/*
	 	格式:
	 	購物詳單:
	 		10	蘋果		10元
	 		3	西瓜		30元
	 		................
	 				總價:40...
	 */
	public void print() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("購物詳單: \n");
		
		//遍歷Map
		Set<ShopingCarProduct> keys = productMap.keySet();
		Iterator<ShopingCarProduct> it = keys.iterator();
		while(it.hasNext()) {
			ShopingCarProduct k = it.next();
			Integer v = productMap.get(k);
			sb.append("\t" + v.intValue() + "\t" + k + "\t" + v.intValue()*k.getPrice()+"\n");
		}
			sb.append("\t\t\t\t\t\t\t\t總價: " + totalPrice+"元" );
	
			
			System.out.println(sb);
	}
	
	
	
}
