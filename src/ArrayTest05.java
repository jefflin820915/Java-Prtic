
/*
 *�`�J�@���Ʋ� 
 */
public class ArrayTest05 {
	
	public static void main(String[] args){
		
		//�Ыؤ@�ӼƲ�, �o�ӼƲլJ�i�H�s�xDog, �]��s�xCat
		Animal01[]  as = new Animal01[4];
		
		//���ƲըC�Ӥ������
		Dog01 d1 = new Dog01();
		Dog01 d2 = new Dog01();
		Cat01 c1 = new Cat01();
		Cat01 c2 = new Cat01();
		
		as[0] = d1;
		as[1] = d2;
		as[2] = c1;
		as[3] = c2;
		
		//�ݨD: �M���Ʋ�, ���X�C�ӹ�H, �p�G�ODog����eat��k, �p�G�OCat����move��k
	
		for (int i = 0; i < as.length; i++) {
			Animal01 a = as[i];
			
			System.out.println(a);
			
			
			//�j�������ഫ,(�V�U�૬)
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