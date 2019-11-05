package com.github.shoothzj.spring.basic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class PostConstructService {

    @PostConstruct
    public void init() {
        log.info("init");
    }

}
