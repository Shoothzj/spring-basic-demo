package com.github.shoothzj.spring.basic.config;

import com.github.shoothzj.spring.basic.channel.SimpleLogRejectHandler;
import io.netty.util.concurrent.DefaultThreadFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author hezhangjian
 */
@Slf4j
public class ScheduleConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks( ScheduledTaskRegistrar taskRegistrar) {
        int threadNum = 3;
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(threadNum, new DefaultThreadFactory("Schedule Pool"), new SimpleLogRejectHandler());
        taskRegistrar.setScheduler(executor);
    }
}
