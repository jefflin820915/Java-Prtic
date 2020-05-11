import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 	java.util.Set;
		java.util.SortedSet; �L�Ǥ��i����, ���O�s�i�h�������i�H���Ӥ����j�p���Ǧ۰ʱƦC
			java.util.TreeSet;
 */
public class SortSetTest {

	public static void main(String[] args) throws Exception{
		
		//�Ыض��X
			SortedSet ss = new TreeSet();
			
		//�K�[����
			ss.add(10); //�۰ʸ˽c
			ss.add(20);
			ss.add(15);
			ss.add(30);
			ss.add(25);
			ss.add(9);
			
		//�M��
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
			
			//�M��
			
			it = strs.iterator();
			while(it.hasNext()) {
				Object element = it.next();
				System.out.println(element);
			}
			
			//���Date
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
	
			//�K�[
			SortedSet times = new TreeSet();
			
			times.add(t5);
			times.add(t2);
			times.add(t4);
			times.add(t1);
			times.add(t3);
			
			//�M��
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
