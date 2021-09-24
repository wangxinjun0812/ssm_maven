package com.ssm.wxj.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SyncData {
    //@Scheduled(fixedRate = 1000*5)每隔5秒执行一次
    @Scheduled(cron="0/5 * * * * ? ") //每分钟开始，每5秒执行一次
    public void test(){
        System.out.println("定时任务开始啦，哈哈哈");
        System.out.println("<<<---------结束执行HR数据同步任务--------->>>");
    }

}
