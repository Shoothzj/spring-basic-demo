package com.github.shoothzj.spring.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author hezhangjian
 */
@Ignore
@Slf4j
@ComponentScan
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestBootConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestBootConfig {
}
