import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/*
	boolean remove(Object o);
	
	remove�Mcotains��k���ݭn���X�����������gequals��k, 
	�]��Object����equals��k������s�a�},�b�{�ꪺ�~���޿��
	���������s�a�},�Ӥ�����e.
 */
public class CollectionTest04 {

	public static void main(String[] args) {
		
		//�Ыض��X��H
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(10);
		
		//�K�[����
		
		c.add(i1);
		
		//�R��
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
