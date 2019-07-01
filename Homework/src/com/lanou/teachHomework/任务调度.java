package com.lanou.teachHomework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class 任务调度 {
/**TimerTask任务调度*/
	public static void main(String[] args) {

		//日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		//构建对象
		Timer timer = new Timer();
		//执行调度任务
		timer.schedule(new TimerTask() {
			//总时间
			long times = 3*60*1000;
			@Override
			public void run() {
				Date date = new Date(times);
				String dataStr = sdf.format(date);
				System.out.println(dataStr);
				times -= 1000;
				if (times==0) {
					//取消任务
					timer.cancel();
				}
			}
		},1000,1000);
	}

}
