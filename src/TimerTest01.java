import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
	關於定時器的應用
	作用: 每隔一段固定的時間執行一段代碼
 */
public class TimerTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.創建定時器
		Timer t = new Timer();
		
		//2.指定定時任務
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-02-05 18:32 000"), 10*1000);
		
	}
}

//指定任務
class LogTimerTask extends TimerTask{
	
	
	public void run() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}