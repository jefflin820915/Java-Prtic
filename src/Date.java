import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * �۩w�q���������
 * 
 * this�i�H�Φb����:
 * 		1.�i�H�ϥΦb��Ҥ�k��,�N���e��H[this.]
 * 		2.�i�H�ϥΦb�c�y��k��,�q�L��e���c�y��k�եΨ�L���c�y��k[this(���);]
 * 
 * this()�u��X�{�b�c�y��ƲĤ@��
 * 		
 */
public class Date {
	//�ݩ�
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
	
	 
	//�c�y���
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/*
	 * �ݨD: ��{�ǭ��եΥH�U�L�Ѽƪ��c�y��k,�q�{�Ыت�����O"1970/1/1"
	 */
	public Date() {
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//�H�W�N�X�i�H�q�L�եΥt�@�Ӻc�y��k�ӧ���
		//���e������Ыطs��H,�H�U�N�X��ܳЫؤ@�ӥ��s����H
		//new Date(1970,1,1);
		
		//���ĥΥH�U���y�k�ӧ����c�y��k���ե�
		//�o�ؤ覡���|�Ыطs��java��H,���P�ɤS�i�H�F��եΨ�L���c�y��k
		this(1970, 1, 1);
	}
	
	
	//��~���Ѥ@�Ӥ�k�i�H�N�����X�챱��x
	//��Ҥ�k
	public void print() {
		System.out.println(this.year + "�~" + this.month + "��" + this.day + "��");
	}
	
	
}
