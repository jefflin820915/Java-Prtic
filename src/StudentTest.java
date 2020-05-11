//學生測試類
public class StudentTest {
	public static void main(String[] args) {
		
		//創建學生對象
		Student s = new Student();
		
		//訪問該學生的屬性
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.sex);
		System.out.println(s.address);
		
		//實例變數不能直接採用類名的方式訪問
		//system.out.println(Student.no);
		
		s.no = 10;
		s.name = "s";
		
		//創建學生對象
		
		Student s2 = new Student();
		s2.name = "s2";
		System.out.println(s2.name);
	}

}
