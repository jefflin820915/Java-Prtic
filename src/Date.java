import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * 自定義的日期類型
 * 
 * this可以用在哪裡:
 * 		1.可以使用在實例方法當中,代表當前對象[this.]
 * 		2.可以使用在構造方法當中,通過當前的構造方法調用其他的構造方法[this(實參);]
 * 
 * this()只能出現在構造函數第一行
 * 		
 */
public class Date {
	//屬性
	private int year;
	private int month;
	private int day;
	
	//setter and getter
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	 
	//構造函數
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/*
	 * 需求: 當程序員調用以下無參數的構造方法,默認創建的日期是"1970/1/1"
	 */
	public Date() {
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//以上代碼可以通過調用另一個構造方法來完成
		//但前提不能創建新對象,以下代碼表示創建一個全新的對象
		//new Date(1970,1,1);
		
		//須採用以下的語法來完成構造方法的調用
		//這種方式不會創建新的java對象,但同時又可以達到調用其他的構造方法
		this(1970, 1, 1);
	}
	
	
	//對外提供一個方法可以將日期輸出到控制台
	//實例方法
	public void print() {
		System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
	}
	
	
}
