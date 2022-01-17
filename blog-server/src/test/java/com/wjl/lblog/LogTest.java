package com.wjl.lblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: wjl
 * @date: 2021/12/19 21:03
 * @version: v1.0
 */
@RunWith(SpringRunner.class)
public class LogTest {

    public Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        logger.error("COLOR ERROR");
        logger.warn("COLOR WARN");
        logger.info("COLOR INFO");
        logger.debug("COLOR DEBUG");
        logger.trace("COLOR TRACE");
    }

}
