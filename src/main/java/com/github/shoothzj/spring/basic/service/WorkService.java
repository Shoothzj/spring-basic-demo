package com.github.shoothzj.spring.basic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author hezhangjian
 */
@Slf4j
@Service
public class WorkService {

    public void doWork() {
        log.info("do work");
    }

}
