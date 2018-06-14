package com.hwh.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {
	
	private static final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate=10000)
	public void reportCurrentTime(){
		System.out.println("现在时间是："+dataFormat.format(new Date()));
	}
	
}
