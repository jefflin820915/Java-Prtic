import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
	����w�ɾ�������
	�@��: �C�j�@�q�T�w���ɶ�����@�q�N�X
 */
public class TimerTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.�Ыةw�ɾ�
		Timer t = new Timer();
		
		//2.���w�w�ɥ���
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-02-05 18:32 000"), 10*1000);
		
	}
}

//���w����
class LogTimerTask extends TimerTask{
	
	
	public void run() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}