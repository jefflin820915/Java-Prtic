import java.text.DecimalFormat;

/*
	闽计Αて: java.text.DecimalFormat
	
		计Αじ:
			#	ヴ種计
			,	だ
			.	计翴
			0	ぃ镑干0
 */
public class NumberTest01 {

	public static void main(String[] args) {
		
		//1. 承计Αて癸禜
		//惠―:	だ
		DecimalFormat df = new DecimalFormat("###,###");
		
		//秨﹍Αて
		//Number -> String
		System.out.println(df.format(1234567)); //"1,234,567"
		
		//惠―: だ,玂痙2计
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		
		System.out.println(df1.format(1234567.123)); //1,234,567.12		
		
		
		//惠―: だ,玂痙4计,ぃ镑干0
		
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		
		System.out.println(df2.format(1234567.123)); //1,234,567.1230
	}
	
}
