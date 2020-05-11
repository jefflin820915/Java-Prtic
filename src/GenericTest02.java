import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	泛型語法如何實現
	泛型是一個編譯階段的語法
	在編譯階段統一集合中的類型
 */
public class GenericTest02 {

	public static void main(String[] args) {
		
		//創建一個List集合,只能存儲字符串類型
		List<String> strs = new ArrayList<String>();
		
		//添加元素
		//Error
		//strs.add(1);
		
		strs.add("JACK");
		strs.add("SUN");
		strs.add("KING");
		strs.add("SMITH");
		
		//遍歷
		Iterator<String> it = strs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}
}
