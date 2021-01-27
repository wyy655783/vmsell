package com.wxorder.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class LogbackTest01 {
    private final Logger logger=LoggerFactory.getLogger(LogbackTest01.class);
    @Test
    public void test(){
        logger.debug("logger日志，debug");
        logger.info("info");
    }
}
