package com.lanou.teachHomework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ������� {
/**TimerTask�������*/
	public static void main(String[] args) {

		//���ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		//��������
		Timer timer = new Timer();
		//ִ�е�������
		timer.schedule(new TimerTask() {
			//��ʱ��
			long times = 3*60*1000;
			@Override
			public void run() {
				Date date = new Date(times);
				String dataStr = sdf.format(date);
				System.out.println(dataStr);
				times -= 1000;
				if (times==0) {
					//ȡ������
					timer.cancel();
				}
			}
		},1000,1000);
	}

}
