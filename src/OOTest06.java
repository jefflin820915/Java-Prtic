/*
 	需求: 
 		定義一個計算機類[電腦/筆記本]
 			型號
 			品牌
 			顏色
 			
 		定義一個學生類
 			學號
 			姓名
 			學生有一台筆記本電腦
 		
 		請編寫來表示以上的類, 然後分別將類創建為對象,對象數量不限, 讓其中一個學生使用其中一台電腦
 		
 		然後編譯並運行, 將整個執行過程用圖形方式描述
 		
 		所有的代碼寫到當前的java原文件中
 */

//測試類
public class OOTest06 {
public static void main(String[] args) {
	
	
	//創建電腦對象
	Computer computer = new Computer();
	
	//手動賦值
	//不採用默認值
	computer.brand = "ASUS";
	computer.style = "c111";
	computer.color = "red";
	
	//創建學生對象
	Student2 student = new Student2();
	
	//手動賦值
	//不採用默認值
	student.name = "student";
	student.no = 123;
	student.notepad = computer;
	
	//讓這個學生跟電腦對象產生關係
	//想知道學生電腦的品牌
	System.out.println(student.notepad.brand);

	//修改品牌
	student.notepad.brand = "apple";
	
	System.out.println(student.notepad.brand);

	//學生又買了一台新電腦, 原先的電腦扔了
	student.notepad = new Computer();
	System.out.println(student.notepad.brand);//null
}
}

//學生類
class Student2{
	
		int no;
		String name;
		Computer notepad;
}

//電腦類
class Computer{
	
	String brand;
	String style;
	String color;
	
}
