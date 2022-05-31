//package com.example.jdbcdemo;
//
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class QuartzConfig {
//    @Bean
//    public JobDetail myJobDetail(){
//        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
//                .withIdentity("myJob1","myJobGroup1")
//                //JobDataMap可以给任务execute传递参数
//                .usingJobData("job_param","job_param1")
//                .storeDurably()
//                .build();
//        return jobDetail;
//    }
//    @Bean
//    public Trigger myTrigger(){
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .forJob(myJobDetail())
//                .startNow()
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
//                .build();
//        return trigger;
//    }
//}
