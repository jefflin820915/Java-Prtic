
	/*
 *  ���f�]�O�@�Ӥޥ�����, �i�H���P�ݰ���
 *  	1. �p��w�q���f
 *  		[�׹���] interface ���f�W {}
 *  
 *  	2. ���f������X�{�`��,��H��k 
 *  
 *  	3. ���f���O�@�ӯS����H��,�S��b���f�O�©�H��.
 *  
 *  	4. ���f���S���c�y��k,���f�]�L�k�Q��Ҥ�
 *  	
 *  	5. ���f�M���f�����i�H�h�~��
 *  	
 *  	6. 1�����i�H��{�h�ӱ��f.(�o�̪���{�i�H���P�ݰ��~��)
 *  
 *  	7. �@�ӫD��H������{���f,�ݭn�N���f���Ҧ�����k"��{/���g/�л\"
 */
public interface Interface {
	
	//�`�q(�����ϥ�public static final�׹�)
	public static final String SUCCESE = "succese";
	public static final double PI = 3.14;
	
	//public static final�i�H�ٲ�
	byte MAN_VALUE = 127;//�`��
	
	//��H��k(���f���Ҧ�����H��k���Opublic abstract)
	public abstract void m1();
	
	//public abstract�O�i�H�ٲ���
	void m2();
	
}

interface F{
	void m1();
}

interface G{
	void m2();
}

interface H{
	void m3();
}

interface E extends F,G,H{
	void m4();	
}

//implements�O��{���N��,�O�@������r
//implements�Mextends�N�q�ۦP
class MyClass implements F,G{

	public void m2() {
		
		
	}

	public void m1() {
		
	}
	
}

class J implements E{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
}