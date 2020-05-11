import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/*
	boolean remove(Object o);
	
	remove和cotains方法都需要集合中的元素重寫equals方法, 
	因為Object中的equals方法比較內存地址,在現實的業務邏輯當中
	不能比較內存地址,該比較內容.
 */
public class CollectionTest04 {

	public static void main(String[] args) {
		
		//創建集合對象
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(10);
		
		//添加元素
		
		c.add(i1);
		
		//刪除
		Integer i2 = new Integer(10);
		c.remove(i2);
		
		System.out.println(c.size()); //0
	
		Manager m1 = new Manager(100, "SMITH");
		c.add(m1);
		
	
		Manager m2 = new Manager(100, "SMITH");
		c.remove(m2);
		
		System.out.println(c.size()); //0
	

		
		
		
		

		HashSet<Integer> num = new HashSet<>();
		Random random = new Random();
		
		while(num.size() < 4) {
			num.add((int)(random.nextInt(49))+1);
			System.out.println(num);

		}
		
		int i = 0;
		int[] ret = new int[4];
		for (Integer nums : num) {
			ret[i] = nums;
			i++;
			System.out.println(nums);
		}

		
		
		
		
		
		
		
		
		
		
		
	
	}

}
