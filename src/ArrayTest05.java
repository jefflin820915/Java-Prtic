
/*
 *深入一維數組 
 */
public class ArrayTest05 {
	
	public static void main(String[] args){
		
		//創建一個數組, 這個數組既可以存儲Dog, 也能存儲Cat
		Animal01[]  as = new Animal01[4];
		
		//給數組每個元素賦值
		Dog01 d1 = new Dog01();
		Dog01 d2 = new Dog01();
		Cat01 c1 = new Cat01();
		Cat01 c2 = new Cat01();
		
		as[0] = d1;
		as[1] = d2;
		as[2] = c1;
		as[3] = c2;
		
		//需求: 遍歷數組, 取出每個對象, 如果是Dog執行eat方法, 如果是Cat執行move方法
	
		for (int i = 0; i < as.length; i++) {
			Animal01 a = as[i];
			
			System.out.println(a);
			
			
			//強制類型轉換,(向下轉型)
			if(a instanceof Cat01) {
				Cat01 c = (Cat01)a;
				c.move();
			}else if(a instanceof Dog01) {
				Dog01 d = (Dog01)a;
				d.eat();
			}
		}
	
	}
}

class Animal01{
	
}

class Dog01 extends Animal01{
	
	public void eat() {
		System.out.println("Dog eat");
	}
}

class Cat01 extends Animal01{
	
	public void move() {
		System.out.println("Cat move");
	}
}