import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 	java.util.Set;
		java.util.SortedSet; 無序不可重複, 但是存進去的元素可以按照元素大小順序自動排列
			java.util.TreeSet;
 */
public class SortSetTest {

	public static void main(String[] args) throws Exception{
		
		//創建集合
			SortedSet ss = new TreeSet();
			
		//添加元素
			ss.add(10); //自動裝箱
			ss.add(20);
			ss.add(15);
			ss.add(30);
			ss.add(25);
			ss.add(9);
			
		//遍歷
			Iterator it = ss.iterator();
			while(it.hasNext()) {
				Object element = it.next();
				System.out.println(element);
			}
		
		//String
			SortedSet strs = new TreeSet();
			
			strs.add("JACK");
			strs.add("SUN");
			strs.add("LUCY");
			strs.add("KING");
			
			//遍歷
			
			it = strs.iterator();
			while(it.hasNext()) {
				Object element = it.next();
				System.out.println(element);
			}
			
			//日期Date
			String st1 = "2008-08-08";
			String st2 = "2009-08-08";
			String st3 = "2008-09-08";
			String st4 = "2008-08-09";
			String st5 = "2012-08-08";
		
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			Date t1 = sdf.parse(st1);
			Date t2 = sdf.parse(st2);
			Date t3 = sdf.parse(st3);
			Date t4 = sdf.parse(st4);
			Date t5 = sdf.parse(st5);
	
			//添加
			SortedSet times = new TreeSet();
			
			times.add(t5);
			times.add(t2);
			times.add(t4);
			times.add(t1);
			times.add(t3);
			
			//遍歷
			it = times.iterator();
			while(it.hasNext()) {
				Object element = it.next();	
				if(element instanceof Date) {
					Date d = (Date)element;
					System.out.println(sdf.format(d));
				}
				
			}
			
	
	}
}
