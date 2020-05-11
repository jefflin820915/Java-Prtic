/*
	タ玥笷Α
		1. タ玥笷Α琌縒ミ厩
		2. タ玥笷Α琌贺才家, 盡暗才﹃Αで皌
		3.タ玥笷Α琌硄ノ
		
		ㄒ:	タ玥笷Α"^a(2)$" ボㄢa才,单 "aa"
		
		\d	计
		\D	獶计
		\w	璣ゅダ
		\W	獶璣ゅダ
		
		10000
 */
public class StringTest07 {
	
	public static void main(String[] args) {
		
		System.out.println("aa".matches("^a(2)$"));
		
		String s1 = "asdd33dfsdaf33ddsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
		
		//盢dd蠢传"い"
		System.out.println(s1.replaceAll("dd" , "い" ));
		
		//盢dd蠢传Θ"い"
		System.out.println(s1.replace("d(2)" , "い"));
		
		//盢计蠢传Θ"い"
		System.out.println(s1.replace("\\d", "い"));
		
		//盢獶计蠢传"い"
		System.out.println(s1.replaceAll("\\D", "い"));
	}
}
