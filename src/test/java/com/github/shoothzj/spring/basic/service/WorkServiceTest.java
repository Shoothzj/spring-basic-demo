package com.github.shoothzj.spring.basic.service;

import com.github.shoothzj.spring.basic.TestBootConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hezhangjian
 */
@Slf4j
public class WorkServiceTest extends TestBootConfig {

    @Autowired
    private WorkService workService;

    @Test
    public void testWork() {
        workService.doWork();
    }

}
