
public class EnumTest02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		Result retValue = divide(a, b);
		
		if(retValue==Result.SUCCESS) {
			System.out.println("���\");
		}else if(retValue==Result.FAIL) {
			System.out.println("����");
		}
		
	}
	
	//��{�ݨD
	public static Result divide(int a,int b) {
		
		try {
			
			int c = a / b;
			return Result.SUCCESS; //���\
			
		} catch (Exception e) {
			return Result.FAIL; //����
		}
			
	}
}
	//�w�q�@�ӪT�|����
enum Result{
		
		//���\�M����
		//�W�d�n�D: �j�g
		SUCCESS,FAIL	//������
}

//�|�u
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}

//�C��
enum Color{
	BLUE,RED,GREEN
}